package com.example.mediator.persons;

import java.util.List;

import com.example.mediator.task.Task;

public interface WorkerInterface {

	public void showTasks();
	public void setTasks(Task zadanie);
	public void setName(String name);
	public void finishTask();
	public String getName();
	public List<Task> sendReport();
	public List<Task> getTasks();
	
}
