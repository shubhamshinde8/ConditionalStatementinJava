package Lecture02;

import java.util.Scanner;

public class NumberIsPositiveOrNegiteve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Number is Positive ");
        }
        else if(n<0){
            System.out.println("Number is Negetive");
        }else{
            System.out.println("Number is Zero ");
        }
    }
}
