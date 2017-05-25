package com.xiuzhen.enrollment.daltest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xiuzhen.enrollment.dal.enrolldata.EnrollDataDaoImpl;
import com.xiuzhen.enrollment.po.enrolldata.EnrollData;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-context-enrollment-dal.xml")
public class EnrollDataMapperTest {

	@Autowired
	private EnrollDataDaoImpl edDao;
	
	@Test
	public void EnrollDataDaoWiringTest(){
		assertNotNull(edDao);
	}
	@Test
	public void EnrollDataMapperTest(){
		List<EnrollData> edList = edDao.selectAll();
		Assert.assertTrue(edList.size() >= 0);
	}
}
