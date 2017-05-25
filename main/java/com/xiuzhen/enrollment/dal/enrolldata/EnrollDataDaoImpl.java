package com.xiuzhen.enrollment.dal.enrolldata;
import java.util.List;
import org.apache.log4j.Logger;

import com.xiuzhen.enrollment.po.enrolldata.EnrollData;


public class EnrollDataDaoImpl implements EnrollDataDao{
	
	private EnrollDataMapper enrollDataMapper = null;
	private static Logger log = Logger.getLogger(EnrollDataDaoImpl.class);
	
	public void setEnrollDataMapper(EnrollDataMapper enrollDataMapper) {
		this.enrollDataMapper = enrollDataMapper;
	}

	public List<EnrollData> selectAll() {
//		selectAll 不需要测试，因为如果没有数据返回的也是一个list，不过size＝0
//		遍历这个size 0 的list也不会出错，只是没有东西
//		不过。。。还是要catch一下。。万一断了连接呢。。。
		try {
			return enrollDataMapper.selectAll();
		} catch (Exception e) {
			log.error("EnrollDataDaoImpl selectAll error");
			log.error(e.getMessage());
			return null;
		}
	}

	public List<EnrollData> selectByRealname(String realname) {
		try {
			return enrollDataMapper.selectByRealname(realname);
		} catch (Exception e) {
			log.error("EnrollDataDAOImpl selectByRealname error");
			log.error(e.getMessage());
			return null;
		}
	}
	
	public List<EnrollData> selectByClassName(String class_name) {
		try {
			return enrollDataMapper.selectByRealname(class_name);
		} catch (Exception e) {
			log.error("EnrollDataDAOImpl selectByRealname error");
			log.error(e.getMessage());
			return null;
		}
	}
	
	public List<EnrollData> selectByOnlineId(String online_id) {
		try {
			return enrollDataMapper.selectByOnlineId(online_id);
		} catch (Exception e) {
			log.error("EnrollDataDAOImpl selectByOnlineId error");
			log.error(e.getMessage());
			return null;
		}
	}

	public EnrollData selectById(int enroll_id) {
		try {
			return enrollDataMapper.selectById(enroll_id);
		} catch (Exception e) {
			log.error("EnrollDataDAOImpl selectById error");
			log.error(e.getMessage());
			return null;
		}
	}

	public boolean insert(EnrollData ed) {
		try {
			int result = enrollDataMapper.insert(ed);
			if (result > 0)
				return true;
			else 
				return false;
		} catch (Exception e) {
			log.error("EnrollDataDAOImpl insert error");
			log.error(e.getMessage());
			return false;
		}
	}

	public boolean update(EnrollData ed) {
		try {
			int result = enrollDataMapper.update(ed);
			if (result > 0)
				return true;
			else 
				return false;
		} catch (Exception e) {
			log.error("EnrollDataDAOImpl update error");
			log.error(e.getMessage());
			return false;
		}
	}

	public boolean delete(int enroll_id) {
		try {
			int result = enrollDataMapper.delete(enroll_id);
			if (result > 0)
				return true;
			else 
				return false;
		} catch (Exception e) {
			log.error("EnrollDataDAOImpl delete error");
			log.error(e.getMessage());
			return false;
		}
	}
}
