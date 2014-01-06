package com.bdqn.factory;

import com.bdqn.dao.IStudentDAO;
import com.bdqn.dao.imp.StudentDAOImp;
import com.bdqn.dao.imp.StudentDAOImpForSQLServer;

public class SysFactory {
	public static IStudentDAO getInstance(){
		return StudentDAOImp.getStudentDAOImp();
	}
	public static IStudentDAO getInstanceForSQLServer(){
		return StudentDAOImpForSQLServer.getStudentDAOImpForSQLServer();
	}
}
