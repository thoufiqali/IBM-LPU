package com.example.dao;

import java.util.ArrayList;

import com.example.model.Task;

public interface DemoDaoInterface {

	public void createTask(String toDoName);
	
	public ArrayList<Task> display();
	
	public void delete(String toDoName);
	
	public void update(String oldName,String toDoName);	

}
