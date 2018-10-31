package jp.co.sample.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import jp.co.sample.domain.Team;

/**
 * リポジトリ.
 * 
 * @author junpei.oyama
 *
 */
@Repository
public class TeamRepository {

	/** NamedParameterJdbcTemplateをDI */
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	/** RowMapperを定義 */
	private static final RowMapper<Team> TEAM_ROW_MAPPER = (rs, i) -> {
		Team team = new Team();
		team.setId(rs.getInt("id"));
		team.setLeagueName(rs.getString("league_name"));
		team.setTeamName(rs.getString("team_name"));
		team.setHeadquaters(rs.getString("headquaters"));
		team.setInauguration(rs.getString("inauguration"));
		team.setHistory(rs.getString("history"));
		return team;
	};
	
	/**
	 * チーム情報一覧を取得する.
	 * @return チーム情報一覧
	 */
	public List<Team> findAll() {
		List<Team> teams = template.query(
				"SELECT id, league_name, team_name, headquaters, inauguration, history FROM baseball_teams ORDER BY id",
				TEAM_ROW_MAPPER);
		return teams;
	}
	
	/**
	 * 主キー検索を行うload()メソッドを定義
	 * 
	 * @param id Teamのid
	 * @return 検索されたteam
	 * 
	 */
	public Team load(Integer id) {
		
		String sql = "SELECT id, league_name, team_name, headquaters, inauguration, history FROM baseball_teams WHERE id=:id";
		
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		
		Team team = template.queryForObject(sql, param, TEAM_ROW_MAPPER);
		
		return team;
		
	}
	
}
