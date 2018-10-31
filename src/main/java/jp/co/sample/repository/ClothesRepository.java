package jp.co.sample.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import jp.co.sample.domain.Clothes;


/**
 * 洋服を検索するメソッドを持ったリポジトリ.
 * 
 * @author junpei.oyama
 *
 */
@Repository
public class ClothesRepository {
	
	/** DB操作を行なうためNamedParameterJdbcTemplateをDI */
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<Clothes> CLOTHES_ROW_MAPPER = (rs, i) -> {
		Clothes clothes  = new Clothes();
		clothes.setId(rs.getInt("id"));
		clothes.setCategory(rs.getString("category"));
		clothes.setGenre(rs.getString("genre"));
		clothes.setGender(rs.getInt("gender"));
		clothes.setColor(rs.getString("color"));
		clothes.setPrice(rs.getInt("price"));
		clothes.setSize(rs.getString("size"));
		return clothes;
	};
	
	/**
	 * 条件を指定して洋服を検索するメソッド.
	 * 
	 * @param gender 性別
	 * @param color　色
	 * @return　条件にあった洋服の情報が格納されたリスト
	 */
	public List<Clothes> find(Integer gender, String color){
		
		String sql = "SELECT id, category, genre, gender, color, price, size FROM shops WHERE gender=:gender AND Color=:color ";
		
		SqlParameterSource param = new MapSqlParameterSource().addValue("gender", gender).addValue("color", color);
		
		List<Clothes> clothesList = template.query(sql, param, CLOTHES_ROW_MAPPER);
		
		return clothesList;
	}
	
}
