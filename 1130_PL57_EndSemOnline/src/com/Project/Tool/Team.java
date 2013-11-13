package com.Project.Tool;

import java.util.ArrayList;

public class Team {
	ArrayList<Employee> members = new ArrayList<Employee>();
	
	public void AddMember(Employee emp){
		members.add(emp);
	}

	public ArrayList<Employee> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<Employee> members) {
		this.members = members;
	}

	public void displayTeam() {
		// TODO Auto-generated method stub
		for(Employee emp: members){
			emp.display();
		}
		System.out.println("Total members is: " + CountMembers());
	}
	
	public int CountMembers(){
		int count = 0;
		for(Employee e: members)
		{
			count++;
		}
		return count;
	}
	
}
