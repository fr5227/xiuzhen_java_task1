package com.xiuzhen.enrollment.daltest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceUtils;


public class MySQLSpringConnectionTest {
	
	@Test
	public void mySqlSpringConnectionTest() throws SQLException {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("spring-context-enrollment-dal.xml");
		
		DataSource ds = (DataSource) ctx.getBean("dataSource");
		Connection conn = DataSourceUtils.getConnection(ds);
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from enroll where enroll_id=1");
			while (rs.next()) {
				String name = rs.getString("realname");
				System.out.println(name);
			}
		} catch (Exception e) {
		} finally {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
	}
}
