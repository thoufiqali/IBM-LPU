package com.example.service;

import java.util.ArrayList;

import com.example.model.Task;

public interface DemoServiceInterface {
	
	public void createToDoService(String toDoName);
	public ArrayList<Task> display();
	public void deleteService(String toDoName);
	public void updateService(String oldName,String toDoName);

}
