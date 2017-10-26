package java19.st3studentmap;

public class Student {
    
   private int number;
   private String name;
   
//getter & setter  만들기
   
   public int getNumber() {
       return number;
   }
   public void setNumber(int number) {
       this.number = number;
   }
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }

   //toString() 만들기

   @Override
   public String toString() {
       return "Student [number=" + number + ", name=" + name + "]";
   }

   // constructor(생성자) 만들기
   public Student() {
       super();
   }

   public Student(int number, String name) {
       super();
       this.number = number;
       this.name = name;
   }
   
}
