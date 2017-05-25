package com.xiuzhen.enrollment.daltest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xiuzhen.enrollment.dal.enrolldata.*;
import com.xiuzhen.enrollment.po.enrolldata.EnrollData;


public class EnrollDataDaoImplTest {
	
	public static EnrollDataDao dao = null;
	public static EnrollDataMapper mapper = null;
	static {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context-enrollment-dal.xml");
		dao = (EnrollDataDao) ctx.getBean("enrollDataDaoImpl");
		mapper = (EnrollDataMapper) ctx.getBean("enrollDataMapper");
		
	}
	
	@Test
	public void selectAllMapperTest() {
		List<EnrollData> listEd = mapper.selectAll();
		if (listEd == null)
			System.out.println("null");
		System.out.println(listEd.size());
		for (EnrollData ed : listEd) {
			System.out.println(ed.getRealname());
		}
		assertNotNull(listEd);
	}
	
	@Test
	public void selectAllDaoTest() {
		List<EnrollData> listEd = dao.selectAll();
		for (EnrollData ed : listEd) {
			System.out.println(ed.getRealname());
		}
		assertNotNull(listEd);
	}

}
