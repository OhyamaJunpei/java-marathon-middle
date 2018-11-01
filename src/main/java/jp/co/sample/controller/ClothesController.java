package jp.co.sample.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.co.sample.domain.Clothes;
import jp.co.sample.form.ClothesForm;
import jp.co.sample.repository.ClothesRepository;

/**
 * 入出力画面にフォワードするコントローラ.
 * 
 * @author junpei.oyama
 *
 */
@Controller
@RequestMapping("/clothes")
public class ClothesController {
	
	/** 利用するリポジトリをDI */
	@Autowired
	private ClothesRepository repository;
	
	@ModelAttribute
	public ClothesForm setUpForm() {
		return new ClothesForm();
	}
	
	@RequestMapping("/index")
	public String index(Model model) {
		
		Map<Integer,String> colorMap = new LinkedHashMap<>();
		colorMap.put(1, "赤");
		colorMap.put(2, "青");
		colorMap.put(3, "黄");
		colorMap.put(4, "白");
		
		model.addAttribute("colorMap", colorMap);
		
		return "indexShop";
	}
	
//	@RequestMapping("/search")
//	public String search(ClothesForm form, RedirectAttributes redirectAttributes) {
//		
//		Clothes clothes = new Clothes();
//		
//		clothes.setGender(form.getGender());
//		clothes.setColor(form.getColor());
//		
//	}
	
}

