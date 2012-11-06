package com.example.mediator;

import java.util.ArrayList;
import java.util.List;

import com.example.mediator.persons.Designer;
import com.example.mediator.persons.Manager;
import com.example.mediator.persons.Programmer;
import com.example.mediator.task.Task;

public class Mediator {
	private List<Programmer> programmers = new ArrayList<Programmer>();
	private List<Designer> designers = new ArrayList<Designer>();
	private Manager manager;

	protected void hireManager(String name) {
		manager = new Manager(name);
	}

	protected void hireProgrammer(String name) {
		programmers.add(new Programmer(name));
	}

	protected void hireDesigner(String name) {
		designers.add(new Designer(name));
	}

	protected void getAllReports() {
		getDesignersReports();
		getProgrammersReports();
	}

	protected void getProgrammersReports() {
		for (Programmer p : programmers) {
			manager.getReportProgrammer(p.sendReport());
		}
	}

	protected void getDesignersReports() {
		for (Designer d : designers) {
			manager.getReportDesigner(d.sendReport());
		}
	}

	protected void getAllTasks() {
		getProgrammersTasks();
		getDesignersTasks();
	}

	protected void getProgrammersTasks() {
		for (Programmer p : programmers)
			p.showTasks();
	}

	protected void getDesignersTasks() {
		for (Designer d : designers)
			d.showTasks();
	}

	protected void sendRandomTasks(int amount) {
		for (Programmer p : programmers)
			for (int i = 0; i < amount; i++)
				p.setTasks(manager.sendRandomTask());
		for (Designer d : designers)
			for (int i = 0; i < amount; i++)
				d.setTasks(manager.sendRandomTask());
	}

	protected void sendTasks(List<Task> forProgrammers, List<Task> forDesigners) {
		if (forProgrammers != null) {
			for (Programmer p : programmers) {
				for (Task t : forProgrammers) {
					p.setTasks(t);
				}
			}
		}
		if (forDesigners != null) {
			for (Designer d : designers) {
				for (Task t : forDesigners) {
					d.setTasks(t);
				}
			}
		}
	}

	protected void finishRandomTask() {
		for (Programmer p : programmers)
			p.finishTask();
		for (Designer d : designers)
			d.finishTask();
	}

	protected void finishRandomTasks(int amount) {
		for (Programmer p : programmers)
			for (int i = 0; i < amount; i++)
				p.finishTask();
		for (Designer d : designers)
			for (int i = 0; i < amount; i++)
				d.finishTask();
	}
	
	protected void showReports(){
		manager.showReports();
	}
}
