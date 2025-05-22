
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the limit:");
        int limit=input.nextInt();
        int sum=0;
        int average=0;
        for(int i=1;i<=limit;i++){
            System.out.print("Enter the number:");
            int a=input.nextInt();
            sum+=a;
        }
        average=sum/limit;
        System.out.println("Sum:"+sum);
        System.out.println("Average:"+average);
    }
}
