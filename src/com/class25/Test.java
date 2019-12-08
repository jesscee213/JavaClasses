package com.class25;

public class Test {
public static void main(String[] args) {
		
		System.out.println("Creating an object of a Employee class");
		Employee emp=new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax";
		emp.work();
		emp.getPaid();
		
		System.out.println("---Creating an object of a Scrum Team class-----");
		ScrumTeam sm=new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product Backlog, Sprint Backlog, BurnDown Chart";
		sm.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		sm.attendScrumMeetings();
		
		System.out.println("---Creating an object of a Developer class-----");
		Developer dev=new Developer();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		dev.attendScrumMeetings();
		System.out.println("Creating an object of ScrumMaster Team Class");
        ScrumMaster scrumMas = new ScrumMaster();
        scrumMas.salary = 100000;
        scrumMas.work();
        scrumMas.getPaid();
        scrumMas.coordinateTeam();
        scrumMas.artifacts = "Sprint backlog";
        scrumMas.ceremonies = "Sprint demo, Planning, Retro, Daily standup";
        scrumMas.attendScrumMeeting();
        System.out.println("Creating an object of ProductOwner Team Class");
        ProductOwner proOwner = new ProductOwner();
        proOwner.salary = 90000;
        proOwner.work();
        proOwner.getPaid();
        proOwner.prioritize();
        proOwner.artifacts = "Sprint backlog";
        proOwner.ceremonies = "Sprint demo, Planning, Retro, Daily standup";
        proOwner.attendScrumMeeting();
        System.out.println("Creating an object of BussinessAnalyst Team Class");
        BusinessAnalyst bussAnalyst = new BusinessAnalyst();
        bussAnalyst.salary = 80000;
        bussAnalyst.work();
        bussAnalyst.getPaid();
        bussAnalyst.writeRequirments();
        bussAnalyst.artifacts = "Sprint backlog";
        bussAnalyst.ceremonies = "Sprint demo, Planning, Retro, Daily standup";
        bussAnalyst.attendScrumMeeting();
    }



}


