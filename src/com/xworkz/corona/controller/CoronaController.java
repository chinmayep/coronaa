package com.xworkz.corona.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.xworkz.corona.dto.CoronaDTO;

@Controller
@RequestMapping("/")
public class CoronaController {
		public CoronaController() {
			System.out.println("created"+this.getClass().getName());
		}
		@RequestMapping(value="/save.do",method=RequestMethod.POST)
		public String onSave(CoronaDTO dto) {
			System.out.println("invoked on save"+dto);
			return "Savesuccess";
		}
		
		 
		
}
