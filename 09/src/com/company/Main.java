package com.company;
import java.util.Scanner;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
        final int maxsqrfeet = 350;
        System.out.print("How much in square feet do you need to paint\n");
        Scanner sqrfeetin = new Scanner (System.in);
        String Squarefeet = sqrfeetin.next();
        float Sqrft = Integer.parseInt(Squarefeet);
        float Paintneeded = (Sqrft/maxsqrfeet);


        System.out.print("you need "+Math.ceil(Paintneeded)+" to paint "+Squarefeet+" Square feet");
    }
}
