package com.Project.Tool;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee m1 = new Employee("Rajeev", 21);
		m1.display();
		Employee m2 = new Employee("Raj", 21);
		m2.display();
		Employee m3 = new Employee("Krishna", 21);
		m3.display();
		Employee m4 = new Employee("Peter", 21);
		m4.display();
		Employee po = new Employee("Nadia", 21);
		po.display();
		Employee sm = new Employee("KKC", 21);
		sm.display();
		
		Team team = new Team();
		team.AddMember(m1);
		team.AddMember(m2);
		team.AddMember(m3);
		team.AddMember(m4);
		team.AddMember(po);
		team.AddMember(sm);
		
		team.displayTeam();
		
		
	}

}
