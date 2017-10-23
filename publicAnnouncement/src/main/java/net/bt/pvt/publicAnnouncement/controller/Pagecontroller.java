package net.bt.pvt.publicAnnouncement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.bhu.pvt.dao.JobdetailsDao;
import net.bhu.pvt.dto.jobdetails;

@Controller
public class Pagecontroller
{
	@Autowired//invoke class of another project
	private JobdetailsDao JobdetailsDao;//name should be same sa reposatory in backend
	@RequestMapping(value = {"/","/home", "/index"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		return mv;
	}
	@RequestMapping(value = {"/about"})
	public ModelAndView about()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	@RequestMapping(value = {"/Vacancy"})
	public ModelAndView Vacancy()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("dao",JobdetailsDao.list());
		mv.addObject("title","Vacancy");
		mv.addObject("userClickVacancy",true);
		return mv;
	}
	@RequestMapping(value = {"/show/details/{id}/vacancy"})
	public ModelAndView showVacancyDetails(@PathVariable("id") int id)
	{
		ModelAndView mv=new ModelAndView("page");
		jobdetails jodetil=null;
		jodetil=JobdetailsDao.get(id);
		mv.addObject("title",jodetil.getName());
		mv.addObject("jodetil",jodetil);
		mv.addObject("jobdetailsall",JobdetailsDao.list());
		mv.addObject("userClickVacancydetails",true);
		return mv;
	}
		
	@RequestMapping(value = {"/contact"})
	public ModelAndView contact()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	

}
