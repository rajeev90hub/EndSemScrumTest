package com.Project.Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.Project.Tool.Sprint;

public class SprintTest {

	Sprint sprint;
	@Before
	public void setUp() throws Exception {
		sprint = new Sprint();
		sprint.setDuration(5);
	}

	@Test
	public void testDuration() {
		//fail("Not yet implemented");
		assertEquals(5, sprint.getDuration());	
		
	}

}
