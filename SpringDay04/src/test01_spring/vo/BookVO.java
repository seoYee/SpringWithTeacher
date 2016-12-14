package test01_spring.vo;
 
public class BookVO {
    private int bookNum;
    private String title;
    private String writer;
    private int price;
    private String publisher;
////////////////////////////////////////////////////////
    public BookVO(){}
    public BookVO(String title, String writer, int price, String publisher) {
        this.title = title;
        this.writer = writer;
        this.price = price;
        this.publisher = publisher;
    }
    public BookVO(int bookNum,String title, String writer, int price, String publisher) {
        this.bookNum = bookNum;
        this.title = title;
        this.writer = writer;
        this.price = price;
        this.publisher = publisher;
    }   
////////////////////////////////////////////////////////    
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
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
     
    @Override
    public String toString() {
        return "BookVO [bookNum=" + bookNum + ", title=" + title + ", writer=" + writer + ", price=" + price
                + ", publisher=" + publisher + "]";
    }   
}