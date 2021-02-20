package oop.encapsulation;

public class TraineeInformationSystem {

	public static void main(String[] args) {
		Trainee st1 = new Trainee();
		st1.setStID(101);
		st1.setStName("Nazifa Tasnia");
		st1.setStDOB("01-23-2010");
		st1.setStGrade("A+");
		
		Trainee st2 = new Trainee();
		st2.setStID(102);
		st2.setStName("Nabiha Nudrat");
		st2.setStDOB("12-24-2015");
		st2.setStGrade("A-");
		
		Trainee st3 = new Trainee();
		st3.setStID(103);
		st3.setStName("Mohammad Taslim");
		st3.setStDOB("12-31-2011");
		st3.setStGrade("A-");
		
		System.out.println("Student ID: "+st1.getStID()+ ", Student Name: " 
		+ st1.getStName()+ ", Student DOB: " + st1.getStDOB()+ ", Student Gread: " 
		+ st1.getStGrade());
		
		System.out.println("Student ID: "+st2.getStID()+ ", Student Name: " 
		+ st2.getStName()+ ", Student DOB: " + st2.getStDOB()+ ", Student Gread: " 
		+ st2.getStGrade());
		
		System.out.println("Student ID: "+st3.getStID()+ ", Student Name: " 
		+ st3.getStName()+ ", Student DOB: " + st3.getStDOB()+ ", Student Gread: " 
		+ st3.getStGrade());


	}

}
