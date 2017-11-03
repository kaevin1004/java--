package 문제풀이복습.st전화번호관리프로그램;

import java.util.Scanner;

public class PhoneInfoTest {
    
    public static void main(String[] args){
        
        int roomnumber = 0;
        
        Scanner key = new Scanner(System.in);
        
        System.out.print("입력하실 사람 수를 적으시오: ");
        int y = key.nextInt();
        System.out.println("\n");
        
        PhoneInfo[] x = new PhoneInfo[y];
                      
        
        for(; true ;){
            
            System.out.println("1.데이터 입력 \n2.데이터 검색 \n3.데이터 삭제 \n4.프로그램 종료");
            System.out.print("선택: ");
            int a = key.nextInt();
            System.out.println("\n");
            
            if(a == 1){
                
                System.out.println("데이터를 입력하세요");
                
                System.out.println("1.일반, 2.대학, 3.회사");
                System.out.print("선택: ");
                int b = key.nextInt();
                System.out.println("\n");
                
                if(b == 1){
                    PhoneInfo c = new PhoneInfo();
                    
                    
                    System.out.print("이름: ");
                    c.setName(key.next());
                    System.out.print("전화번호: ");
                    c.setPhoneNumer(key.next());
                    
                    System.out.println("입력이 완료되었습니다.");
                    System.out.println("\n");
                  
                    x[roomnumber] = c;
                    roomnumber = roomnumber+1;
                }
                else if(b == 2){
                    
                    PhoneUnivInfo d = new PhoneUnivInfo();
                 
                    System.out.print("이름: ");
                    d.setName(key.next());
                    System.out.print("전화번호: ");
                    d.setPhoneNumer(key.next());
                    System.out.print("전공: ");
                    d.setMajor(key.next());
                    System.out.print("학년: ");
                    d.setYear(key.nextInt());
                   
                    x[roomnumber] = d;
                    roomnumber = roomnumber+1;
                    
                }
                else if(b == 3){
                    
                    PhoneCompanyInfo e = new PhoneCompanyInfo();
                    
                    System.out.print("이름: ");
                    e.setName(key.next());
                    System.out.print("전화번호: ");
                    e.setPhoneNumer(key.next());
                    System.out.print("회사: ");
                    e.setCompany(key.next());
                    
                    x[roomnumber] = e;
                    roomnumber = roomnumber+1;
                    
                }
                
            }
            else if(a == 2){
                
                System.out.print("검색할 데이터 이름: ");
                String f = key.next();
                System.out.println("데이터 검색을 시작합니다.");
                System.out.println("\n");
                
                for(int i=0; i<=roomnumber-1; i=i+1){
                    
                    if(f.equals(x[i].getName())){
                        
                    System.out.println(x[i].toString());
                    
                    System.out.println("\n");
                    }
                    else{
                        System.out.println("데이터가 없습니다.");
                        System.out.println("\n");
                        
                    }
                    
                }
                System.out.println("검색이 완료되었습니다.");
                System.out.println("\n");


                
            }
            else if(a == 3){
                System.out.println("삭제할 데이터를 입력하세요.");
                System.out.print("테이터 : ");
                String h = key.next();
                
                for(int i=0; i<=roomnumber-1; i= i+1){
                    
                    if(h.equals(x[i].getName())){
                        
                        if(i+1 < x.length){
                            
                            x[i] = x[i+1];
                            
                            
                            
                            System.out.println("삭제가 완료되었습니다.");
                            System.out.println("\n");
                            
                        }
                        
                        
                    }
                    else{
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.println("\n");
                    }
                    System.out.println();
                    
                }
                 
                
            }
            else if(a == 4){
                
                System.out.println("프로그램을 종료합니다.");
                
                break;
                
            }
            else if(a == 5){
                
                System.out.println("5에 해당하는 선택은 존재하지 않습니다.\n메뉴 선택을 처음부터 다시 진행합니다.");
                System.out.println("\n");
            }
        }
    }
    
}
