import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner inputnum=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=inputnum.nextInt();
        int count=0;
        for(int i=1;i<=num;i++) {
            if (num % i == 0) {
                System.out.println(i);
                count += 1;
            }
        }
        if(count==2){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }

    }
}
