package com.HelloWorld;
// 😕 for Java to accept user input you have to import the scanner class

 import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        printer();
        names("James");
        names("Michael");
        names("Peter");
        name_age("Peter", 23);
        name_age("Michael", 12);
        name_age("Carlos", 23);
        checkAge(23);
        checkAge(14);
        System.out.println(calculator(20));

        // first create a scanner object
        Scanner Obj =  new Scanner(System.in);
        System.out.println("Enter any positive integers: ");
        int num_1 = Obj.nextLine();

    }

    // 🤖When I create my own method i can leave the parentheses empty🤖
    static void printer(){
        System.out.println(" This is my first method");
    }

    // 🍵 Java methods and arguments
    static void names(String f_name){
        System.out.println("Mutegeki " + f_name);
    }
    // 💟 multiple parameters
    static void name_age(String fname, int age){
        System.out.println("Mukisa " + fname + " is " + age + " years old.");
    }

    // 😎 method with if else statement
    static void checkAge(int ages){
        if (ages < 18 ){
            System.out.println("You are too young to access this service");
        }
        else {
            System.out.println("You are old enough to access this service");
        }
    }

    // 🍵 Java return values
    // for a method to return a value we use the return keyword
    static int calculator(int x){
        return(x + 5);
    }

    // adding two integers accepting user input
    static int adder(int a, int b){
        return(a + b);
    }
}