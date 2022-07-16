package com.derkxin.Temperature.Converter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {
	@RequestMapping(value="/", method= RequestMethod.GET)
	public ModelAndView simplemath() {
		ModelAndView file = new ModelAndView();
		file.setViewName("main.html");
		return file;
	}
}
