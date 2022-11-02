package com.bridgelabz;
import java.util.Scanner;
public class MagicNumber {
public static void main(String[] args) {
    int result=0;
    int smallestNumber = 0;
    int biggestNumber =100;
    Scanner scanner = new Scanner(System.in);
    do {
       int sum = smallestNumber+biggestNumber;
       int magicSum = sum/2;
        System.out.println("1.Number is greater than "+magicSum);
        System.out.println("2.Number is lesser than "+magicSum);
        System.out.println("3.Number is equal to "+magicSum);
        int choice = scanner.nextInt();
        if (choice==1){
            smallestNumber=magicSum;
        }else if(choice==2){
            biggestNumber=magicSum;
        } else if (choice==3) {
            result=1;
            System.out.println("Magic number found.");
        }else {
            System.out.println("Enter valid inputs.");
        }


    }while (result==0);
}
}
