package jp.co.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 入出力画面へフォワードするコントローラ.
 * 
 * @author junpei.oyama
 *
 */
@Controller
@RequestMapping("/hotel")
public class HotelController {
	
	/**
	 * 入力画面を表示
	 * 
	 * @return　入力画面
	 */
	@RequestMapping("/index")
	public String index() {
		return "hotelIndex";
	}
	
	@RequestMapping("/result")
	public String result() {
		return "hotelResult";
	}
	
}
