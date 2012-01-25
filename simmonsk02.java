


public class simmonsk02 {
	
	/**
	* A class that maintains information on a book.
	* This might form part of a larger application such
	* as a library system, for instance.
	*
	* @author (Kyle Simmons)
	* @version (01/23/2012)
	*/
	
	
	public enum Binding{HARDBACK,PAPERBACK};
	
	
	static class Book {
		
	// Fields
	String author;
	String title;
	Binding binding;
	int pages;
	String refNumber;
	
	
	
	
	//Constructor
	
	Book(String bookAuthor, String bookTitle, Binding bindingType, int pageNumber) {
	author = bookAuthor;
	title = bookTitle;
	binding = bindingType;
	pages = pageNumber;
	refNumber = "";
	}

	
	//Accessors
	
	public String  getAuthor()
	{
		return author;	
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public Binding getBinding()
	{
		return binding;
	}
	
	public int getPages()
	{
		return pages;
	}
	
	public String getRefNumber()
	{
		return refNumber;
	}
	
	
	//Mutator
	
	public void setRefNumber(String refNumber)
	{
		if (!(refNumber.length() >= 3))
		{
			System.out.println("Danger Will Robinson!");
		}
		else 
		{
			this.refNumber = refNumber;
		}
	}
	
	
	//Printing
	
	public void printAuthor()
	{
		System.out.println(author);
	}
	
	public void printTitle()
	{
		System.out.println(title);
	}
		
	public void printBinding()
	{
		System.out.println(binding);
	}
	
	public void printDetails()
	{
		
		System.out.println(author);
		System.out.println(title);
		System.out.println(binding);
		System.out.println(pages);
		
		if (!(refNumber == "" || refNumber == null))
		{
			System.out.println(refNumber);
		}
		else
		{
			System.out.println("refNumber = ZZZ");
		}
	}
	}

}
