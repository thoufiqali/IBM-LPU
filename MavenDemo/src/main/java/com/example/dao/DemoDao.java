package com.example.dao;

import java.util.ArrayList;

import com.example.model.Task;
import com.example.model.ToDo;

public class DemoDao  implements DemoDaoInterface{
	int id = 0;
	Task objTask = new Task();
	ToDo objTodo;
	public void createTask(String toDoName)
	{
		objTask.addTodo(new ToDo(toDoName));
		System.out.println("todo added");
	}
	
	
	public ArrayList<Task> display()
	{
		return objTask.display();

	}
	
	public void delete(String toDoName)
	{
		objTask.delete(toDoName);
		
	}
	
	public void update(String oldName,String toDoName)
	{
		objTask.update(oldName, toDoName);
	}
	
	

}
