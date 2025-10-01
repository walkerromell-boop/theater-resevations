package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterResevation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Full Name: ");
        String fullName = scanner.nextLine();
        String[] fullNameSplit= fullName.trim().split(" ");


        //        String input = "Dallas|Ft. Worth|Austin"; this is how we do a split in string.
//        String[] cities = input.split(Pattern.quote("|")); you have to add brackets in order to put it into arrays
//        // cities is an array containing 3 strings
//        // [0] is Dallas, [1] is Ft. Worth, [2] is Auston
//        System.out.println(cities[1]);
        System.out.println("What date will you be coming(MM/dd/yyyy): ");
        String dateAsString= scanner.nextLine(); //user need to input date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date =LocalDate.parse(dateAsString, formatter);


        System.out.println("How many tickets will you like? ");
        int ticketAmount = scanner.nextInt();




//        (x) tickets reserved for yyyy-mm-dd under (Last), (First)
        System.out.printf("%d tickets reserved for %s under %s, %s",ticketAmount,date,fullNameSplit[0],fullNameSplit[1]);
    }
}
