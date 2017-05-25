package com.xiuzhen.enrollment.dal.enrolldata;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.xiuzhen.enrollment.po.enrolldata.EnrollData;

public interface EnrollDataMapper {

	@Select("SELECT * FROM enroll")
	List<EnrollData> selectAll();
	
	@Select("SELECT * FROM enroll WHERE realname=#{realname}")
	List<EnrollData> selectByRealname(String realname);
	
	@Select("SELECT * FROM enroll WHERE online_id=#{online_id}")
	List<EnrollData> selectByOnlineId(String online_id);
	
	@Select("SELECT * FROM enroll WHERE class_name=#{class_name}")
	List<EnrollData> selectByClassName(String class_name);
	
	@Select("SELECT * FROM enroll WHERE enroll_id=#{enroll_id}")
	EnrollData selectById(int enroll_id);
	
	@Insert("insert into enroll (created_at, updated_at, realname, qq, school," + 
        "tutor, online_id, study_note_link, study_aoth," + 
        "expected_start_date, heard_us_from, class_name)" +
        "values  " +
        "(#{created_at}, #{updated_at}, #{realname}, #{qq}, #{school}, " +
        "#{tutor}, #{online_id}, #{study_note_link}, #{study_aoth}, " +
        "#{expected_start_date}, #{heard_us_from}, #{class_name})")
	int insert(EnrollData ed);
	
	@Update("update enroll set "
			+ "created_at=#{created_at}, "+
         "updated_at=#{updated_at}, "+
         "realname=#{realname}, "+
         "qq=#{qq}, "+
         "school=#{school},"+ 
         "tutor=#{tutor}, "+
         "online_id=#{online_id},"+ 
         "study_note_link=#{study_note_link},"+ 
         "study_aoth=#{study_aoth}, "+
         "expected_start_date=#{expected_start_date},"+ 
         "heard_us_from=#{heard_us_from}"+
         "class_name=#{class_name}"+
         "where id=#{enroll_id}")
	int update(EnrollData ed);
	
	@Delete("delete from enroll where id=#{enroll_id}")
	int delete(int enroll_id);
}
