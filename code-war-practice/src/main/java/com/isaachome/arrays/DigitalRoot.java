package com.isaachome.arrays;

public class DigitalRoot {
    public static void main(String[] args) {
        int n = 942;  // Example input
        int result = digitalRoot(n);
        System.out.println("The digital root of " + n + " is: " + result);
//        int n = 16;  // Example input
//        int result = digital_root(n);
//        System.out.println("The digital root of " + n + " is: " + result);

    }

    public static int digitalRoot(int n) {
//        while (n >= 10) {
//            n = sumOfDigits(n);
//        }
//        return n;
        while (n>9){
            n = n%10 + n/10;
        }
         return  n;
    }

    private static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            System.out.println("Sum : "+sum);
            n /= 10;
            System.out.println("N "+n);
        }
        return sum;
    }
    public static int digital_root(int n) {
        return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }
}
