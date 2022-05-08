package com.bridgelabz;

import java.util.Scanner;

public class Account {
        Scanner scanner = new Scanner(System.in);

        public  void debit(int accBalance){
            System.out.println("Account Balance is : " + accBalance);
            System.out.println("Enter amount to debit : ");
            int debitamount = scanner.nextInt();
            int balanceamount = accBalance - debitamount;

            if( debitamount <= accBalance) {
                System.out.println("Money " + debitamount + " is Debited from your Account ");
                System.out.println("Your BALANCE is "+balanceamount);
            }
            else{
                System.out.println("You tried to Debit amount " + debitamount + " which exceeded your account balance " + accBalance);
                System.out.println("Your BALANCE is "+accBalance);
            }
            System.out.println("Thanks for the transaction");
        }


        }






