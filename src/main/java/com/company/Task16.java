package com.company;

import org.apache.commons.math3.primes.Primes;

    public class Task16 {
        public static void main(String[] args) {
            System.out.println("Hello, Primes");
             for (String arg : args) {
                try {
                    int number = Integer.parseInt(arg);
                    if (number == 1 || Primes.isPrime(number)){
                        System.out.println(arg + " - prime");
                    }
                    else {
                        System.out.println(arg + " - not prime");
                    }
                } catch (NumberFormatException e) {
                    System.out.println(arg + " - NOT A NUMBER");
                }
            }
        }
    }