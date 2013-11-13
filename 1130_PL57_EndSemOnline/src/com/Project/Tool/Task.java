package com.Project.Tool;

public class Task {
	String taskName;
	int hour;
	
	public Task(String task, int hour){
		this.taskName = task;
		this.hour = hour;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	 
	public void DisplayTask(){
		System.out.println("Task Name: "+this.taskName);
		System.out.println("Hour : "+this.hour);
	}

}
