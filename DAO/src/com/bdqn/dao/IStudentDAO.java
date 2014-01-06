package com.bdqn.dao;

import com.bdqn.domain.Student;

public interface IStudentDAO {
	//≤Â»Î
	public boolean insertStudent(Student parStudent);
	//≤È—Ø
	public Student findByStuNo(String parStuNo);
}
