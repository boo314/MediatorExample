package com.example.mediator.persons;

import java.util.List;
import com.example.mediator.task.Task;


public interface ManagerInterface {
	public void getReportProgrammer(List<Task> report);
	public void getReportDesigner(List<Task> report);
	public void showReports();
	public void setName(String name);
	public String getName();
	public Task sendTask(Task task);
	public Task sendTask(String name,boolean state);
}
