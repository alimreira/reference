package com.company.intro;

public class First {
int _speedLimit = 80;
float $SPEEDlIMIT = 80.9f;

//Operators
    //Unary
    static int count =8;

    //Arithmetic
    static int counter = 15;

    public static void main(String[] args) {
        System.out.println(++count);
        System.out.println(--count);

        System.out.println(count + counter);
        System.out.println(count - counter);
        System.out.println(count % counter);
        System.out.println(count * counter);
        System.out.println(count / counter);

        //Assignment
        System.out.println(count += counter);
        System.out.println(count -= counter);
        System.out.println(count *= counter);
        System.out.println(count /= counter);
        System.out.println(count %= counter);

        //Relational
        int book = 560;
        int ink = 540;
        System.out.println(book == ink);
        System.out.println(book != ink);
        System.out.println(book < ink);
        System.out.println(book > ink);
        System.out.println(book <= ink);
        System.out.println(book >= ink);

        //Logical



    }
}
