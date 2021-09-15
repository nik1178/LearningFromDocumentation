public class cosTest{
    public static void main(String args[]){
        double sum = 0;
        for(int i=0; i<1000000; i++){
            double minStep = (Math.PI/2/1000000);
            sum+=Math.cos(minStep*i);
        }
        System.out.println(sum/1000000);
    }
}