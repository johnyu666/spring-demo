package cn.johnyu.container;

import javax.sql.DataSource;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.johnyu.mocker.service.Analyser;
import dao.CustomerDao;
import pojo.Customer;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Analyser analyser=context.getBean("factor1",Analyser.class);
		Analyser analyser1=context.getBean("factor2",Analyser.class);
//		analyser1.analyse();
		DataSource ds=context.getBean(DataSource.class);
		CustomerDao cd=context.getBean(CustomerDao.class);
		Customer c=new Customer();
		c.setId(1);
		c.setCname("Johnyu");
		cd.addCustomer(c);
		
	}

}



