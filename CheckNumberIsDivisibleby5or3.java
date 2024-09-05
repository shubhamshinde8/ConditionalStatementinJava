package Lecture02;

import java.util.Scanner;

public class CheckNumberIsDivisibleby5or3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println(n+" is divisible by 5 and 3");
        }else{
            System.out.println(n+" is Not divisible by 3 and 5");
        }
    }
}
