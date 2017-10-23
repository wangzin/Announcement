package net.bhu.pvt.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.hibernate.SessionFactory;

@Configuration
@ComponentScan(basePackages= {"net.bhu.pvt.dto"})
@EnableTransactionManagement
public class Hibernatecongig
{
	//connection settings for h2 database
	private final static String DATABASE_URL = "jdbc:h2:tcp://localhost/~/announcementdb";
	private final static String DATABASE_DRIVER  = "org.h2.Driver";
	private final static String DATABASE_DIALECT = "org.hibernate.dialect.H2Dialect";
	private final static String DATABASE_USERNAME = "sa";
	private final static String DATABASE_PASSWORD = "";
	
	//connection settings for mysql database
		/*private final static String DATABASE_URL = "jdbc:mysql://localhost/announcementdb";
		private final static String DATABASE_DRIVER  = "com.mysql.jdbc.Driver";
		private final static String DATABASE_DIALECT = "org.hibernate.dialect.MySQLDialect";
		private final static String DATABASE_USERNAME = "root";
		private final static String DATABASE_PASSWORD = "root";
*/
	
	//datasource bean will be available
	@Bean
	public DataSource getDataSource()
	{
		//providing the database connection information
		BasicDataSource datasource = new BasicDataSource();
		datasource.setDriverClassName(DATABASE_DRIVER);
		datasource.setUrl(DATABASE_URL);
		datasource.setUsername(DATABASE_USERNAME);
		datasource.setPassword(DATABASE_PASSWORD);
		return datasource;
	}
	
	//session factory bean will be abailable
	@Bean
	public SessionFactory getSessionFactory(DataSource datasource)
	{
		LocalSessionFactoryBuilder sessionbuilder = new LocalSessionFactoryBuilder(datasource);
		sessionbuilder.addProperties(getHibernateProperties());
		sessionbuilder.scanPackages("net.bhu.pvt.dto");
		return sessionbuilder.buildSessionFactory();
	}

	//All the hibernate properties will be returned in this method
	private Properties getHibernateProperties()
	{
		Properties proerties =new Properties();
		proerties.put("hibernate.dialect", DATABASE_DIALECT);
		proerties.put("hibernate.show_sql",  "true");
		proerties.put("hibernate.format_sql", "true");
		return proerties;
	}
	
	//transaction manager bean
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager transactionmanager = new 	HibernateTransactionManager(sessionFactory);
		return transactionmanager;
	}
}
