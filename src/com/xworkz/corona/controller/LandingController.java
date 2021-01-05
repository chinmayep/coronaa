package com.xworkz.corona.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class LandingController {

	private List<String> states;
	public LandingController() {
		System.out.println("created"+this.getClass().getName());
	}
	
	public void init() {
		System.out.println("");
		this.states=new ArrayList<String>();
		this.states.add("Karnatka");
		this.states.add("AP");
		this.states.add("MP");
		this.states.add("delhi");
		
		
		
		
	}
	@RequestMapping("/landing.do")
	public String landingPage(Model model) {
		System.out.println("invoked landing page()");
		model.addAttribute("states",this.states);
		return "Corona";
	}
	@PreDestroy
	public void destroy() {
		System.out.println("invoked pre distroy");
		this.states=null;
	}
	
}
