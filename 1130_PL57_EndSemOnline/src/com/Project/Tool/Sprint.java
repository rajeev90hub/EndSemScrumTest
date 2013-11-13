package com.Project.Tool;

import java.util.ArrayList;



public class Sprint {

	ArrayList<Story> stories = new ArrayList<Story>();
	
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
}
