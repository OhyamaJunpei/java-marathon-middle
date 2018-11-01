package jp.co.sample.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Hotel;
import jp.co.sample.form.HotelForm;
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
	 * springのformタグを使うためのメソッド.
	 * 
	 * @return インスタンス化されたHotelForm
	 */
	@ModelAttribute
	public HotelForm setUpForm() {
		return new HotelForm();
	}
	
	/**
	 * 入力画面を表示.
	 * 
	 * @return　入力画面
	 */
	@RequestMapping("/index")
	public String index() {
		return "hotelIndex";
	}
	
	/**
	 * 出力画面を表示.
	 * 
	 * @param price 価格
	 * @param model　モデル
	 * @return　出力画面
	 */
	@RequestMapping("/search")
	public String search(HotelForm form, Model model) {
		
		Hotel hotel = new Hotel();
	    BeanUtils.copyProperties(form, hotel);
	    
	    List<Hotel> hotelList = repository.findByLessThanPrice(hotel.getPrice());
	    
	    model.addAttribute("hotelList", hotelList);
		
		return "hotelIndex";
	}
	
}
