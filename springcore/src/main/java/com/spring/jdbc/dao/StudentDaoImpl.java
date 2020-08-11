package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao{


	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
	
String query="insert into student(id,name,city) values(?,?,?)";
		int result=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int change(Student student) {
		// TODO Auto-generated method stub
		String query="update student set name=?,city=? where id=?";
		int result=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return result;
		
		
	
	}

	public int delete(int studentId) {
		// TODO Auto-generated method stub
		
		String query="delete from student where id=?";
		int result=this.jdbcTemplate.update(query,studentId);
		return result;
		
	
	}
}
	

