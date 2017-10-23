/**
 * 
 */
package net.bhu.pvt.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.bhu.pvt.dao.JobdetailsDao;
import net.bhu.pvt.dto.jobdetails;

/**
 * @author Wangzin
 *
 */
@Repository("JobdetailsDao")
@Transactional //make sure from spring framework
public class JobdetauilsDaoImplements implements JobdetailsDao 
{

	@Autowired
	private SessionFactory sessionfac;
	
	@Override
	public List<jobdetails> list()
	{
		String QUERY  = "FROM jobdetails WHERE is_active= :active";
		Query querybuilder =  sessionfac.getCurrentSession().createQuery(QUERY);
		querybuilder.setParameter("active", true);	
		return querybuilder.getResultList();
	}
	
	//Getting single Job details based on Id
	@Override
	public jobdetails get(int id)
	{
		//this is after implementing unimplemented method  ..---enhanced for loop
		return sessionfac.getCurrentSession().get(jobdetails.class,Integer.valueOf(id));
	}

	@Override
	public boolean add(jobdetails dto)
	{
		try 
		{
			//add jobs in the table 
			sessionfac.getCurrentSession().persist(dto);
			return true;
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	//Update a single detials
	@Override
	public boolean update(jobdetails jdsdto) 
	{
		try 
		{
			//add jobs in the table 
			sessionfac.getCurrentSession().update(jdsdto);
			return true;
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public boolean delete(jobdetails jdsdto) 
	{
		jdsdto.setIs_active(false);//so that we cant fetch this data
		try 
		{
			//add jobs in the table 
			sessionfac.getCurrentSession().update(jdsdto);
			return true;
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

}
