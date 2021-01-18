package com.company;

import java.util.Scanner;

public class Utils {
    public static double getIntFromTerminal() {
        double userValue;
        try {
            userValue = new Scanner(System.in).nextDouble();
        } catch (Exception e) {
            System.err.println("try again enter a num");
            return getIntFromTerminal();
        }
        return userValue;
    }
}
