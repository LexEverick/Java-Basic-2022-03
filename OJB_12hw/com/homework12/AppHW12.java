package com.homework12;

import java.util.Scanner;

public class AppHW12 {

    public static void main(String[] args) {

        System.out.println("Java-Basic-2022-03\n12. Java синтаксис\n" +
                "Работа со счетами клиента банка\n");

        Bank bank = new Bank();
        bank.createClientsHashSet();
        //bank.createAccountHashSet();

        Scanner scanner = new Scanner(System.in);
        boolean theEnd = false;
        while (!theEnd) {
            bank.printAllClients();
            System.out.println("Choose an option: \n" +
                    "1. Find all customer accounts\n" +
                    "2. Find a customer by account\n" +
                    "0. Quit");

            int option = scanner.nextInt();
            theEnd = switch (option) {
                case 1 -> false;
                case 0 -> true;
                default -> throw new IllegalStateException("Unexpected value: " + option);
            };


        }

    }
}
