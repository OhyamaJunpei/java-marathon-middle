package jp.co.sample.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Team;
import jp.co.sample.repository.TeamRepository;

/**
 * 画面を表示するコントローラ.
 * 
 * @author junpei.oyama
 *
 */
@Controller
@RequestMapping("/team")
public class TeamController {
	
	/** リポジトリをDI */
	@Autowired
	private TeamRepository repository;
	/** sessionスコープ */
	@Autowired
	private HttpSession session;
	
	/**
	 * findAll()メソッドでチーム一覧を検索して
	 * 初期画面に表示する.
	 * 
	 * @return 初期画面
	 */
	@RequestMapping("/index")
	public String index() {
		
		List<Team> teamList = repository.findAll();
		session.setAttribute("teamList", teamList);
		
		return "teamIndex";
	}
	
	/**
	 * チームの詳細情報を出力するメソッド.
	 * 
	 * @param id チームid
	 * @param model モデル
	 * @return 詳細情報出力画面
	 */
	@RequestMapping("/detail")
	public String detail(Integer id, Model model) {
		
		Team team = repository.load(id);
		
		model.addAttribute("team", team);
		
		return "teamDetail";
	}
	
}
