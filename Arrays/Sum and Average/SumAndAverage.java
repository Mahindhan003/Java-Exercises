import java.util.Arrays;
import java.util.Scanner;

public class SumAndAverage {

    static int sum(int[] n){
        int sum=0;
        for(int i=0;i<n.length;i++){
            sum+=n[i];
        }
        return sum;

    }

    static double average(int[] n){
        double average=sum(n)/n.length;
        return average;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[] nums=new int[5];

        for(int i=0;i<nums.length;i++){
            System.out.print("Enter number to add:");
            nums[i]=input.nextInt();

        }

        System.out.println("Array: "+ Arrays.toString(nums));

        int total=sum(nums);
        double average=average(nums);

        System.out.println("Sum of the numbers: "+total);
        System.out.println("Average of the numbers: "+average);


    }
}
