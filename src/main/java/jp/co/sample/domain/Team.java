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
	private String league_name;
	/** チーム名 */
	private String team_name;
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
	public String getLeague_name() {
		return league_name;
	}
	public void setLeague_name(String league_name) {
		this.league_name = league_name;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
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
