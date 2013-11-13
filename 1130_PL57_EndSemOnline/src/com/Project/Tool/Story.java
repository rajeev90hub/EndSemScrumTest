package com.Project.Tool;

public class Story {
	Task task;
	int priNum;
	int storyPoint;
	
	Story(Task task, int pn, int sp){
		this.task = task;
		this.priNum = pn;
		this.storyPoint = sp;
	}
	
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public int getPriNum() {
		return priNum;
	}
	public void setPriNum(int priNum) {
		this.priNum = priNum;
	}
	public int getStoryPoint() {
		return storyPoint;
	}
	public void setStoryPoint(int storyPoint) {
		this.storyPoint = storyPoint;
	}
	
	public void DisplayStory(){
		this.task.DisplayTask();
		System.out.println("Priority Number: "+this.priNum);
		System.out.println("Story Point: "+this.storyPoint);
	}

}
