package Lecture02;

import java.util.Scanner;

public class CheckCharacter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a character : ");
        char c=scanner.nextLine().charAt(0);
        if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u'){
            System.out.println("The character is vowel ");
        }else{
            System.out.println("Character is not vowel ");
        }

    }
}
