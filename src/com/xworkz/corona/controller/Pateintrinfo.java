package com.xworkz.corona.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.corona.dto.CoronaDTO;
import com.xworkz.corona.service.ServiceDAO;

public class Pateintrinfo {
	@Autowired
	private ServiceDAO service;

	public Pateintrinfo() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}
	private List<CoronaDTO> covidto=new ArrayList<CoronaDTO>();

	
	@RequestMapping(value="/covid.do",method=RequestMethod.POST)
	public String addCPatientDtls(@ModelAttribute CoronaDTO dto,Model model) {
		System.out.println("invoked on save" +dto);
		boolean saved=service.validateAndSave(dto);
			System.out.println("dto saved status" + saved);
			if(saved) {
				model.addAttribute("dto",dto);
				System.out.println("dto navigating to success page");
				return "saveSuccess";

			}
			System.out.println("dto is not saved ");
		return "NewFile";
	}
}
