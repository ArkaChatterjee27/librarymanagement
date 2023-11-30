/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college;
import java.util.Scanner;
 class book {

    int sNo;
    String bookName;
    String authorName;
    String bookQtyCopy;
    String bookQty;
    public String getBookQtyCopy(){
         return bookQtyCopy;
        
    }
    
}


// CLass
public class books {

	// Class data members
	book theBooks[] = new book[50];
	public static int count;

	Scanner input = new Scanner(System.in);
    private Object bookQtyCopy;

	// Method 1
	// To compare books

    /**
     *
     
     * @return
     */
	public int compareBookObjects()
	{
              
           bookName b1 = new  bookName();
             bookName b2 = new bookName();
           

		// If book name matches
		if (b1 == b2) {
                    // Printing book exists
                    System.out.println(
                            "Book of this Name Already Exists.");
                    return 0;
                } else {
                }
                
                
                
             
                
           
                
		// if book serial matches
		if (b1.sNo != b2.sNo) {
		} else {
                    // Print book exists
                    System.out.println(
                            "Book of this Serial No Already Exists.");
                    
                    return 0;
            }
		return 1;
	}

	// Method 2
	// To add book

    /**
     *
     * @param 
     */
	public void addBook(book b)
	{

		for (int i = 0; i < count; i++) {

			if (this.compareBookObjects(b, this.theBooks[i])
				== 0)
				return;
		}

		if (count < 50) {

			theBooks[count] = b;
			count++;
		}
		else {

			System.out.println(
				"No Space to Add More Books.");
		}
	}

	// Method 3
	// To search book by serial number

    /**
     *
     */
	public void searchBySno()
	{

		// Display message
		System.out.println(
			"\t\t\t\tSEARCH BY SERIAL NUMBER\n");

		// Class data members
		int sNo;
		System.out.println("Enter Serial No of Book:");
		sNo = input.nextInt();

		int flag = 0;
		System.out.println(
			"S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

		for (int i = 0; i < count; i++) {
			if (sNo == theBooks[i].sNo) {
				System.out.println(
					theBooks[i].sNo + "\t\t"
					+ theBooks[i].bookName + "\t\t"
					+ theBooks[i].authorName + "\t\t"
					+ theBooks[i].bookQtyCopy + "\t\t"
					+ theBooks[i].bookQty);
				flag++;
				return;
			}
		}
		if (flag == 0)
			System.out.println("No Book for Serial No "
							+ sNo + " Found.");
	}

	// Method 4
	// To search author by name
	public void searchByAuthorName()
	{

		// Display message
		System.out.println(
			"\t\t\t\tSEARCH BY AUTHOR'S NAME");

		input.nextLine();

		System.out.println("Enter Author Name:");
		String authorName = input.nextLine();

		int flag = 0;

		System.out.println(
			"S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

		for (int i = 0; i < count; i++) {

			// if author matches any of its book
			if (authorName.equalsIgnoreCase(
					theBooks[i].authorName)) {

				// Print below corresponding credentials
				System.out.println(
					theBooks[i].sNo + "\t\t"
					+ theBooks[i].bookName + "\t\t"
					+ theBooks[i].authorName + "\t\t"
					+ theBooks[i].bookQtyCopy + "\t\t"
					+ theBooks[i].bookQty);
				flag++;
			}
		}

		// Else no book matches for author
		if (flag == 0)
			System.out.println("No Books of " + authorName
							+ " Found.");
	}

	// Method 5
	// To display all books
	public void showAllBooks()
	{

		System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
		System.out.println(
			"S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

		for (int i = 0; i < count; i++) {

			System.out.println(
				theBooks[i].sNo + "\t\t"
				+ theBooks[i].bookName + "\t\t"
				+ theBooks[i].authorName + "\t\t"
				+ theBooks[i].bookQtyCopy + "\t\t"
				+ theBooks[i].bookQty);
		}
	}

	// Method 6
	// To edit the book
	public void upgradeBookQty()
	{

		System.out.println(
			"\t\t\t\tUPGRADE QUANTITY OF A BOOK\n");
		System.out.println("Enter Serial No of Book");

		int sNo = input.nextInt();

		for (int i = 0; i < count; i++) {

			if (sNo == theBooks[i].sNo) {

				// Display message
				System.out.println(
					"Enter No of Books to be Added:");

				int addingQty = input.nextInt();
				theBooks[i].bookQty += addingQty;
				theBooks[i].bookQtyCopy += addingQty;

				return;
			}
		}
	}

	// Method 7
	// To create menu
	public void dispMenu()
	{

		// Displaying menu
		System.out.println(
			"----------------------------------------------------------------------------------------------------------");
		System.out.println("Press 1 to Add new Book.");
		System.out.println("Press 0 to Exit Application.");
		System.out.println(
			"Press 2 to Upgrade Quantity of a Book.");
		System.out.println("Press 3 to Search a Book.");
		System.out.println("Press 4 to Show All Books.");
		System.out.println("Press 5 to Register Student.");
		System.out.println(
			"Press 6 to Show All Registered Students.");
		System.out.println("Press 7 to Check Out Book. ");
		System.out.println("Press 8 to Check In Book");
		System.out.println(
			"-------------------------------------------------------------------------------------------------------");
	}

	// Method 8
	// // Java Program to Illustrate books class
// To Do all the Operations related to Books such as
// add, check-in, check-out,Valid books,Update books

// Importing required classes

	// Method 1
	// To compare books
	public int compareBookObjects(book b1, book b2)
	{

		// If book name matches
		if (b1.bookName.equalsIgnoreCase(b2.bookName)) {

			// Printing book exists
			System.out.println(
				"Book of this Name Already Exists.");
			return 0;
		}

		// if book serial matches
		if (b1.sNo == b2.sNo) {

			// Print book exists
			System.out.println(
				"Book of this Serial No Already Exists.");

			return 0;
		}
		return 1;
	}

	// Method 2
	// To add book
	public void addBook()
	{
            book b = null;
		for (int i = 0; i < count; i++) {

			if (this.compareBookObjects(b, this.theBooks[i])
				== 0)
				return;
		}

		if (count < 50) {

			theBooks[count] = b;
			count++;
		}
		else {

			System.out.println(
				"No Space to Add More Books.");
		}
	}

	// Method 3
	// To search book by serial number
	
	// Method 4
	// To search author by name
	
	// Method 5
	// To display all books
	
	// Method 6
	// To edit the book
	
	// Method 7
	// To create menu
	

	// Method 8
	// To search the library
	public int isAvailable(int sNo)
        {    
            
 
        for (int i = 0; i < count; i++) {
             bookQtyCopy = null;
            if (sNo == theBooks[i].sNo) {
                if(bookQtyCopy.equals(theBooks[i].bookQtyCopy))
                    
                 {
                    
    // Your code hereSystem.out.println(
                        System.out.println(
                        "Book is Available.");
                    return i;
                }



                System.out.println("Book is Unavailable");
                return -1;
            }
        }
 
        System.out.println("No Book of Serial Number "
                           + " Available in Library.");
        return -1;
    }
 
    // Method 9
    // To remove the book from the library
    public book checkOutBook(){
    
 
        System.out.println(
            "Enter Serial No of Book to be Checked Out.");
        int sNo = input.nextInt();
 
        int bookIndex = isAvailable(sNo);
        
        if (bookIndex != -1) {
            int c = (int)bookQtyCopy;
            
            c--;
            
            return theBooks[bookIndex];  
        }
            
        
        return null;
    }
       
    
 
    // Method 10
    // To add the Book to the Library
        @SuppressWarnings("NonPublicExported")
    public int checkInBook(book b)
            
    {
        int k = (int)bookQtyCopy;
        for (int i = 0; i < count; i++) {
            if (b.equals(theBooks[i])) {
                k++;
                return i;
            }
        }
            return 0;
    }

    private static class bookName {

        private boolean sNo;
        

        public bookName() {
        }
    }

    

     

        
    
    
    }


// Java Program to Illustrate Student Class
// to take Input from the student and related Information
 
// Importing required classes
 
// Class

    

    
    
    
    

        
        //<editor-fold defaultstate="collapsed" desc="}">
        /*}*/
//</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="comment">
            /*}*/
//</editor-fold>
        /*}*/

  
    


   





    

