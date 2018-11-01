package jp.co.sample.form;

/**
 * リクエストパラメータを受け取るためのformクラス.
 * 
 * @author junpei.oyama
 *
 */
public class HotelForm {
	
	/** ホテル名 */
	private String hotelName;
	/** 最寄り駅 */
	private String nearestStation;
	/** 価格 */
	private Integer price;
	
	/** getter,setter */
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getNearestStation() {
		return nearestStation;
	}
	public void setNearestStation(String nearestStation) {
		this.nearestStation = nearestStation;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}

}
