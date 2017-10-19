package java14.st7student;

public class GraduateStudentTest {
    
    public static void main(String[] args){
        
        GraduateStudent s1 = new GraduateStudent();
        
        
        s1.lab = "하";
        s1.setNumber(2);
        s1.name = "루";
        s1.phone = "요";
        
        System.out.println(s1.toString());
        
        GraduateStudent s2 = new GraduateStudent();
        
        s2.setLab("살려주시오");
        s2.setName("제발이오");
        s2.setPhone("주겠소");
        s2.setNumber(500000000);
        
        
        System.out.println(s2.toString());
    
        GraduateStudent s3 = new GraduateStudent(1, "살려줘요", "제발요", "돈 줄게요");
        
        System.out.println(s3.toString());
    }
    
}
