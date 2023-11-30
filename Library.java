/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college;

// Java Program to Illustrate students Class
// To Do all the Operations related to students:
// Java Program to Illustrate Application CLass
// To Create The Menu For the Program

// Importing required classes
// Java Program to Illustrate Application CLass
// To Create The Menu For the Program

// Importing required classes
import java.util.Scanner;

// Class
public class Library {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating object of Scanner class
		// to take input from user
		Scanner input = new Scanner(System.in);

		// Displaying menu
		System.out.println(
			"********************Welcome to the GFG Library!********************");
		System.out.println(
			"				 Select From The Following Options:			 ");
		System.out.println(
			"**********************************************************************");

		// Creating object of book class
		books ob = new books();
		// Creating object of students class
		students obStudent = new students();

		int choice;
		int searchChoice;

		// Creating menu
		// using do-while loop
		do {

			ob.dispMenu();
			choice = input.nextInt();

			// Switch case
			switch (choice) {
			case 1 -> {
                            book b = new book();
                            ob.addBook(b);
                        }
			case 2 -> ob.upgradeBookQty();
			case 3 -> {
                            System.out.println(
                                    " press 1 to Search with Book Serial No.");
                            System.out.println(
                                    " Press 2 to Search with Book's Author Name.");
                            searchChoice = input.nextInt();
                            
                            // Nested switch
                            switch (searchChoice) {
                                case 1 -> ob.searchBySno();
                                case 2 -> ob.searchByAuthorName();
                            }
                            // Case
                            // Case
                                                    }
			case 4 -> ob.showAllBooks();
			case 5 -> {
                            students s = new students();
                            obStudent.addStudent(s);
                        }
			case 6 -> obStudent.showAllStudents();
			case 7 -> obStudent.checkOutBook(ob);
			case 8 -> obStudent.checkInBook(ob);
			default -> // Print statement
				System.out.println("ENTER BETWEEN 0 TO 8.");
			}
                    // Case
                    // Case
                    // Case
                    // Case
                    // Case
                    // Case
                    // Case
                    // Case
                    // Default case that will execute for sure
                    // if above cases does not match
                    
		}

		// Checking condition at last where we are
		// checking case entered value is not zero
		while (choice != 0);
	}
}



