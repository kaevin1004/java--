package product클래스;

public class ConversationBook extends Book{
    
    private String 언어명정보;

    public String get언어명정보() {
        return 언어명정보;
    }

    public void set언어명정보(String 언어명정보) {
        this.언어명정보 = 언어명정보;
    }

    @Override
    public String toString() {
        return "ConversationBook [언어명정보=" + 언어명정보 + ", toString()="
                + super.toString() + "]";
    }

    public ConversationBook() {
        super();
    }

    public ConversationBook(String 언어명정보) {
        super();
        this.언어명정보 = 언어명정보;
    }
    
    
    
    
    
}
