package com.example.mediator;



public class Main {

	public static void main(String[] args) {
		Mediator medium = new Mediator();
		medium.hireManager("POPEK");
		medium.hireDesigner("Wladek");
		medium.hireDesigner("Michal");
		medium.hireDesigner("Monika");
		medium.hireDesigner("Kasia");
		medium.hireProgrammer("Karol");
		medium.hireProgrammer("Ania");
		medium.hireProgrammer("Wojtek");
		medium.hireProgrammer("Asia");
		medium.sendRandomTasks(2);
		medium.getAllTasks();
		medium.finishRandomTask();
		medium.getAllReports();
		medium.showReports();
	}

}
