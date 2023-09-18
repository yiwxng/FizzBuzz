/**
 * Starting with a number n, if n is even divide it by 2. If n is odd, subtract 1. Repeat.
 *write a main method that prints how many steps it takes to reach 0 if you start at 100.
 */
public class Reduce {

    public static void main(String[] args) {
        System.out.println(startReduce(100));
    }

    public static int startReduce(int n){
        //boolean even = n %2 == 0;
        int count = 0;
        while (n > 0 ){
            if (n % 2 == 0){
                n = n/2;
            } else{
                n = n - 1;
            }
            count ++;
        }return count;




    }



}
