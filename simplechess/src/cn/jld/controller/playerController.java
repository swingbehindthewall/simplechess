package cn.jld.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jld.po.player;
import cn.jld.service.playerImpl;

@Controller
public class playerController {
	
	@Autowired
	private playerImpl playerImpl;

	@RequestMapping("/register")
	public ModelAndView add(HttpServletRequest req) throws Exception{
		ModelAndView modelandview = new ModelAndView();
		req.setCharacterEncoding("utf-8");
		player player = new player(req.getParameter("nickname"),req.getParameter("password"));
		System.out.println(req.getParameter("nickname"));
		playerImpl.addplayer(player);
		
		modelandview.addObject("flag", 1);
		modelandview.setViewName("/login");
		return modelandview;
	}
	
	@RequestMapping("/login")
	public ModelAndView find(HttpServletRequest req) throws Exception{
		ModelAndView modelandview =new ModelAndView();
		player player=playerImpl.getplayerByName(req.getParameter("nickname"));
		modelandview.addObject("player", player);
		modelandview.setViewName("/personal");
		return	modelandview;
	}
	
}
