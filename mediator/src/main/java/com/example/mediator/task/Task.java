package com.example.mediator.task;

public class Task implements TaskInterface {
	private String name;
	private boolean state;

	public Task(String name,boolean state){
		this.name = name;
		this.state = state;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public boolean getState() {
		return state;
	}

}
