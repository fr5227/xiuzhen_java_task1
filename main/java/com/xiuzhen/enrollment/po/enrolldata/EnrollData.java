package com.xiuzhen.enrollment.po.enrolldata;

import java.io.Serializable;

public class EnrollData implements Serializable{

	int enroll_id;
	java.sql.Timestamp created_at;
	java.sql.Timestamp updated_at;
	String realname;
	String qq;
	String school;
	String tutor;
	String online_id;
	String study_note_link;
	String study_aoth;
	java.sql.Date expected_start_date;
	String heard_us_from;
	String class_name;
	
	// 以及这些class variable的getter setter
	
	public int getEnroll_id() {
		return enroll_id;
	}
	public void setEnroll_id(int enroll_id) {
		this.enroll_id = enroll_id;
	}
	public java.sql.Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(java.sql.Timestamp created_at) {
		this.created_at = created_at;
	}
	public java.sql.Timestamp getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(java.sql.Timestamp updated_at) {
		this.updated_at = updated_at;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getTutor() {
		return tutor;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	public String getOnline_id() {
		return online_id;
	}
	public void setOnline_id(String online_id) {
		this.online_id = online_id;
	}
	public String getStudy_note_link() {
		return study_note_link;
	}
	public void setStudy_note_link(String study_note_link) {
		this.study_note_link = study_note_link;
	}
	public String getStudy_aoth() {
		return study_aoth;
	}
	public void setStudy_aoth(String study_aoth) {
		this.study_aoth = study_aoth;
	}
	
	public java.sql.Date getExpected_start_date() {
		return expected_start_date;
	}
	public void setExpected_start_date(java.sql.Date expected_start_date) {
		this.expected_start_date = expected_start_date;
	}
	public String getHeard_us_from() {
		return heard_us_from;
	}
	public void setHeard_us_from(String heard_us_from) {
		this.heard_us_from = heard_us_from;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	
}
