import java.util.Scanner;

public class OddOrEven {

    static boolean oddEven(int n){
        return n%2==0;

        }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("ENter a number to check: ");
        int num=input.nextInt();
        boolean ans= oddEven(num);
        if(ans) {
            System.out.println("The Given number is Even");
        }
        else{
            System.out.println("The given number is Odd");
        }
}
}
