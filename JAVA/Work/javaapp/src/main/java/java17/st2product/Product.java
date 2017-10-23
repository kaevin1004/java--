package java17.st2product;

public class Product {
    
    private String 상품설명;
    private String 생산자;
    private String 가격정보;
    private String 고유식별자;
    
    
    public String get상품설명() {
        return 상품설명;
    }
    public void set상품설명(String 상품설명) {
        this.상품설명 = 상품설명;
    }
    public String get생산자() {
        return 생산자;
    }
    public void set생산자(String 생산자) {
        this.생산자 = 생산자;
    }
    public String get가격정보() {
        return 가격정보;
    }
    public void set가격정보(String 가격정보) {
        this.가격정보 = 가격정보;
    }
    public String get고유식별자() {
        return 고유식별자;
    }
    public void set고유식별자(String 고유식별자) {
        this.고유식별자 = 고유식별자;
    }
    
    
    @Override
    public String toString() {
        return "Product [상품설명=" + 상품설명 + ", 생산자=" + 생산자 + ", 가격정보=" + 가격정보
                + ", 고유식별자=" + 고유식별자 + "]";
    }
    
    public Product() {
        super();
    }
    
    public Product(String 상품설명, String 생산자, String 가격정보, String 고유식별자) {
        super();
        this.상품설명 = 상품설명;
        this.생산자 = 생산자;
        this.가격정보 = 가격정보;
        this.고유식별자 = 고유식별자;
    }
    
    
    
    
    
}
