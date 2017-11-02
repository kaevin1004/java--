package 문제풀이복습.st전화번호관리프로그램;

public class PhoneCompanyInfo extends PhoneInfo{
    
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "PhoneCompanyInfo [company=" + company + ", toString()="
                + super.toString() + "]";
    }

    public PhoneCompanyInfo() {
        super();
    }

    public PhoneCompanyInfo(String company) {
        super();
        this.company = company;
    }
     
}
