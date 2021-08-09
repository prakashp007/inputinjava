package com.inputinjava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);


        System.out.println("enter your first name");
        String fname=sc.nextLine();

        System.out.println("enter your midle name");
        String mname=sc.nextLine();

        System.out.println("entet your last name");
        String lname=sc.nextLine();
        String fullname;
        fullname=fname+mname+lname;
        System.out.println(fullname);
    }
}
