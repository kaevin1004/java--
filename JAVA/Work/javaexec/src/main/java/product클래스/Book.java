package product클래스;

public class Book extends Product{
    
    private String ISBN번호;
    private String 저자;
    private String 책제목정보;
    
    
    public String getISBN번호() {
        return ISBN번호;
    }
    public void setISBN번호(String iSBN번호) {
        ISBN번호 = iSBN번호;
    }
    public String get저자() {
        return 저자;
    }
    public void set저자(String 저자) {
        this.저자 = 저자;
    }
    public String get책제목정보() {
        return 책제목정보;
    }
    public void set책제목정보(String 책제목정보) {
        this.책제목정보 = 책제목정보;
    }
    
    @Override
    public String toString() {
        return "Book [ISBN번호=" + ISBN번호 + ", 저자=" + 저자 + ", 책제목정보=" + 책제목정보
                + ", toString()=" + super.toString() + "]";
    }
    
    public Book() {
        super();
    }
    
    
    public Book(String iSBN번호, String 저자, String 책제목정보) {
        super();
        ISBN번호 = iSBN번호;
        this.저자 = 저자;
        this.책제목정보 = 책제목정보;
    }
   
    
}
