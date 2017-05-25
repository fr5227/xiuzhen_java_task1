package com.xiuzhen.enrollment.dal.enrolldata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xiuzhen.enrollment.po.enrolldata.*;

public class EnrollDataDaoFactory {
	
	public static EnrollDataDao dao = null;
	public static EnrollDataMapper mapper = null;
	static {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context-enrollment-dal.xml");
		dao = (EnrollDataDao) ctx.getBean("enrollDataDaoImpl");
		mapper = (EnrollDataMapper) ctx.getBean("enrollDataMapper");	
	}
	
	public static EnrollDataDao getEnrollDataDao(){
		return dao;
	}
	
	public static EnrollDataMapper getEnrollDataMapper(){
		return mapper;
	}
	
	public static EnrollData getEnrollData(){
		return new EnrollData();
	}
}
