package com.project;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	int choice=0;
    	while(choice!=3) {
        System.out.println( "project started" );
        System.out.println("press 1: addrecords");
        System.out.println("press 2: read details");
        System.out.println("press 3: exit ");
        System.out.println("Enter your choice");
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			Student student=new Student();
			StudentDao studentdao=new StudentDao();
			studentdao.addRecords(student);
			break;
			
		case 2:
			StudentDao studentdao1=new StudentDao();
			Student s=studentdao1.read();
			if(s!=null) {
				System.out.println(s);
			}
			else {
				System.out.println("Record not found");
			}
			System.out.println();
			break;
			
		case 3:
			System.exit(0);
			break;
			
		default:
			System.out.println("please enter valid input");
			break;
		}
        
    	}
    }
}
