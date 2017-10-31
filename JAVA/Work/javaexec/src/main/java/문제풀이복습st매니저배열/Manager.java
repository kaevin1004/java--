package 문제풀이복습st매니저배열;

import javax.sound.midi.MidiDevice.Info;

public class Manager extends Employee{
    
    private int bouns = 0;
    

    public int getBouns() {
        return bouns;
    }

    public void setBouns(int bouns) {
        this.bouns = bouns;
    }

    

    @Override
    public String toString() {
        return "Manager [bouns=" + bouns + ", salary=" + salary
                + ", toString()=" + super.toString() + "]";
    }

    public Manager() {
        super();
    }

    public Manager(int bouns) {
        super();
        this.bouns = bouns;
    }
 
    
}
