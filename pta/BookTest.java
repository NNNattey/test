package com.atnattey.pta;


import java.util.*;
public class BookTest {
    public static void main(String[] args) {
        List <Book>books=new ArrayList<Book>();
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {    String str=in.nextLine();
            String []data=str.split(",");
            Book book=new Book(data[0],Integer.parseInt(data[1]),data[2],Integer.parseInt(data[3]));
            books.add(book);
        }
        
        System.out.println(totalprice(books));    
    }
    
    /*计算所有book的总价*/
    public static int totalprice(List <Book>books) 
    {  int result=0;
        for(int i=0;i<books.size();i++){result+=books.get(i).getPrice();}
        return result;
    }
}

/* 请在这里填写答案 */
class Book{
	private String bookName,author;
	private int price,yearOfPublication;
	
	public Book(String bookName, int price, String author, int yearOfPublication) {
		this.bookName = bookName;
		this.author = author;
		this.yearOfPublication = yearOfPublication;
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	
	
}
