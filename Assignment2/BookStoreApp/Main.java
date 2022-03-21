package Assignment2.BookStoreApp;
public class Main
{
    public static void main(String gg[])
	{
     BookStore bookStore=new BookStore("Akshata's Book Store",10);
     bookStore.sell("Making of New India", 5);
     bookStore.order("74896B15",10);
     bookStore.display();
	}
}
