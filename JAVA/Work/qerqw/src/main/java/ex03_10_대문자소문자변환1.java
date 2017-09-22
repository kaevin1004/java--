import java.util.Scanner;

public class ex03_10_대문자소문자변환1 {
    public static void main(String[] args){
        
       

            Scanner keyin = new Scanner(System.in);

            //char 사용 시.
            char chr;

            System.out.print("문자를 입력 하세요: ");
            chr = keyin.next().charAt(0);

            System.out.println("ch: " + chr);

            if (chr >= 'a' && chr <= 'z') {
            System.out.println("ch to UpperCase: " + Character.toUpperCase(chr));
            }
            else if (chr >= 'A' && chr <= 'Z') {
            System.out.println("ch to LowerCase: " + Character.toLowerCase(chr));
            }

            //String 사용 시.
            String str;
            System.out.print("문자열을 입력 하세요: ");
            str = keyin.next();

            System.out.println("ch: " + str);
            System.out.println("ch to UpperCase: " + str.toUpperCase());
            System.out.println("ch to LowerCase: " + str.toLowerCase());
            }
    }
    

