import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Press X (or) x to stop");
        int ans;
        while(true){
            System.out.print("Enter a operation:");
            char op=input.next().trim().charAt(0);


            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                System.out.print("Enter a num:");
                int a=input.nextInt();
                System.out.print("Enter a num:");
                int b=input.nextInt();
                if(op=='+'){
                    ans=a+b;
                    System.out.println("Answer:"+ans);
                }
                else if(op=='-'){
                    ans=a-b;
                    System.out.println("Answer:"+ans);
                }
                else if(op=='*'){
                    ans=a*b;
                    System.out.println("Answer:"+ans);
                }
                else if(op=='/'){
                    ans=a/b;
                    System.out.println("Answer:"+ans);
                }
                else if(op=='%'){
                    ans=a%b;
                    System.out.println("Answer:"+ans);
                }

            }
            else if(op=='X'||op=='x'){
                break;
            }
            else{
                System.out.println("Invlaid Operation");
            }

        }
    }
}
