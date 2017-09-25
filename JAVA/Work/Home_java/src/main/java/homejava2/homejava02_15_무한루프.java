package homejava2;

public class homejava02_15_무한루프 {
    public static void main(String[] args){
        
        for(int i=0; true; i=i+1){
            System.out.println("무한루프:::"+i);
            
            if(i>100){
                break;
            }
        }
    }
    
}
