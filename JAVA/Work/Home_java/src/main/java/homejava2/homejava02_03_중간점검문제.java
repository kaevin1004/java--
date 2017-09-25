package homejava2;

public class homejava02_03_중간점검문제 {
    public static void main(String[] args){
        
        int x=5;
        int y=5;
        int a=++x*2;//+먼저 실행됨 5+1 (*2)
        int b=y++*2;//5*2가 실행되어서 값이 끝이나고 뒤늦게 +1이 되어 y는 6인 상태
        int u=y+2;//y가 6인 상태에서 +2를 하여 8이 나옴
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(u);
    }
    
}
