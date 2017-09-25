package homejava2;

public class homejava02_02_형변환 {
    public static void main(String[] args){
        int a=1+'2';
 //변환가능(정수 문자 실수 사이에만 형변환 가능)
        
        //a='2'+true
        a='2'+((true)? 1:0);//아세키코드 2(50)+1
        System.out.println(a);
        
        //a="15"-5
        a=Integer.valueOf("15")-5;//(15가 숫자로 변형)-5
        System.out.println(a);
        
        //a="1"+'2'
        a=Integer.valueOf("1")+'2';//아세키코드1(49)+2
        System.out.println(a);
        
        //a=false+true
        a=((false)? 1:0)+((true)? 1:0);
        System.out.println(a);//false면 0이고+true면1
    }//그래서 0+1=1
    
}
