package com.Project.Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.Project.Tool.Story;
import com.Project.Tool.Task;

public class StoryTest {

	Story story;
	@Before
	public void setUp() throws Exception {
		story = new Story(new Task("Login", 5), 1, 3);
	}

	@Test
	public void testStoryPoint() {
		//fail("Not yet implemented");
		assertEquals(3, story.getStoryPoint());
	}
	
	@Test
	public void testPriorityNumber() {
		//fail("Not yet implemented");
		assertEquals(1, story.getPriNum());
	}
	
	@Test
	public void testTaskNamefromStory() {
		//fail("Not yet implemented");
		assertEquals("Login", story.getTask().getTaskName());
	}
	
	@Test
	public void testTaskHourfromStory() {
		//fail("Not yet implemented");
		assertEquals(5, story.getTask().getHour());
	}

}
