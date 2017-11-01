package product클래스;

import java.util.Scanner;

public class TestProduct {
    
    public static void main(String[] args){
        
        int roomnumber = 0;
        
        Scanner key = new Scanner(System.in);
        
        System.out.print("상품 갯수: ");
        int y = key.nextInt();
        
        Product[] x = new Product[y]; //프로덕트 방 배열 갯수를 만든다
        
        for(; true ;){
            System.out.println("상품추가(1), 상품조회(2), 종료(3)");
            int a = key.nextInt();
            
            if(a == 1){
                System.out.println("상품추가");
                
                System.out.println("상품 종류 책(1), 음악(2), 화학책(3)");
                int b = key.nextInt();
                
                 if(b == 1){
                     Book c = new Book();
                     
                     System.out.print("상품고유 식별자 : ");
                     c.set상품의고유식별자(key.next());
                     System.out.print("상품 설명 : ");
                     c.set상품설명(key.next());
                     System.out.print("생산자 : ");
                     c.set생산자(key.next());
                     System.out.print("가격 정보 : ");
                     c.set가격정보(key.next());
                     System.out.print("ISBN번호 : ");
                     c.setISBN번호(key.next());
                     System.out.print("저자 : ");
                     c.set저자(key.next());
                     System.out.print("책 제목 정보 : ");
                     c.set책제목정보(key.next());
                     
                     
                     x[roomnumber] = c;
                     roomnumber = roomnumber+1;
                     
                     
                 }
                 else if(b == 2){
                     
                     CompactDisc d = new CompactDisc();
                     
                     System.out.print("상품 고유 식별자 : ");
                     d.set상품의고유식별자(key.next());
                     System.out.print("상품 설명 : ");
                     d.set상품설명(key.next());
                     System.out.print("생산자 : ");
                     d.set생산자(key.next());
                     System.out.print("가격 정보 : ");
                     d.set가격정보(key.next());
                     System.out.print("앨범 제목 : ");
                     d.set앨범제목(key.next());
                     System.out.print("가수 이름 : ");
                     d.set가수이름(key.next());
                     
                     x[roomnumber] = d;
                     roomnumber = roomnumber+1;
                     
                 }
                 else if(b == 3){
                    
                     ConversationBook e = new ConversationBook();
                     
                     System.out.print("상품 고유 식별자 : ");
                     e.set상품의고유식별자(key.next());
                     System.out.print("상품 설명 : ");
                     e.set상품설명(key.next());
                     System.out.print("생산자 : ");
                     e.set생산자(key.next());
                     System.out.print("가격 정보 : ");
                     e.set가격정보(key.next());
                     System.out.print("ISBN번호 : ");
                     e.setISBN번호(key.next());
                     System.out.print("저자 : ");
                     e.set저자(key.next());
                     System.out.print("책 제목 정보 : ");
                     e.set책제목정보(key.next());
                     System.out.print("언어명 정보");
                     e.set언어명정보(key.next());
                     
                     x[roomnumber] = e;
                     roomnumber = roomnumber+1;
                 }
            }
            else if(a == 2){
                
                System.out.print("상품번호를 입력하세요 : ");
                int i = key.nextInt();                    

                    System.out.println(x[i].toString());
               
            }
            else if(a == 3){
                
                System.out.print("끝내기");
                break;
            }
        }
    }
    
}
