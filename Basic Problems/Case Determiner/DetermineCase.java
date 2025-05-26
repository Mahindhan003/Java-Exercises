import java.util.Scanner;

public class DetermineCase {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Character:");
        char letter=input.next().charAt(0);
        if('a'<=letter && letter<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
