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
