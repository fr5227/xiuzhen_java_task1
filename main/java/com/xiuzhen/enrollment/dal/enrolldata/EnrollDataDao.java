package com.xiuzhen.enrollment.dal.enrolldata;
import java.util.List;

import com.xiuzhen.enrollment.po.enrolldata.EnrollData;

public interface EnrollDataDao {
	List<EnrollData> selectAll();
	List<EnrollData> selectByRealname(String realname);
	List<EnrollData> selectByClassName(String class_name);
	List<EnrollData> selectByOnlineId(String online_id);
	EnrollData selectById(int enroll_id);
	boolean insert(EnrollData ed);
	boolean update(EnrollData ed);
	boolean delete(int enroll_id);
}
