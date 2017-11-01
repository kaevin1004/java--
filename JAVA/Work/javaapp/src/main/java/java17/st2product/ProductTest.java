package java17.st2product;

import java.util.Scanner;

public class ProductTest {
    
    static Scanner key = new Scanner(System.in);
    
    static int roomid =0;
    
    public static void main(String[] args){
        
        
        //int[] a = new int[10];
        Product[] a = new Product[10];
        

        for(; true ;){
            
            //상품 추가 메뉴 출력
            System.out.println("상품추가(1), 상품조회(2), 종료(3)");
            
            int menu = key.nextInt();
            
            if(menu==1){// 상품입력
                상품입력(a);
            }
            else if(menu==2){//상품출력
                상품출력(a);
            }
            else if(menu==3){
                
                break;
            }
            else{
                System.out.println("잘못된 입력");
            }
        }
    }
 
//상품 종류 입력 받는 코드를 추가
    private static void 상품입력(Product[] a) {
        
        System.out.println("상품 종류 책(1), 음악(2), 회화책(3)");
        int menu = key.nextInt();
        
        if(menu==1){
            Book book = new Book();
            
            System.out.println("상품 설명");  
            book.set상품설명(key.next());
            
            System.out.println("생산자");      
            book.set생산자(key.next());
            
            System.out.println("가격"); 
            book.set가격정보(key.next());
            
            System.out.println("ISBN번호"); 
            book.setISBN번호(key.next());
            
            System.out.println("책 제목"); 
            book.set책제목(key.next());
            
            System.out.println("저자"); 
            book.set저자(key.next());
            
            
            a[roomid] = book;
            roomid = roomid + 1;
        }
        else if(menu==2){
            CompatDisc cd = new CompatDisc();
            
            System.out.println("상품 설명");  
            cd.set상품설명(key.next());
            
            System.out.println("생산자");      
            cd.set생산자(key.next());
            
            System.out.println("가격"); 
            cd.set가격정보(key.next());
            
            System.out.println("앨범 제목"); 
            cd.set앨범제목(key.next());
            
            System.out.println("가수"); 
            cd.set가수이름(key.next());
            
            a[roomid] = cd;
            roomid = roomid + 1;
            
          
        }
        else if(menu==3){
            
            CoversationBook x = new CoversationBook();
            
            System.out.println("상품 설명");  
            x.set상품설명(key.next());
            
            System.out.println("생산자");      
            x.set생산자(key.next());
            
            System.out.println("가격"); 
            x.set가격정보(key.next());
            
            System.out.println("ISBN번호"); 
            x.setISBN번호(key.next());
            
            System.out.println("저자"); 
            x.set저자(key.next());
            
            System.out.println("책 제목"); 
            x.set책제목(key.next());
            
            System.out.println("언어"); 
            x.set언어(key.next());
            
            
            a[roomid] = new CoversationBook();
            roomid = roomid + 1;
        }
         
        
    }
    
     private static void 상품출력(Product[] a) {
        
         for(int i=0; i<=a.length-1; i=i+1){
             System.out.println(a[i].toString());
             
         }
    }
     
}
