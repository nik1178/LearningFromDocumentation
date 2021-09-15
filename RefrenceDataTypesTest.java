import java.awt.*;
public class RefrenceDataTypesTest {
    static int sysssys = 5;
    public static void main(String[] args) {
        Point p = new Point();
        incrementMethod(p);
        System.out.println(p);
        System.out.println(sysssys);
        
    }
    public static void incrementMethod(Point p){
        p.move(5, 5);
        p = new Point(2,3);
    }
}
class testingClass extends RefrenceDataTypesTest{
    static int testing = 5;
    int notTesting = 7;
    testingClass(){
        System.out.println(sysssys);
    }
    public static void mymeth(){
        //System.out.println(testingClass.notTesting);
    }
}