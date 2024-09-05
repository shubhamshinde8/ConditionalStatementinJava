package Lecture02;

import java.util.Scanner;

public class PrintDayinAWeak {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Day : ");
        int day=scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wenesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
            default:
                System.out.println("Please Enter correct Input");
        }
    }
}
