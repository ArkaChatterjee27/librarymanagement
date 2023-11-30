/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college;
// Java Program to Illustrate Student Class
// to take Input from the student and related Information

// Importing 
// Java Program to Illustrate students Class
// To Do all the Operations related to students:
// add Students,check-in books,check out books,ValidStudent

// Importing required classes
// Java Program to Illustrate Student Class
// to take Input from the student and related Information

// Importing required classes
import java.util.Scanner;

// Class
public class Student {

	// Class member variables
	String studentName;
	String regNum;

	book borrowedBooks[] = new book[3];
	public int booksCount = 0;

	// Creating object of Scanner class to
	// take input from user
	Scanner input = new Scanner(System.in);

	// Constructor
	public Student()
	{
		// Print statement
		System.out.println("Enter Student Name:");

		// This keywords refers to current instance
		this.studentName = input.nextLine();

		// Print statement
		System.out.println("Enter Registration Number:");
		this.regNum = input.nextLine();
	}
}




