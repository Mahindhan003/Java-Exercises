import java.util.Scanner;
public class ReversedNumber {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=input.nextInt();
        int reversed = 0;
        while(num!=0){
            int rem = num%10;
            reversed=(reversed*10)+rem;
            num/=10;
        }
        System.out.print("Reversed:"+reversed);
    }
}
