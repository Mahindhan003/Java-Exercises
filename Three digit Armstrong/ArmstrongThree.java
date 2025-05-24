import java.util.Scanner;

public class ArmstrongThree {

    static void armStrong(int n){
        int original=n;
        int count=0;
        for(int i=1;i<=3;i++){
            int temp =n%10;
            temp=temp*temp*temp;
            count+=temp;
            n=n/10;
        }
        if(original==count) {
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a three digit num:");
        int num=input.nextInt();
        armStrong(num);


    }
}
