/**
 * write a main method that prints how many multiples of 3 or 5 there are below 1000
 */
public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            if (printMultiples(i) == 1) {
                count++;
            }
        }
        System.out.println(count);

    }

    public static int printMultiples (int n){

        boolean divisibleByThree = n % 3 == 0;
        boolean divisibleByFive = n % 5 == 0;

        if (divisibleByThree || divisibleByFive){
            return 1;
        }else{
            return 0;
        }



    }




}
