import java.util.Scanner;

public class VowelDeterminer {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a character:");
        char character=input.next().charAt(0);
        switch (character){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': {
                System.out.println("Vowel");
                break;
            }
            default:
                System.out.println("Consonant");

        }
    }
}
