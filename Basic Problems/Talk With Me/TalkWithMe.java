import java.util.Scanner;

public class TalkWithMe {
    static void greet(){
        Scanner input = new Scanner(System.in);
        System.out.println("Hey,I'm your assitant can I know your name?");
        String name=input.next();
        System.out.println("Hey,"+name);
    }
    static String goodorbad(){
        Scanner input = new Scanner(System.in);
        System.out.println("How's your life going? (Good or Bad)");
        String goodbad=input.next();
        if (goodbad.equals("good")){
            System.out.println("Nice to hear that!!!");
        }
        else{
            System.out.println("I'm sorry to hear that :/");
        }
        return goodbad;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        greet();

        if (goodorbad().equals("good")){
            System.out.println("Can I tell ypu a Story? (Yes or No)");
            String yn=input.next();
            if(yn.equals("yes")){
                System.out.println("There is a guy with lot of problems.But he sustained " +
                        "to be happy and thats life");
            } else if (yn.equals("no")) {
                System.out.println("Ok,How can I help you?");

            }
        else if(goodorbad().equals("bad")){
            System.out.println("What is your problem?");
            String problem=input.next();
            }
        }

    }
}
