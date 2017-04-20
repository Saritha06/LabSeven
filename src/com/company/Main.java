package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to our Java class");

        String [] names = {"Saritha","Allie", "Peter","Nick","Lhea"};
        String[] favoriteFood = {"Pizza", "Pasta","Salad","Mac&Cheese","Soup"};
        String[] hobby = {"Music","Tennis","Watching TV","Chat","Reading"};

        for (int i = 0; i < names.length ; i++) {
            System.out.printf("Student Name = %s  Student Fav.Food = %s  Student hobby = %s  ",names[i],favoriteFood[i],hobby[i]);

        }



    }
}
