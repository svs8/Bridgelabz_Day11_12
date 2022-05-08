package com.bridgelabz;

import java.util.Scanner;

public class AccountTest {

        public static void main(String[] args) {
            Account account = new Account();
            System.out.println("Enter the amount");
            Scanner sc = new Scanner(System.in);
            int accBalance = sc.nextInt();

            account.debit(accBalance);

            System.out.println("Transaction Completed");

            }
        }




