package com.flp.ems.view;
import java.util.Scanner;
public class Bootclass {
	public static void main(String args[]){
    System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
    System.out.println("1.Add Employee\n2.Modify Employee\n3.Remove Employee\n4.search Employeen\n5.getAllEmployee");
    System.out.println("Enter Your Choice");
	Scanner in= new Scanner(System.in);
	int a= in.nextInt();
	menuselection(a);
	}
	static void menuselection(int i){
	
		userinteraction u=new userinteraction();
		switch(i){
		case 1:
			u.addemployee();
case 2:
u.modifyemployee();
case 3:
u.removeemployee();
case 4:
u.searchemployee();
case 5:
u.getallemployee();
default:
System.out.println("In default");
		}
	}
			
				
}
