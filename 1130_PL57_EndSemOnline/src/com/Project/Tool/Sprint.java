package com.Project.Tool;

import java.util.ArrayList;



public class Sprint {

	ArrayList<Story> stories = new ArrayList<Story>();
	int duration;
	
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	Sprint(){
		
	}

	public ArrayList<Story> getStories() {
		return stories;
	}

	public void setStories(ArrayList<Story> stories) {
		this.stories = stories;
	}
	
	public void AddStory(Story story){
		this.stories.add(story);
	}
	
	public void DisplayStoryDetail(){
		for(Story st: stories){
			st.DisplayStory();
		}
		System.out.println("Sprint Duration is: "+ this.duration);
	}
}
