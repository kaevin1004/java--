package java04;

public class jv04_ex04_03_배열좌표출력 {
    public static void main(String[] args){
        for(int i=1; i<=5; i=i+1){//줄바꿈으로 이동시 다시 i로 돌아와서 값이 변경됨
            //줄바꿈 추가
            for(int j=1; j<=5; j=j+1){
                System.out.print("["+i+","+j+"]");//i값은 그대로(j값이 변함)
            }
            System.out.println();//줄바꿈을 할때도 이 코드로 씀.
        }
        
        for(int i=1; i<=5; i=i+1){
            //줄바꿈이 적용
            for(int j=1; j<=5; j=j+1){
                if(i==j){//i는 j와 같을 시 if를 실행한다.
                    System.out.print("["+i+","+j+"]");
                }
                else{//i는 j와 같지 않을 시 else가 실행되고 아래 출력으로 넘어감
                    System.out.print("     ");//조건에 맞는 수식 외엔 공백을 추가한다.
                }
            }System.out.println();//줄바꿈을 하여 다시 for문으로 돌아가 다시 실행된다.
        }
    }
    
}
