package java06;

public class jv06_03_메서드호출순서 
{
    public static void main(String[] args)
    {

        int a=3, b=4;
        int i=Add(a,b);//아래 x,y에서 복사되어 대입된다.
        //a=x, y=b
        System.out.print(i);
        
        
    }
    public static int Add(int x, int y)//int 메서드
    {
         return x+y;//메소드 호출 끝은 리턴이 와야 함.
    }
    
}
