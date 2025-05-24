import java.util.Scanner;

public class IsPrime {
    static void isPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("The Given number is Prime");
        }
        else{
            System.out.println("The Given number is not a Prime");
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("ENter a num to check:");
        int num = input.nextInt();
        isPrime(num);
    }
}
