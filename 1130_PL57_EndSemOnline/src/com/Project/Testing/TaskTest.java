package com.Project.Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.Project.Tool.Task;

public class TaskTest {

	Task task;
	
	@Before
	public void setUp() throws Exception {
		task = new Task("Login", 3);
		
		
	}

	@Test
	public void testTaskName() {
		//fail("Not yet implemented");
		assertEquals("Login", task.getTaskName());
	}

	@Test
	public void testTaskHour() {
		//fail("Not yet implemented");
		assertEquals(3, task.getHour());
	}
	
}
