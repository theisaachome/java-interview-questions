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
