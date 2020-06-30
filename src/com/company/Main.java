package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            tuna tunaObject = new tuna();
            System.out.println("enter name of car: ");

            String temp = input.nextLine();
            tunaObject.setName(temp);
            tunaObject.saying();
    }
}
