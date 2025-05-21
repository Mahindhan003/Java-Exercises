import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner inputnum=new Scanner(System.in);
        System.out.println("Enter a num:");
        int num=inputnum.nextInt();
        int a=-1,b=1,c;
        for(int i=1;i<=num;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
