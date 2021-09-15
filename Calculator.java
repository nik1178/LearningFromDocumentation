public class Calculator {
  
    interface IntegerMath {
        public int operation(int... a);   
    }
  
    public int operateBinary(int a, int b, int c, IntegerMath op) {
        return op.operation(a, b, c);
    }
 
    public static void main(String... args) {
    
        Calculator calculator = new Calculator();
        IntegerMath addition = (a) -> a[0] + a[1] + a[3];
        //IntegerMath subtraction = (a, b) -> a - b;
        System.out.println("40 + 2 = " + calculator.operateBinary(40, 2, 5, addition));
        //System.out.println("20 - 10 = " + calculator.operateBinary(20, 10, subtraction));    
    }
    public static void testOperation(int... a){
        int sum = 0;
        for(int i=0; i<a.length; i++) sum+=a[i];
    }
}