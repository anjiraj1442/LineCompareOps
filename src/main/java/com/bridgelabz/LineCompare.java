package com.bridgelabz;

import java.util.Scanner;

/**
 *  Line comparison Problem
 *
 * @author : Anji Raj Ardula
 * @version : 16.0
 * @since :02/10/2021
 */

public class LineCompare {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Problem");
        Scanner sc = new Scanner(System.in);
        // X co ordinate values
        System.out.println("Enter the X-axis co-ordinates");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();


        // Y co ordinate values
        System.out.println("Enter Y axis co ordinates");
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();

        // calculating the length of two lines
        double lineLenght = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("the lenght of the line is " + lineLenght);

    }
}
