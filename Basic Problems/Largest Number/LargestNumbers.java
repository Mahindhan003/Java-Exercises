import java.util.Scanner;

public class LargestNumbers {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=10,b=20,c=30,largest;
        if(a>=b && a>=c){
            largest=a;
        }
        else if (b>=a && b>=c) {
            largest=b;
        }
        else {
            largest=c;

        }
        System.out.println(largest);
    }
}
