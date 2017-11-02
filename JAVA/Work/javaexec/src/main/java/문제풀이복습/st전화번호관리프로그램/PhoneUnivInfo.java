package 문제풀이복습.st전화번호관리프로그램;

public class PhoneUnivInfo extends PhoneInfo{
    
    private String major;
    private int year = 0;
    
    
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public String toString() {
        return "PhoneUnivInfo [major=" + major + ", year=" + year
                + ", toString()=" + super.toString() + "]";
    }
    
    public PhoneUnivInfo() {
        super();
    }
    
    public PhoneUnivInfo(String major, int year) {
        super();
        this.major = major;
        this.year = year;
    }
     
}
