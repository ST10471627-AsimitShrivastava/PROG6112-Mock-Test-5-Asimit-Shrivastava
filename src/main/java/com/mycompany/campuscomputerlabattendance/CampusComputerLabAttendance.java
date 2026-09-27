// ======================================================================
// CODE ATTRIBUTION LIST
// ======================================================================


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (DECLARING VARIABLES)
// TITLE: Java Programming, 9th Edition
// AUTHOR: Joyce Farrell
// DATE: Accessed 28 September 2026
// AVAILABLE: Cengage Learning
// DESCRIPTION: Textbook reference used for guidance on declaring and
// working with Java variables.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (ABSTRACT CLASSES)
// TITLE: Abstract Classes and Methods
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
// DESCRIPTION: Reference used for guidance on abstract classes,
// abstract methods and class inheritance.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (LIVE PROGRAMMING LESSONS)
// TITLE: Live Lessons at Emeris Durban North
// AUTHOR: Denzyl Governder, Emeris Durban North
// DATE: 21 July 2026 - 27 September 2026
// AVAILABLE: https://www.emeris.ac.za/
// DESCRIPTION: Programming concepts, demonstrations and examples
// discussed during live PROG6112 lessons.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (LIVE PROGRAMMING LESSONS)
// TITLE: Live Lessons at Emeris Durban North
// AUTHOR: Jeyashree Krishnan
// DATE: 21 July 2026 - 27 September 2026
// AVAILABLE: https://www.emeris.ac.za/
// DESCRIPTION: Programming concepts and examples covered during
// PROG6112 live lessons.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (PROG6112 MOCK TEST 1)
// TITLE: PROG6112 Programming 1B - Mock Test 1
// AUTHOR: Denzyl Governder, Emeris Durban North
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://mystudies.iie.edu.za/d2l/le/lessons/86272/topics/7090080
// DESCRIPTION: Practice assessment used as a reference for Java
// programming concepts, problem-solving techniques and assessment-style
// requirements.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (PROG6112 MOCK TEST 2)
// TITLE: PROG6112 Programming 1B - Mock Test 2
// AUTHOR: Denzyl Governder, Emeris Durban North
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://mystudies.iie.edu.za/d2l/le/lessons/86272/topics/7090081
// DESCRIPTION: Practice assessment used as a reference for Java
// programming concepts, problem-solving techniques and assessment-style
// requirements.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (SCANNER AND USER INPUT)
// TITLE: Scanning and Formatting
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/essential/io/scanfor.html
// DESCRIPTION: Reference used for obtaining keyboard input using the
// Scanner class.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (SINGLE AND TWO-DIMENSIONAL ARRAYS)
// TITLE: Arrays
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
// DESCRIPTION: Reference used for declaring, populating and accessing
// single-dimensional and multidimensional arrays.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (FOR LOOPS)
// TITLE: The for Statement
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
// DESCRIPTION: Reference used for repeating operations and iterating
// through arrays using for loops.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (FORMATTED OUTPUT USING printf)
// TITLE: Formatting
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/essential/io/formatting.html
// DESCRIPTION: Reference used for formatted console output using
// printf(), format specifiers and column spacing.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (IF STATEMENTS AND COMPARISONS)
// TITLE: The if-then and if-then-else Statements
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
// DESCRIPTION: Reference used for conditional statements and comparing
// values when making decisions in the application.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (ARITHMETIC AND ASSIGNMENT OPERATORS)
// TITLE: Assignment, Arithmetic, and Unary Operators
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
// DESCRIPTION: Reference used for calculations, addition, assignment
// and compound assignment operators such as +=.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (CREATING AND IMPLEMENTING INTERFACES)
// TITLE: Implementing an Interface
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/java/IandI/usinginterface.html
// DESCRIPTION: Reference used for creating Java interfaces and
// implementing interface methods in classes.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (INHERITANCE AND EXTENDING CLASSES)
// TITLE: Inheritance
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
// DESCRIPTION: Reference used for creating subclasses and extending
// parent or abstract classes.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (METHOD OVERRIDING AND @Override)
// TITLE: Overriding and Hiding Methods
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/java/IandI/override.html
// DESCRIPTION: Reference used for overriding inherited methods and
// applying the @Override annotation.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (SUPER KEYWORD AND SUPERCLASS CONSTRUCTOR)
// TITLE: Using the Keyword super
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/java/IandI/super.html
// DESCRIPTION: Reference used for calling superclass constructors and
// working with inherited members using the super keyword.
// ----------------------------------------------------------------------

package com.mycompany.campuscomputerlabattendance;

import java.util.Scanner;

public class CampusComputerLabAttendance {

    public static void main(String[] args) {

        // I create a Scanner so I can receive input from the user.
        Scanner input = new Scanner(System.in);

        // I store the names of the three computer labs.
        String[] labs = {"Lab A", "Lab B", "Innovation Lab"};

        // I store the names of the three days.
        String[] days = {"Monday", "Tuesday", "Wednesday"};

        // I create a two-dimensional array to store attendance for each lab and day.
        int[][] attendance = new int[labs.length][days.length];

        System.out.println("=================================================");
        System.out.println("CAMPUS COMPUTER LAB ATTENDANCE REPORT");
        System.out.println("=================================================");

        // I use nested loops to enter attendance for every lab on every day.
        for (int i = 0; i < labs.length; i++) {

            for (int j = 0; j < days.length; j++) {

                System.out.print(
                        "Enter attendance for "
                        + labs[i]
                        + " on "
                        + days[j]
                        + ": "
                );

                // I store the attendance in the correct row and column.
                attendance[i][j] = input.nextInt();
            }
        }

        System.out.println("-------------------------------------------");

        // I display the headings for my attendance report.
        System.out.printf(
                "%-20s %-12s %-12s %-12s%n",
                "LAB",
                "MONDAY",
                "TUESDAY",
                "WEDNESDAY"
        );

        System.out.println("-------------------------------------------");

        // I use a loop to display each lab and its attendance for all three days.
        for (int i = 0; i < labs.length; i++) {

            System.out.printf(
                    "%-20s %-12d %-12d %-12d%n",
                    labs[i],
                    attendance[i][0],
                    attendance[i][1],
                    attendance[i][2]
            );
        }

        System.out.println("-------------------------------------------");

        System.out.println("AVERAGE ATTENDANCE PER LAB");
        System.out.println("-------------------------------------------");

        // I use a loop to calculate the average attendance for each lab.
        for (int i = 0; i < labs.length; i++) {

            // I start the total at zero for the current lab.
            int labTotal = 0;

            // I use a loop to add the attendance for all three days.
            for (int j = 0; j < days.length; j++) {

                labTotal += attendance[i][j];
            }

            // I calculate the average by dividing the total by the number of days.
            double average = (double) labTotal / days.length;

            // I display the average to two decimal places.
            System.out.printf(
                    "%s: %.2f%n",
                    labs[i],
                    average
            );
        }

        System.out.println("-------------------------------------------");

        System.out.println("COMBINED ATTENDANCE PER DAY");
        System.out.println("-------------------------------------------");

        // I create an array to store the combined attendance for each day.
        int[] dailyTotals = new int[days.length];

        // I use nested loops to calculate the total attendance for each day.
        for (int j = 0; j < days.length; j++) {

            for (int i = 0; i < labs.length; i++) {

                dailyTotals[j] += attendance[i][j];
            }

            // I display the combined attendance for the current day.
            System.out.println(
                    days[j]
                    + ": "
                    + dailyTotals[j]
            );
        }

        System.out.println("-------------------------------------------");

        // I start the highest attendance at zero.
        int highestAttendance = 0;

        // I create a String to store the day with the highest attendance.
        String highestDay = "";

        // I use a loop to find the day with the highest combined attendance.
        for (int i = 0; i < days.length; i++) {

            // I check if the current day has a higher attendance than the previous highest.
            if (dailyTotals[i] > highestAttendance) {

                // I store the current total as the highest attendance.
                highestAttendance = dailyTotals[i];

                // I store the current day as the highest attendance day.
                highestDay = days[i];
            }
        }

        // I display the day with the highest combined attendance.
        System.out.println(
                "HIGHEST ATTENDANCE DAY: "
                + highestDay
                + " ("
                + highestAttendance
                + ")"
        );

        // I create a counter to count attendance entries of 30 students or more.
        int entriesThirtyOrMore = 0;

        // I use nested loops to check every individual attendance entry.
        for (int i = 0; i < labs.length; i++) {

            for (int j = 0; j < days.length; j++) {

                // I increase the counter when attendance is 30 or more.
                if (attendance[i][j] >= 30) {

                    entriesThirtyOrMore++;
                }
            }
        }

        // I display the number of attendance entries with 30 or more students.
        System.out.println(
                "ENTRIES WITH 30 OR MORE STUDENTS: "
                + entriesThirtyOrMore
        );

        System.out.println("=================================================");

        // I close the Scanner after I have finished receiving all input.
        input.close();
    }
}