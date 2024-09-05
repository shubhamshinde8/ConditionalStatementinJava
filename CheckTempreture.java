package Lecture02;

import java.util.Scanner;

public class CheckTempreture {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter current Tempreture : ");
        double temp=scanner.nextDouble();
        if(temp>100){
            System.out.println("You have fever");
        }else {
            System.out.println("You dont have a fever");
        }
    }
}
