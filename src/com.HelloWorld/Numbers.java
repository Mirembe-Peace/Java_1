package com.HelloWorld;

public class Numbers {
    public static void main(String[] args){
        //declaring variables works the same way as in C
        int a = 54;
        int b = 8;
        int c = a + b;
        System.out.println(c);

        //operations on numbers works the same as in C
        System.out.println(3 + 4);
        System.out.println(4 * 8);

        //to declare a variable as a constant in java we use the keyword Final
        final int d = 30;
        int x = 45;
        System.out.println(d * x);

        // logical and && , logical or || , logical not !

        //switch
        int day = 4;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
        }
        //the default keyword is used if there is code to run in case a matching case is not found

        //while loop
        int countdown = 3;
        while( countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy new year");

        //do while loop
        //executes the code block once before checking if the condition is true
        int i = 7;
        do {
            System.out.print(i  + " ");
            i--;
        } while(i > 0);

        int numbers = 7;
        do {
            System.out.print(numbers);
            numbers--;
            System.out.print(numbers);
        } while(numbers > 0);

        //for loops
        for(int f = 1; f <= 10; f++) {
            System.out.println(f + " ");
        }

        //nested for loop
        for(int r = 1; r <= 10; r++) {
                for(int k = 4; k > 0; k--){
                    System.out.println(k + " ");  // the inner for loop is executed (outerlooptimes * innerlooptimes)
                }
                System.out.println("one loop complete");
        }

        //for each loop
        //used for elements in an array
        String[] cars = {"ford", "bugatti", "escalade"};
        for (String h: cars) {
            System.out.println(h);
        }
    }
}