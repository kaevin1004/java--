package product클래스;

public class CompactDisc extends Product{
    
    private String 앨범제목;
    private String 가수이름;
    
    
    public String get앨범제목() {
        return 앨범제목;
    }
    public void set앨범제목(String 앨범제목) {
        this.앨범제목 = 앨범제목;
    }
    public String get가수이름() {
        return 가수이름;
    }
    public void set가수이름(String 가수이름) {
        this.가수이름 = 가수이름;
    }
    
    @Override
    public String toString() {
        return "CompactDisc [앨범제목=" + 앨범제목 + ", 가수이름=" + 가수이름 + ", toString()="
                + super.toString() + "]";
    }
    
    public CompactDisc() {
        super();
    }
    
    public CompactDisc(String 앨범제목, String 가수이름) {
        super();
        this.앨범제목 = 앨범제목;
        this.가수이름 = 가수이름;
    }
    
    
    
}
