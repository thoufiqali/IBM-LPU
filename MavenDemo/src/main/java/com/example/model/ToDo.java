package com.example.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class ToDo {
	
	String toDoId;
	String toDoName;
	
	public ToDo(String toDoName)
	{
		this.toDoId = UUID.randomUUID().toString();
		this.toDoName= toDoName;
		
	}

}
