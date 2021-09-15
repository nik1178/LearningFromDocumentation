import javax.swing.*;

public class EvolveInterfaceTest implements DoIt{

    public static void main(String[] args) {
        new EvolveInterfaceTest();
    }

    Object frame = new JFrame();

    EvolveInterfaceTest(){
        doSomething(2, 3.0);
        System.out.println(didItWork(2, 3, "4"));
    }

    @Override
    public void doSomething(int i, double x) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int doSomethingElse(String s) {
        // TODO Auto-generated method stub
        return 0;
    }

}
interface DoIt {

    void doSomething(int i, double x);
    int doSomethingElse(String s);
    default boolean didItWork(int i, double x, String s) {
        // Method body 
        return i<x && s.length()<x;
    }
    
 }