package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        // create a scanner
        Scanner thescanner =new Scanner(System.in);

        //asking to enter there name
        System.out.println("Please enter your full name:  ");
        String fullname =thescanner.nextLine().trim();


        String[]nameparts=fullname.split(  "\\s+");


        String firstName = nameparts[0];
        String middleName = "(none)";
        String lastName = nameparts[nameparts.length - 1];

        if (nameparts.length == 3) {
            middleName = nameparts[1];
        }

        System.out.println("firstname: "  +firstName);
        System.out.println("Middlename: "  +middleName);
        System.out.println("lastname:   "  +lastName);

        thescanner.close();


        }


    }
