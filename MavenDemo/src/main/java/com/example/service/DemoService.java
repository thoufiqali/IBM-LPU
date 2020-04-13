package com.example.service;

import java.util.ArrayList;

import com.example.dao.DemoDao;
import com.example.model.Task;
import com.example.model.ToDo;

public class DemoService implements DemoServiceInterface{
	
	DemoDao objDao = new DemoDao();
	
	public void createToDoService(String toDoName)
	{
		objDao.createTask( toDoName);
	}
	
	public ArrayList<Task> display()
	{

		return objDao.display();

	}
	public void deleteService(String toDoName)
	{
		objDao.delete(toDoName);
	}
	
	public void updateService(String oldName,String toDoName)
	{
		objDao.update(oldName, toDoName);
	}
	

}
