package test01_spring;

public class BookVO {
	private int bookNum;
	private String title;
	private String publisher;
	private String writer;
	private int price;
	public BookVO() {
		super();
	}
	public BookVO(int bookNum, String title, String publisher, String writer, int price) {
		super();
		this.bookNum = bookNum;
		this.title = title;
		this.publisher = publisher;
		this.writer = writer;
		this.price = price;
	}
	public BookVO(String title, String publisher, String writer, int price) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.writer = writer;
		this.price = price;
	}
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookVO [bookNum=" + bookNum + ", title=" + title + ", publisher=" + publisher + ", writer=" + writer
				+ ", price=" + price + "]";
	}
	
	
	

}
