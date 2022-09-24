## Table of Content

- [Exercise 1 ](#question-1)
- [Exercise 2 ](#question-2)
- [Exercise 3 ](#question-3)
- [Exercise 4 ](#question-4)
- [Exercise 5 ](#question-5)
- [Exercise 6 ](#question-6)
- [Exercise 7 ](#question-7)
- [Exercise 8 ](#question-8)
- [Exercise 9 ](#question-9)
- [Exercise 10 ](#question-10)
- [Exercise 11 ](#question-11)
- [Exercise 12 ](#question-12)
- [Exercise 13 ](#question-13)
- [Exercise 14 ](#question-14)
- [Exercise 15 ](#question-15)
- [Exercise 16 ](#question-16)

## Question 1

### Write a program to print numbers from 1 to 10.

```java
public class PrintNumbers{
    public static void main(String[] args)
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(i);
        }
    }
}
```

## Question 2

### Write a program to calculate the sum of first 10 natural number.

```java
public class SumNumbers{
    public static void main(String[] args){
        int sum = 0;
        for(int i=1; i<=10; i++){
        sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
```

## Question 3

### Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that numbe

```java
public class Table {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter any positive integer: ");

		Integer enterNum = input.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.format(" %d * %d = %d \n", i, enterNum, (i * enterNum));
		}

	}
}

```

---

## Question 4

### Write a program to find the factorial value of any number entered through the keyboard.

```java
import java.util.Scanner;
public class FactorialDemo{
        public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int num; // To hold number
        int fact = 1; // To hold factorial

                System.out.print("Enter any positive integer: ");
                num = console.nextInt();

                for(int i=1; i<=num; i++)
                {
                    fact *= i;
                }

                System.out.println("Factorial: "+ fact);
            }

}
```

---

## Question 5

### Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

```java
import java.util.Scanner;
public class PowerDemo
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int base;
        int power;
        int result = 1;

        System.out.print("Enter the base number ");
        base = console.nextInt();

        System.out.print("Enter the power ");
        power = console.nextInt();

        for(int i = 1; i <= power; i++)
        {
	    result *= base;
        }

        System.out.println("Result: "+ result);
    }
}
```

## Question 6

### Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.

```java
import java.util.Scanner;

public class ReverseNumber
{
public static void main(String[] args)
{
Scanner console = new Scanner(System.in);

        int number;
        int reverse = 0;

        System.out.print("Enter the number ");
        number = console.nextInt();

        int temp = number;
        int remainder = 0;

        while(temp>0)
        {
        remainder = temp % 10;
        reverse = reverse * 10 + remainder;
            temp /= 10;
        }

        System.out.println("Reverse of " + number + " is " + reverse);
    }

}
```

---

## Question 7

### Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

```java
import java.util.Scanner;
public class ReadSetIntegers{
public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;
        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();

            if( number % 2 == 0)
            {
                evenSum += number;
            }
            else
            {
                oddSum += number;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        }while(choice=='y' || choice == 'Y');

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

}
```

---

## Question 8

### Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.

```java
import java.util.Scanner;
public class TestPrime{
  static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int inputNum;
		boolean flag = true;
		System.out.print("Enter Number :");
		inputNum = sc.nextInt();

		for (int i = 2; i < inputNum; i++) {
			if (inputNum % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag && inputNum > 1) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
	}
}
```

---

## Question 9

### Write a program to calculate HCF of Two given number.

```java
import java.util.Scanner;

public class FindHcf
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int dividend, divisor;
        int remainder, hcf = 0;

        System.out.print("Enter the first number ");
        dividend = console.nextInt();

        System.out.print("Enter the second number ");
        divisor = console.nextInt();

        do
	{
            remainder = dividend % divisor;

            if(remainder == 0)
            {
                hcf = divisor;
            }
	    else
            {
                dividend = divisor;
                divisor = remainder;
	    }

        }while(remainder != 0);

        System.out.println("HCF: " + hcf);
    }
}
```

---

## Question 10

### Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate.

```java
import java.util.Scanner;

public class SumAgain
{
public static void main(String[] args)
{
Scanner console = new Scanner(System.in);

        int number1, number2;
        char choice;

        do
        {
            System.out.print("Enter the first number ");
            number1 = console.nextInt();

            System.out.print("Enter the second number ");
            number2 = console.nextInt();

            int sum = number1 + number2;
            System.out.println("Sum of numbers: " + sum);

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

            System.out.println();

        }while(choice=='y' || choice == 'Y');
    }

}
```

---

## Question 11

### Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

```java
import java.util.Scanner;


public class CountNumbers
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int number,
            countPositive = 0,
            countNegative = 0,
            countZero = 0;

        char choice;

        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();

            if(number > 0)
            {
                countPositive++;
            }
            else if(number < 0)
            {
                countNegative++;
            }
            else
            {
                countZero++;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        }while(choice=='y' || choice == 'Y');

        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }
}
```

---

## Question 12

### Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.

```java
import java.util.Scanner;
public class FindMaxMin
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int number;
        int max = Integer.MIN_VALUE;  // Intialize max with minimum value
        int min = Integer.MAX_VALUE;  // Intialize min with maximum value

        char choice;

        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();

            if(number > max)
            {
                max = number;
            }

            if(number < min)
            {
                min = number;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        }while(choice=='y' || choice == 'Y');

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}
```

---

## Question 13

### Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.

```
For example, 153 = ( 1 _ 1 _ 1 ) + ( 5 _ 5 _ 5 ) + ( 3 _ 3 _ 3 )

```

```java
public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        int digit1,  // To hold first digit (Ones) of number
            digit2,  // To hold second digit (Tens) of number
            digit3;  // To hold third digit (Hundreds) of number

	for(int number = 1; number <= 500; number++)
	{
            int temp = number;
	    digit1 = temp % 10;

            temp = temp / 10;
            digit2 = temp % 10;

            temp = temp / 10;
            digit3 = temp % 10;

	    if(digit1*digit1*digit1 + digit2*digit2*digit2 + digit3*digit3*digit3 == number)
            {
	        System.out.println(number);
            }
	}
    }
}
```

---

## Question 14

### Write a program to print Fibonacci series of n terms where n is input by user :

0 1 1 2 3 5 8 13 24 .....

```java
import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int number;  // To hold number of terms

        int firstTerm = 0,
            secondTerm = 1,
            thirdTerm;

        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();

        System.out.print(firstTerm + " " + secondTerm + " ");

        for(int i = 3; i <= number; i++)
	{
            thirdTerm = firstTerm + secondTerm;
            System.out.print(thirdTerm + " ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
	}
    }
}
```

---

## Question 15

## Write a program to calculate the sum of following series where n is input by user.

1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n

```java
import java.util.Scanner;

public class SumOfSeries
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int number;  // To hold number of terms

        double sum = 0;

        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();

        for(int i = 1; i <= number; i++)
	{
            sum += 1.0/i;
	}

        System.out.println("sum: " + sum);
    }
}
```

---

## Question 16

### Compute the natural logarithm of 2, by adding up to n terms in the series

1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
where n is a positive integer and input by user.

```java
import java.util.Scanner;

public class Ln2
{
public static void main(String[] args)
{
Scanner console = new Scanner(System.in);

        int number;  // To hold number of terms

        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();

        double sum = 0;
        int sign = 1;

        for(int i = 1; i <= number; i++)
    {
            sum += (1.0 * sign) / i;
            sign *= -1;
    }

        System.out.println("log2: " + sum);
    }

}

```

---

## Question 17

### Write a program that generates a random number and asks the user to guess what the number is. If the user's guess is higher than the random number, the program should display "Too high, try again." If the user's guess is lower than the random number, the program should display "Too low, try again." The program should use a loop that repeats until the user correctly guesses the random number.

```java
import java.util.Scanner;

public class GuessMyNumber
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int number, // To hold the random number
            guess,  // To hold the number guessed by user
            tries = 0; // To hold number of tries

        number = (int) (Math.random() * 100) + 1; // get random number between 1 and 100

        System.out.println("Guess My Number Game");
        System.out.println();

        do
        {
            System.out.print("Enter a guess between 1 and 100 : ");
            guess = console.nextInt();

            tries++;

        if (guess > number)
        {
            System.out.println("Too high! Try Again");
        }
        else if (guess < number)
        {
            System.out.println("Too low! Try Again");
        }
        else
        {
	    System.out.println("Correct! You got it in " + tries + " guesses!");
        }

        }while (guess != number);
    }
}
```

## Fibonacci series in Java

In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.

### Fibonacci Series in Java without using recursion

Let's see the fibonacci series program in java without using recursion.

```java
public class FibonacciProgram {
	public static void main(String[] args) {
		printFibonacciProgram(10);
	}
	static void printFibonacciProgram(int count) {
		 int n1=0,n2=1,n3;
		 System.out.print(n1 + " "+ n2);
		 for(int i=2;i<=count;i++) {
			 n3=n1+n2;
			 System.out.print(" " + n3);
			 n1=n2;
			 n2=n3;
		 }
	}
}
```

---

## Prime Number Program in Java

Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only.

In other words, prime numbers can't be divided by other numbers than itself or 1.

For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.

Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.

Let's see the prime number program in java. In this java program, we will take a number variable and check whether the number is prime or not.

```java
public class PrimeCheckProgram {
	public static void main(String[] args) {
		checkNumber(5);
	}
	static void checkNumber(int num) {
		int flag = 0;
		int result = 0;
		result = num / 2;
		if (num == 0 || num == 1) {
			System.out.printf("%d is not Prime Number", num);
		} else {
			for (int i = 2; i <= result; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag==0) {
				System.out.println(num + " is prime number");
			}
		}
	}
}
```

---

## Find prime numbers between two numbers

You can also find prime numbers between two specified numbers.

---

## Palindrome Program in Java

Palindrome number in java: A palindrome number is a number that is same after reverse.

For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. It can also be a string like LOL, MADAM etc.

### Palindrome number algorithm

- Get the number to check for palindrome
- Hold the number in temporary variable
- Reverse the number
- Compare the temporary number with reversed number
- If both numbers are same, print "palindrome number"
- Else print "not palindrome number"

```java
public class PalindromeProgram {
	static void checkPalindrome(int inputNumbs) {
		// accept the number variable to be checked for palindrome
		int temp=inputNumbs;
		int remainder=0;
		int reverse = 0;
		while(temp>0) {
			remainder = temp % 10;//
			reverse = (reverse*10)+remainder;
			temp /=10;
		}
		if(inputNumbs==reverse) {
			 System.out.println("palindrome number ");
		}else {
			System.out.println("not palindrome");
		}
	}
	static void checkPalindromeWithString() {
	      String original, reverse = ""; // Objects of String class
	      System.out.print("Enter String Value : ");
	      original=sc.nextLine();
	      int length = original.length();
	      // loop from the last index of input
	      for(int i=length-1;i>=0;i--) {
	    	  reverse = reverse + original.charAt(i);
	      }
	      if (original.equals(reverse))
			System.out.println("Input Value is Palindrome");
	      else System.out.println("Input Value is not Palindrome");
	}
}
```

---
