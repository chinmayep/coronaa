package com.xworkz.corona.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.xworkz.corona.dao.CoronaDAO;
import com.xworkz.corona.dto.CoronaDTO;

@Service
public class ServiceDAOImpl implements ServiceDAO {
	@Autowired
	private CoronaDAO coronaDAO;
	public ServiceDAOImpl() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean validateAndSave(CoronaDTO coronaDTO) {
		System.out.println("invoked validateAndsave");
		boolean valid=false;
		if(Objects.nonNull(coronaDTO))
		{
			String name=coronaDTO.getName();
			if(!StringUtils.isEmpty(name) && name.length() >= 3 && name.length() <= 10) {
				
			
				System.out.println("name is valid");
			}		valid=true;
			
		}else {
			System.out.println("name is not valid");
			valid=false;
			
		}
		int age=coronaDTO.getAge();
		if(valid) {
			if(age>=0) {
				System.out.println("age is valid");
				valid=false;
			}
		}
		if(valid) {
			String email=coronaDTO.getEmail();
			if(!StringUtils.isEmpty(email)) {
				String regex="^[a-zA-Z0-9_+&-]+(?:\\."+ 
			 "A-Z]{2,7}$";
				boolean result=email.matches(regex);
				if(result== true) {
					System.out.println("email is valid");
					valid=true;
				}else {
					System.out.println("email is invalid");
					valid=false;
				}
				
			}
			if(valid) {
				String states=coronaDTO.getState();
				if(!StringUtils.isEmpty(states)) {
					System.out.println("state is valid");
					valid=true;
				}else {
					System.out.println("state is invalid");
				}
			}
			if(valid) {
				coronaDAO.save(coronaDTO);
				System.out.println("data is valid u can save data");
			}else {
				System.out.println("not valid data,so cannot save the data");
			}
				
		
	}
		return valid;
	
	}

	
}
