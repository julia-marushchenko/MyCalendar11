/**
 *  Java program to use abstract Calendar objects.
 */

package com.mycallendar;

import java.util.Calendar;

/**
 *  Main class.
 */
public class Main {

    // Main method to start java program.
    public static void main(String[] args) {

        // Creating instance of Callendar.
        Calendar myCalendar = Calendar.getInstance();

        // Printing date to console.
        System.out.println("Date:" + myCalendar.getTime()); // Output: Date:Thu Mar 12 17:29:44 CET 2026

    }
}