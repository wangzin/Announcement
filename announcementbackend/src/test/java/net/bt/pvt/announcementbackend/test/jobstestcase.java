package net.bt.pvt.announcementbackend.test;
import static org.junit.Assert.assertEquals;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import net.bhu.pvt.dao.JobdetailsDao;
import net.bhu.pvt.dto.jobdetails;
public class jobstestcase
{
	private static AnnotationConfigApplicationContext context;
	private static JobdetailsDao dao;
	private jobdetails dto;
	@BeforeClass
	public static void init()
	{
		context =  new AnnotationConfigApplicationContext();
		context.scan("net.bhu.pvt");
		context.refresh();
		dao = (JobdetailsDao)context.getBean("JobdetailsDao");
	}
	/*@Test
	public void testAddjobdetials()
	{
		dto = new jobdetails();
		dto.setName("Name");
		dto.setPostdate(new Date());
		dto.setShdiscrip("Shortcvvczvsdfgiption here!");
		dto.setIs_active(true);
		dto.setImage_url("imagexcv asdurl");
		assertEquals("Successfully added the job details in the table", true,dao.add(dto));
	}*/
	
	//for retrieving data based on id test
	/*@Test
	public void testgetjobdetials()
	{
		dto = dao.get(1);
		assertEquals("Successfully fetch a sibngle job details from table", "Name here",dto.getName());
	}*/
	
	
	//for updating the data
		/*@Test
		public void testupdatejobdetials()
		{
			dto = dao.get(1);
			dto.setName("Your Full Name");
			assertEquals("Successfully updated a sibngle job details to table",true,dao.update(dto));
		}*/
	
	//for updating the data
			/*@Test
			public void testdeletejobdetials()
			{
				dto = dao.get(1);
				assertEquals("Successfully deleted a sibngle job details to table",true,dao.delete(dto));
			}

*/
			
			/*@Test
			public void testListjobdetials() 
			{
				assertEquals("Successfully fetch the list of job details from the table", 3, dao.list().size());
			}*/
	
}
