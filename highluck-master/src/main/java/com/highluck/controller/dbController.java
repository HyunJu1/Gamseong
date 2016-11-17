package com.highluck.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.highluck.dto.DbDTO;
import com.highluck.dto.DbValue;
import com.highluck.dto.UserValue;
import com.highluck.library.Json;
import com.highluck.service.DbService;

@Controller
public class dbController {

	@Autowired
	private DbService dbService;

	@RequestMapping(value="/feed", method = RequestMethod.GET)
	public void findAllByUserId(@ModelAttribute DbValue value, HttpServletResponse response){
	   System.out.println("성공!");
	   Json.JsonSerialize().ReturnJSON(response, dbService.findAllByUserId(value));
	}
	@RequestMapping(value="/feed2", method = RequestMethod.GET)
	public void findAllByUserId2(@ModelAttribute DbValue value, HttpServletResponse response){
	   System.out.println("성공!");
	   Json.JsonSerialize().ReturnJSON(response, dbService.findAllByUserId2(value));
	}
	@RequestMapping(value="/feed3", method = RequestMethod.GET)
	public void findAllByUserId3(@ModelAttribute DbValue value, HttpServletResponse response){
	   System.out.println("성공!");
	   Json.JsonSerialize().ReturnJSON(response, dbService.findAllByUserId3(value));
	}
	@RequestMapping(value="/feed4", method = RequestMethod.GET)
	public void findAllByUserId4(@ModelAttribute DbValue value, HttpServletResponse response) throws Exception{
	   System.out.println("성공!");
	   Json.JsonSerialize().ReturnJSON(response, dbService.findAllByUserId4(value)); }
	
	@RequestMapping(value="/feed5", method = RequestMethod.GET)
	public void findAllByUserId5(@ModelAttribute DbValue value, HttpServletResponse response) throws Exception{
	   System.out.println("성공!");
	   Json.JsonSerialize().ReturnJSON(response, dbService.findAllByUserId5(value)); }

}