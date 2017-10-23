package net.bhu.pvt.dao;

import java.util.List;

import net.bhu.pvt.dto.jobdetails;

public interface JobdetailsDao
{
	jobdetails get(int id);//abstract method, need to include/add unimplemented method in invoked class - JobdetauilsDaoImplements and modify the get method in that class.
	List<jobdetails> list();
	boolean add(jobdetails jdsdto);
	boolean update(jobdetails jdsdto);
	boolean delete(jobdetails jdsdto);
	
	
}
