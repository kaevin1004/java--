package java04;

public class jv04_21_무한루프 {
    public static void main(String[] args){
        
        for(int i=0; true; i=i+1){//무한루프 만들때 true를 넣는다.
            System.out.println("무한루프 :::"+i);
            
            //i>100 이면 무한루프 탈출
            if(i>100){//i가 100이상이면 if값이 실행됨.
                break;
            }
        }
    }
    
}
