package java14.st5animal;

public class AnimalTest {
    
    public static void main(String[] args){
        
        Animal a=new Animal();
        
        a.Sleep();
        a.eat();
        
        Dog d=new Dog();
        
        d.Sleep();
        d.eat();
        d.bark();
        
        Cat c=new Cat();
        
        c.Sleep();
        c.eat();
        c.play();

    }
    
}
