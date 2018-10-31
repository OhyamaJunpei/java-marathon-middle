package jp.co.sample.form;

/**
 * Springのformタグを使うためのformクラス.
 * 
 * @author junpei.oyama
 *
 */
public class ClothesForm {
	
	/** 性別 */
	private Integer gender;
	/** 色 */
	private Integer color;
	
	/** getter,setter */
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Integer getColor() {
		return color;
	}
	public void setColor(Integer color) {
		this.color = color;
	}
}

