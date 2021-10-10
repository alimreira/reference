package com.company.intro;

public class Second {
    static int number = 0;
    static int number1 = 10;

    public static void main(String[] args) {
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is 0.");
        }


        for(int i = 2; i < number1; ++i){
            if(i > 6){
                break;
            }
          //  System.out.println(i);
            number += 3;
            System.out.println(number);

        }
    }


}
