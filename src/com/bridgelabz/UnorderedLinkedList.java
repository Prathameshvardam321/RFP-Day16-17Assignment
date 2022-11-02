package com.bridgelabz;

import java.awt.*;
import java.util.LinkedList;
import java.util.Scanner;

public class UnorderedLinkedList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String[] array;
       LinkedList<String > linkedList = new LinkedList<>();
        String para = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        array = para.split(" ");
        for (String str : array)  {
            linkedList.add(str);
        }
        System.out.println("Enter word : ");
        String searchWord = scan.next();
        if (linkedList.contains(searchWord)){
            linkedList.remove(searchWord);
        }else {
            linkedList.add(searchWord);
        }
        System.out.println(linkedList);
    }
}
