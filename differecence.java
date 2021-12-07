import java.util.Scanner;

public class practyc1 {

    private static int number = 21;
    private static int difference;


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.format("Enter an integer number n: ");
        int n = sc.nextInt();

        diff21(n);

        System.out.format("The difference between %d and %d is %d", n, number, difference);

    }

    public static int diff21(int n){

        if(n < number){
            difference = number - n;
        }
        else if (n > number) {
            difference = 2 * (n - number);
        }
        else {
            System.out.println("Try one more time please..");
        }
        return difference;
        }




}
