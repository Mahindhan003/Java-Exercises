import java.util.Scanner;

public class CountNum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=input.nextInt();
        System.out.print("Enter the number to count: ");
        int countnum=input.nextInt();
        int count=0;
        while(num!=0){
            int rem=num%10;
            if(rem==countnum){
                count++;
            }
            num/=10;
        }
        System.out.print("Count:"+count);
    }
}
