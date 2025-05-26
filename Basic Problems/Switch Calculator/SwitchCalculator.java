import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a operator:");
        char op=input.next().charAt(0);
        System.out.println("Enter a number:");
        int a=input.nextInt();
        System.out.println("Enter a number:");
        int b=input.nextInt();
        switch(op){
            case '+':
                System.out.println("Addition");

                System.out.println("Answer:"+(a+b));
                break;
            case '-':
                System.out.println("Subtraction");

                System.out.println("Answer:"+(a-b));
                break;
            case '*':
                System.out.println("Multiplication");

                System.out.println("Answer:"+(a*b));
                break;
            case '/':
                System.out.println("Division");

                System.out.println("Answer:"+(a/b));
                break;
            case '%':
                System.out.println("Reminder");

                System.out.println("Answer:"+(a%b));
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}
