package com.onlineSchool.AccountSubsystem;

public class TeacherModel extends AccountModel {
	
	
	public boolean insert(Teacher teacher){
		return true;
	}
	
	
	public boolean exist(String username){
		return true;
	}
	
	public boolean exist(String username, String password){
		return true;
	}

}