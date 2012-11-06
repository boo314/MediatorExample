package com.example.mediator.persons;

import java.util.ArrayList;
import java.util.List;

import com.example.mediator.task.Task;

public class Manager implements ManagerInterface {
	private String managerName;
	private List<Task> reportProgrammer = new ArrayList<Task>();
	private List<Task> reportDesigner = new ArrayList<Task>();
	private List<Task> randomTaskList = new ArrayList<Task>();

	public Manager(String name) {
		managerName = name;
		randomTaskList.add(new Task("Zlecenie 1", false));
		randomTaskList.add(new Task("Zlecenie 2", false));
		randomTaskList.add(new Task("Zlecenie 3", false));
		randomTaskList.add(new Task("Zlecenie 4", false));
		randomTaskList.add(new Task("Zlecenie 5", false));
		randomTaskList.add(new Task("Zlecenie 6", false));
		randomTaskList.add(new Task("Zlecenie 7", false));
		randomTaskList.add(new Task("Zlecenie 8", false));
		randomTaskList.add(new Task("Zlecenie 9", false));
		randomTaskList.add(new Task("Zlecenie 10", false));
	}

	public void setName(String name) {
		managerName = name;
	}

	public String getName() {
		return managerName;
	}
	
	public void getReportProgrammer(List<Task> report) {
		for (Task t : report) {
			reportProgrammer.add(t);
		}
	}

	public void getReportDesigner(List<Task> report) {
		for (Task t : report) {
			reportDesigner.add(t);
		}
	}

	public Task sendTask(Task task) {
		return task;
	}

	public Task sendTask(String name, boolean state) {
		return new Task(name, state);
	}

	public Task sendRandomTask() {
		int random = (int) (Math.random() * 10);
		return randomTaskList.get(random);
	}

	public void showReports() {
		System.out.println("Manager: "+managerName);
		System.out.println("Programmers reports");
		for (Task t : reportProgrammer)
			System.out.println("Task " + t.getName() + " done");
		System.out.println("");
		System.out.println("Designers reports");
		for (Task t : reportDesigner)
			System.out.println("Task " + t.getName() + " done");
		System.out.println("");
	}

	

}
