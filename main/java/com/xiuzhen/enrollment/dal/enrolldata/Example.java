package com.xiuzhen.enrollment.dal.enrolldata;

import java.util.List;

import com.xiuzhen.enrollment.po.enrolldata.EnrollData;

public class Example {
	public static void main(String[] args) {
		EnrollDataDao dao = EnrollDataDaoFactory.getEnrollDataDao();
		List<EnrollData> edList = dao.selectAll();
		for (EnrollData ed : edList)
			System.out.println(ed.getRealname());
	}
}
