package com.company;

/**
 * Created by DmitriyN on 2/24/2017.
 */
public class Student {

    String id;
    String last_name;
    String first_name;
    String second_name;
    String d_date;
    String address;
    double tel;
    String fac;
    int kurs;
    String gr;

    private static long idCounter = 0;

    public static synchronized String createID() {
        return String.valueOf(idCounter++);
    }

   

    public Student(String last_name, String first_name, String second_name, String d_date, String address, double tel, String fac, int kurs, String gr) {
        this.id = createID();
        this.last_name = last_name;
        this.first_name = first_name;
        this.second_name = second_name;
        this.d_date = d_date;
        this.address = address;
        this.tel = tel;
        this.fac = fac;
        this.kurs = kurs;
        this.gr = gr;
    }

    public void getStudent() {
        System.out.println("id: " + id + "Last Name: " + last_name + " " + "First Name: " + first_name + " " + "Second Name: " + second_name + " " + "Date of Birth: " + d_date + " " + "Address: " + address + " " + "Facultet: " + fac + " " + "Kurs: " + kurs + " " + "Grup: " + gr);
    }

    public void setLast_name(String last_name) {
        this.id = id;
        this.last_name = last_name;
    }


    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setSecondName(String secondName) {
        this.second_name = second_name;
    }

    public void setD_date(String n) {
        this.d_date = n;
    }

    public void setAddress(String n) {
        this.address = n;
    }

    public void setTel(double n) {
        this.tel = n;
    }

    public void setFac(String n) {
        this.fac = n;
    }

    public void setFac(int n) {
        this.kurs = n;
    }

    public void setGr(String n) {
        this.gr = n;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public String getD_date() {
        return d_date;
    }

    public String getAddress() {
        return address;
    }

    public String getFac() {
        return fac;
    }

    public String getGr() {
        return gr;
    }

    public int getKurs() {
        return kurs;
    }

    public double getTel() {
        return tel;
    }
}

