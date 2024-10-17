/*### 1. *Library Management System*
*Problem Statement:*
You are tasked with designing a *Library Management System* for a university. 
The system should manage books, magazines, research papers, and digital resources, allowing library members to borrow and return these items. 
However, each type of resource (books, magazines, digital resources, etc.) has its own unique properties and borrowing rules.
For instance, a book may have an author, ISBN, and borrowing limit, 
while a digital resource might not have an ISBN but could include a download link and license restrictions.

*Objective:*
- Use abstraction to define a common interface or abstract class, LibraryResource, which includes properties like title, publisher,
and methods such as borrow() and return().
- Each resource type (book, magazine, research paper, digital resource) should inherit from LibraryResource
and implement these common methods while adding their own unique properties and behaviors.

*Key Focus:*
- Design an abstract class that enforces commonality across resources.
- Implement child classes that specialize in handling specific resource details, while ensuring code reusability and simplicity
through abstraction.
*/


package Assignment4abstract;

abstract class LibraryResource
{
	String title;
	String publisher;
	boolean borrowed;
	boolean returned;
	
	public LibraryResource(String title, String publisher, boolean borrowed, boolean returned) 
	{
		this.title = title;
		this.publisher = publisher;
		this.borrowed = borrowed;
		this.returned = returned;
	}
	void display() 
	{
		System.out.println("Title of the book: " + title);
		System.out.println("Publisher of the book: " + publisher);
	}
	abstract void borrow();
	abstract void returnbook();
}

class Books extends LibraryResource
{
	String author;
	int isbn;
	int borrowing_limit;
	static String Status;
	
	public Books(String title, String publisher, boolean borrowed, boolean returned, String author, int isbn,int borrowing_limit)
	{
		super(title, publisher, borrowed, returned);
		this.author = author;
		this.isbn = isbn;
		this.borrowing_limit = borrowing_limit;
	}
	void display() 
	{
		super.display();
		System.out.println("Author name of the book is: " + author);
		System.out.println("ISBN no of the book is: "+ isbn);
		System.out.println("borrowing Day of the book: "+ borrowing_limit);
	}
	void borrow() 
	{
		if(borrowed) 
		{
			Status = "Borrowed";
			System.out.println("Max days to borrow " + title + " book: " + borrowing_limit + " days");
		}
		else
			Status = "Available";
	}
	void returnbook() 
	{	
		if (borrowed) 
		{
			if (returned) 
			{
			Status = "Available";
			System.out.println("The book is returned");
			}
			else
				Status = "Borrowed";
		}	
	}
	void status() {System.out.println("Status: " + Status);}
}

class Magazine extends LibraryResource
{
	static String Status;
	int borrowing_limit;
	
	public Magazine(String title, String publisher, boolean borrowed, boolean returned, int borrowing_limit)
	{
		super(title, publisher, borrowed, returned);
		this.borrowing_limit = borrowing_limit;
	}

	void borrow() 
	{
		if(borrowed) 
		{
			Status = "Borrowed";
			System.out.println("Max days to borrow " + title + " book: " + borrowing_limit + " days");
		}
		else
			Status = "Available";
	}
	
	void returnbook() 
	{	
		if (borrowed) 
		{
			if (returned) 
			{
			Status = "Available";
			System.out.println("The book is returned");
			}
			else
				Status = "Borrowed";
		}	
	}
	void status() {System.out.println("Status: " + Status);}
}
class  research_papers
{
	
}

public class LibraryManagmentSystem 
{
	public static void main(String[] args)
	{
		//Book 1
		Books b = new Books("Science", "NCERT", true, false, "RD.sharma", 5155, 5);
		b.display();
		b.borrow();
		b.returnbook();
		b.status();
		System.out.println("--------------------------------------------------");
		//Book 2
		Books b1 = new Books("Physics", "NCERT", true, true, "sharma", 5255, 4);
		b1.display();
		b1.borrow();
		b1.returnbook();
		b1.status();
		System.out.println("--------------------------------------------------");
		//Magazine 1
		Magazine m = new Magazine("q100", "QQ", false, false, 2);
		m.display();
		m.borrow();
		m.returnbook();
		m.status();
		System.out.println("--------------------------------------------------");
		//Magazine 2
		Magazine m1 = new Magazine("q101", "QQQ", false, true, 3);
		m1.display();
		m1.borrow();
		m1.returnbook();
		m1.status();
	}
}
