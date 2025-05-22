import java.util.Scanner;

public class MinimumMaximum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number a:");
        int a =input.nextInt();
        System.out.print("Enter number b:");
        int b =input.nextInt();
        System.out.print("Enter number c:");
        int c =input.nextInt();

        int max=Math.max(a,Math.max(b,c));
        int min=Math.min(a,Math.min(b,c));

        System.out.println("Maximum Number:"+max);
        System.out.println("Minimum Number:"+min);
    }
}
