package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Student s1 = new Student("Nz", "Dm", "Ur", "16.08.1983", "Kharkov", 8067, "IT", 5, "Kit-17");
        Student s2 = new Student("s2", "Mm", "TT", "01.09.1989", "kiev", 066167, "PT", 4, "KZ");
        Student s3 = new Student("s3k", "s3", "Uiir", "16.07.2000", "Kharkov", 8067, "IT", 1, "Kit-16");
        Student s4 = new Student("34", "s4", "ioT", "01.09.1995", "lviv", 066167, "hz", 2, "KZ");


        Student arr[] = {s1, s2, s3, s4};

        for (int i = 0; i < arr.length; i++) {
            String fc[];

            if (arr[i].getFac().equals(arr[i + 1]))
                continue;
            else {
                fc[i] = arr[i].getFac();

            }
            System.out.println(arr[i].getStudent());
        }


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Facultet");
        String kursIn = scan.next();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getFac().equals(kursIn)) ;
            else continue;

            arr[i].getStudent();

        }
        System.out.println("Enter date of birth");
        String d = scan.next();
        DateFormat format = new SimpleDateFormat("dd.mm.yyyy");
        Date inputDate = null;
        try {
            inputDate = format.parse(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < arr.length; i++) {
            Date studentDate = null;
            try {
                studentDate = format.parse(arr[i].getD_date());
            } catch (ParseException e) {
                e.printStackTrace();
            }

            if (inputDate.before(studentDate)) {
                arr[i].getStudent();
            }


        }

       /* for (int i = 0; i <arr.length ; i++) {
            String []f;
            for (int j = 0; j < ; j++) {

            } {

            }*/

    }
}

