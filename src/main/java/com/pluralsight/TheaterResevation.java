package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterResevation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Full Name: ");
        String fullName = scanner.nextLine();

        System.out.println("What date will you be coming(MM/dd/yyyy): ");
        String dateAsString= scanner.nextLine(); //user need to input date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date =LocalDate.parse(dateAsString, formatter);


        System.out.println("How many tickets will you like? ");
        int ticketAmount = scanner.nextInt();




//        (x) tickets reserved for yyyy-mm-dd under (Last), (First)
        System.out.printf("%d tickets reserved for %s under %s",ticketAmount,date,fullName);
    }
}
