package com.Project.Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.Project.Tool.Employee;
import com.Project.Tool.Team;

public class TeamTest {
	
	Team team;
	Employee m1, m2, m3, m4, po, sm;

	@Before
	public void setUp() throws Exception {
		team = new Team();
		m1 = new Employee("Rajeev", 21);
		m2 = new Employee("Raj", 21);
		m3 = new Employee("Krishna", 21);
		m4 = new Employee("Peter", 21);
		po = new Employee("Nadia", 21);
		sm = new Employee("KKC", 21);
		
		team.AddMember(m1);
		team.AddMember(m2);
		team.AddMember(m3);
		team.AddMember(m4);
		team.AddMember(po);
		team.AddMember(sm);
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(6, team.CountMembers());
	}

}
