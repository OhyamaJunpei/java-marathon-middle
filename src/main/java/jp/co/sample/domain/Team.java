package jp.co.sample.domain;


/**
 * チーム情報を表すドメイン.
 * 
 * @author junpei.oyama
 *
 */
public class Team {

	/** id */
	private Integer id;
	/** リーグ名 */
	private String leagueName;
	/** チーム名 */
	private String teamName;
	/** 本拠地名 */
	private String headquaters;
	/** 設立日 */
	private String inauguration;
	/** 歴史 */
	private String history;
	
	/** getter,setter */
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLeagueName() {
		return leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getHeadquaters() {
		return headquaters;
	}
	public void setHeadquaters(String headquaters) {
		this.headquaters = headquaters;
	}
	public String getInauguration() {
		return inauguration;
	}
	public void setInauguration(String inauguration) {
		this.inauguration = inauguration;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	
}
