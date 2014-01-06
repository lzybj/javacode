package com.bdqn.service;

import com.bdqn.dao.IStudentDAO;
import com.bdqn.domain.Student;
import com.bdqn.factory.SysFactory;

public class StudentService {
	public Student login(String stuno,String stupwd){
//		IStudentDAO myStuDao = SysFactory.getInstance();
		IStudentDAO myStuDao = SysFactory.getInstanceForSQLServer();
		Student myStu = myStuDao.findByStuNo(stuno);
		if(myStu != null){
			if(myStu.getStuPwd().equals(stupwd)){
				return myStu;
			}
		}
		return null;
	}
	public boolean register(Student parStu){
//		IStudentDAO myDao = SysFactory.getInstance();
		IStudentDAO myDao = SysFactory.getInstanceForSQLServer();
		Student myStu = myDao.findByStuNo(parStu.getStuNo());
		if(myStu == null){
			return myDao.insertStudent(parStu);
		}
		return false;
	}
}
