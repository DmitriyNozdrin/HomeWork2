package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import  java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here



        Student s1 = new Student ("Nz", "Dm", "Ur", "16.08.1983", "Kharkov", 8067, "IT", 5, "Kit" );
        Student s2 = new Student ("Nn", "Mm", "TT", "01.09.1989", "Kharkov", 066167, "PT", 4, "KZ" );


        Student arr [] = {s1, s2};

s1.getStudent();
s2.getStudent();
    Scanner scan = new Scanner(System.in);
    String kursIn = scan.next();
            for (int i = 0; i <arr.length ; i++) {
            if (arr[i].getFac().equals(kursIn))
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
        for (int i = 0; i <arr.length ; i++) {
            Date studentDate = null;
            try {
                studentDate = format.parse(arr[i].getD_date());
            } catch (ParseException e) {
                e.printStackTrace();
            }

            if (inputDate.before(studentDate)){
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

