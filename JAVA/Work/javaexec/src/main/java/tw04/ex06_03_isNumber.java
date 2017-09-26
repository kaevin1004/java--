package tw04;

public class ex06_03_isNumber {
    
    public static void main(String[] args){
        
        
        String a="박";//문자열 변수 선언 생성.
        System.out.println(isNumber(a));//=아래 메서드 리턴값(i)
    }
    public static boolean isNumber(String x){//String x는 String a 값을 복사한다.
//메서드 타입 public static ("변수타입") 메소드명(매개변수 변수명){
        //}
        boolean i=false;//true나false는 boolean 변수를 생성
        //아래 리턴값을 출려하려면 위의 변수 값을 생성해야한다.
        if(x.equals(null)||x.equals("")|| x.equals("박")){
            //String x에 대입된 값이 if설정에 적용된다.
            i=false;//새로 만든 변수값을 적용한다.
        }
        else{
            i=true;//새로만든 변수 값을 적용한다.
        }
        return i;//void가 아니면 값이 같이 복사되어 대입된다.isNumber(a)가 i로 변한다.
        //boolean은 (true,fales)가 오게 된다.
    }
    //메소드 타입에 따라 리턴 값이 달라진다.
}
