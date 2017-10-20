package net.bt.pvt.publicAnnouncement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Pagecontroller
{
	
	@RequestMapping(value = {"/","/home", "/index"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting","wellcome to spring framework");
		return mv;
	}
	@RequestMapping(value="/test")//request annotation
//	public ModelAndView test(@RequestParam("greeting")String greeting)//parameter is mandatory
	public ModelAndView test(@RequestParam(value="greeting",required=false)String greeting)
	
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
	}
	
	@RequestMapping(value="/test/{greeting}")//path annotation
//	public ModelAndView test(@RequestParam("greeting")String greeting)//parameter is mandatory
	public ModelAndView testpath(@PathVariable("greeting")String greeting)
	
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
	}
	

}
