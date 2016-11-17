package com.highluck.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.highluck.dto.Feed;
import com.highluck.dto.UserValue;
import com.highluck.library.Json;
import com.highluck.service.FeedService;

@Controller

public class FeedController {
@Autowired
private FeedService feedService;

@RequestMapping(value="/feedSS", method = RequestMethod.GET)
public void findAllByUserId(@ModelAttribute UserValue value, HttpServletResponse response){
   System.out.println("asdd");
   Json.JsonSerialize().ReturnJSON(response, feedService.findAllByUserId(value));


}

}
