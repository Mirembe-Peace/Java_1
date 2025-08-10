package com.HelloWorld;
    // Operations in java 🍵
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

        // 😁 a break statement can also be used to jump out of a for loop using an if statement
        String[] new_cars = {"honda_civic", "lamborgini", "mustang", "harrier", "escalade"};
        for (String p: new_cars) {
            if (p == "harrier") {
                break;
            }
            System.out.print(p);
        }

        for (String w: new_cars) {
            if (w == "harrier") {
                continue;
            }
            System.out.println(w);
        }


        // 😊 getting the length of array
        System.out.println(new_cars.length);

        // 😎 Looping through an array
        String[] planes = {"Boeing", "Airbus", "Spirit"};
        for (int l = 0; l < planes.length; l++) {
            System.out.println(planes[l]);
        }

        // 🤩 Multidimensional Arrays
        // This is an array of arrays
        int[][] number_matrix = {{3,5,7}, {2,4,6}};
        System.out.println(number_matrix[0][2]);

        number_matrix[0][2] = 9;
        System.out.println(number_matrix[0][2]);

        // 👍looping through a multidimensional array
        for (int first_array = 0; first_array < number_matrix.length; ++first_array) {
            for (int second_array = 0; second_array < number_matrix[first_array].length; ++second_array){
                System.out.println(number_matrix[first_array][second_array]);
            }
        }

        // 🩵🩵looping through a multidimensional array using the "for each" method

        for (int[] mother_array: number_matrix){
            for(int children_arrays: mother_array){
                System.out.println(children_arrays);
            }
        }

    }
}