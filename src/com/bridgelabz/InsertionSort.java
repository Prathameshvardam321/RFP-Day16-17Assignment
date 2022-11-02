package com.bridgelabz;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("enter the no. of string");
            int n = scn.nextInt();
            String[] arr = new String[n];

            int j;
            for (int i = 0; i < n; i++) {
                System.out.print("enter the array element: ");
                arr[i] = scn.next();
            }
            for (int i = 1; i < arr.length; i++) {
               String item = arr[i];
                j = i-1;
                while (j > 0 && arr[j - 1].compareTo(item) > 0) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j+1] = item ;
            }
            System.out.println("After Sorting: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

