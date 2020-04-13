package com.example.demo.MavenDemo;

import java.util.Scanner;

import com.example.service.DemoService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Scanner sc = new Scanner(System.in);
    	DemoService objService = new DemoService();

    	int choice = 0;
    	
    	while(choice !=5)
    	{
    		System.out.println("Enter your choice");
        	
    		System.out.println("1) to create 2) display 3) displaybyId  4) Updatetask");
    		choice = sc.nextInt();
    		switch(choice)
    		{
    		case 1:
    			System.out.println("Enter the Todo name");
    			String todoName = sc.next();
    			objService.createToDoService(todoName);
    			
    			break;
    		case 2:
    			System.out.println(objService.display());
    			break;
    		case 3:
    			System.out.println("Enter the todoName");
    			String id = sc.next();
    			objService.deleteService(id);
    			break;
    		case 4:
    			System.out.println("Enter the todoName to update");
    			String id1 = sc.next();
    			System.out.println("Enter the updated Todo name");
    			String toDoName = sc.next();
    			objService.updateService(id1, toDoName);
    			break;
    		case 0:
    			System.exit(0);
    			System.out.println("byeeee");
    			break;
    		default:
    			System.out.println("invalid");
    		}
    		
    		
    	}
    }
}
