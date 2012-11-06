package com.example.mediator.persons;

import java.util.ArrayList;
import java.util.List;

import com.example.mediator.task.Task;

public class Programmer implements WorkerInterface {
	private String programmerName;
	private List<Task> tasks = new ArrayList<Task>();

	public Programmer(String name) {
		programmerName = name;
	}

	public void setName(String name) {
		programmerName = name;
	}

	public String getName() {
		return programmerName;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Task zadanie) {
		boolean check = true;
		for (Task t : tasks)
			if (t.getName().equals(zadanie.getName()))
				check = false;
		if (check)
			tasks.add(zadanie);
	}

	public List<Task> sendReport() {
		List<Task> done = new ArrayList<Task>();
		for (Task t : tasks)
			if (t.getState())
				done.add(t);
		return done;
	}

	public void showTasks() {
		System.out.println("Programmer " + programmerName + " tasks");
		for (Task t : tasks)
			System.out.println("Task: " + t.getName() + " state: "
					+ t.getState());
		System.out.println("");
	}

	public void finishTask() {
		int random = (int) (Math.random() * tasks.size());
		tasks.get(random).setState(true);
	}

}
