package com.fwa.lab.mygset.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fwa.lab.mygset.model.JsonObject;

@Controller
public class JsonController {
	
	@RequestMapping(method=RequestMethod.GET, value ="test")  
	public @ResponseBody JsonObject test() { 
		JsonObject obj = new JsonObject();
		obj.setName("ABC");
	    return obj;
	}

}
