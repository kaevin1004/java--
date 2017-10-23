package java17.st2product;

public class CoversationBook extends Book{
    
    private String 언어;

    public String get언어() {
        return 언어;
    }

    public void set언어(String 언어) {
        this.언어 = 언어;
    }

    @Override
    public String toString() {
        return "CoversationBook [언어=" + 언어 + ", toString()=" + super.toString()
                + "]";
    }

    public CoversationBook() {
        super();
    }

    public CoversationBook(String 상품설명, String 생산자, String 가격정보, String 고유식별자,
            String iSBN번호, String 저자, String 책제목, String 언어) {
        super(상품설명, 생산자, 가격정보, 고유식별자, iSBN번호, 저자, 책제목);
        this.언어 = 언어;
    }
    
    
    
}
