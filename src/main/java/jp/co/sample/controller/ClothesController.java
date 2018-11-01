package jp.co.sample.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	/**
	 * 検索画面を出力.
	 * 
	 * @param model モデル
	 * @return　初期画面
	 */
	@RequestMapping("/index")
	public String index(Model model) {
		
		Map<Integer,String> colorMap = new LinkedHashMap<>();
		colorMap.put(1, "赤");
		colorMap.put(2, "青");
		colorMap.put(3, "黄");
		colorMap.put(4, "白");
		
		model.addAttribute("colorMap", colorMap);

		return "ShopIndex";
	}
	
	/**
	 * 検索結果を表示.
	 * 
	 * @param form フォーム
	 * @param model　モデル
	 * @return　初期画面にフォワード
	 */
	@RequestMapping("/search")
	public String search(ClothesForm form, Model model) {
		
		Clothes clothes = new Clothes();
		BeanUtils.copyProperties(form, clothes);
		
		switch(form.getColor()) {
		case 1:
			clothes.setColor("赤");
			break;
		case 2:
			clothes.setColor("青");
			break;
		case 3:
			clothes.setColor("黄");
			break;
		case 4:
			clothes.setColor("白");
			break;
		}
		
		List<Clothes> clothesList = repository.find(clothes.getGender(), clothes.getColor());
		
		model.addAttribute("clothesList", clothesList);
		
		return index(model);
//		return "forward:/clothes/index";
//		return "ShopIndex";
		
	}

}

