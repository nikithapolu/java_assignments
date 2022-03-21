package Assignment2.BookStoreApp;

public class BookStore 
{
	private Book[] books;
	private int size;
	private String bookStoreName;
	
	public BookStore(String bookStoreName,int numOfBooksInStore) {
		this.bookStoreName=bookStoreName;
		this.size=numOfBooksInStore;
		this.books=new Book[size];
		init();
	}
	
	public void init()
	{
		books[0]=new Book("Cricket World Cup: The Indian Challenge","Ashis Ray", "54595A12", 20);
		books[1]=new Book("My Journey", "Dr. A.P.J. Abdul Kalam", "58754B45", 10);
		books[2]=new Book("Making of New India", "Dr. Bibek Debroy", "48456A14", 20);
		books[3]=new Book("Whispers of Time", "Dr. Krishna Saksena", "48569A78", 30);
		books[4]=new Book("Beautiful Things� A Memoir", "Hunter Biden", "74896B15", 10);
		books[5]=new Book("Unfinished",	"Priyanka Chopra Jonas", "76258B86",10);
		books[6]=new Book("Life in the Clock Tower Valley", "Shakoor Rather", "96358C78", 10);
		books[7]=new Book("It�s a Wonderful Life", "Ruskin Bond", "48569A42", 15);
		books[8]=new Book("Kashmiri Century: Portrait of a Society in Flux", "Khemlata Wakhlu", "42368C12", 25);
		books[9]=new Book("The India Story", "Bimal Jalan", "15023C85", 17);
	}
	
	public void sell(String bookTitle, int numOfCopies)
	{
		boolean found=false;
		int num=0;
		for(int i=0;i<size;i++)
		{
			if(books[i].getBookTitle().equalsIgnoreCase(bookTitle))
			{		
				found=true;
				num=books[i].getNumOfCopies()-numOfCopies;
				books[i].setNumOfCopies(num);
			}
	    }
		    if(found) System.out.println("Book is sold successfully");
		    else System.out.println("There is no match");		
	}
		

	
	public void order(String ISBN, int numOfCopies)
	{
		boolean found=false;
		int j;
		for(j=0;j<size;j++)
		{
			if(books[j].getISBN().equals(ISBN))	
				{
				found=true;
				books[j].setNumOfCopies(books[j].getNumOfCopies()+numOfCopies);
				}
		}	
		if(found) System.out.println("Book is ordered successfully");
	    else 
	    	{
	    	System.out.println("Book is not ordered");		
	    	}
	}
	
	
	public void display()
	{
	System.out.println("-------------------------Name of Book Store----------------------");	
	System.out.println("--------------------------"+bookStoreName+"------------------------");
	System.out.println("--------------------------Books Details---------------------------");
	for(Book book : books)
	{
		System.out.println("Book Title : "+book.getBookTitle());
		System.out.println("Book Author : "+book.getAuthor());
		System.out.println("Book ISBN : "+book.getISBN());
		System.out.println("Quantity Of Books : "+book.getNumOfCopies());
		System.out.println("***************************************************");
	}
	}
}