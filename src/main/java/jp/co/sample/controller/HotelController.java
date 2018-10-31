package jp.co.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Hotel;
import jp.co.sample.repository.HotelRepository;

/**
 * 入出力画面へフォワードするコントローラ.
 * 
 * @author junpei.oyama
 *
 */
@Controller
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	private HotelRepository repository;
	
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
	public String result(Integer price, Model model) {
		
		List<Hotel> hotelList = repository.findByPrice(price);
		
		model.addAttribute(hotelList);
		
		return "hotelResult";
	}
	
}
