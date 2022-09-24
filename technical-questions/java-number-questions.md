## Table of Content

- [Reverse Number ](#question-1-reverse-a-number-in-java)
- [Automorphic Number ](#question-2-what-is-an-automorphic-number)
- [Sunny Number](#question-3-sunny-number-in-java)
- [Buzz Number ](#buzz-number-java)

## Question 1: Reverse a Number in Java

To reverse a number, follow the steps given below:

- First, we find the remainder of the given number by using the modulo (%) operator.

- Multiply the variable reverse by 10 and add the remainder into it.
  Divide the number by 10.

- Repeat the above steps until the number becomes 0.

example

```
input : 987654 => output = 456789
```

```java
public class ReverseNumberProgram {
	public static void main(String[] args) {
		inverseNumber(-12345);
	}
	static void inverseNumber(int inputNums) {
		System.out.println("Original Numbers : " +inputNums);
		// get last digit from input using % operator
		// reverse * 10 + remainder
		// remove the last digit
		boolean isNegative = inputNums<0? true:false;
		int remainder =0;
		int reverse =0;
		if(isNegative) {
			inputNums = inputNums*-1;
		}
		while(inputNums>0) {
			remainder = inputNums%10;
			reverse = reverse*10+remainder;
			inputNums/=10;
		}
		reverse =isNegative ? reverse*-1:reverse;
		System.out.println("Reverse : " + reverse);
	}
}
```

---

## Question 2: What is an automorphic number?

A number is called an automorphic number if and only if the square of the given number ends with the same number itself.

For example, 25, 76 are automorphic numbers because their square is 625 and 5776, respectively and the last two digits of the square represent the number itself.

Some other automorphic numbers are 5, 6, 36, 890625, etc.

## How to find automorphic number?

Follow the steps given below:

- Read a number (num) from the user.
- Find the square of the given number and store it in a variable (square).
- Find the last digit(s) of the square.
- Compare the last digit(s) of the variable with num.
- If they are not equal, the given number is not an automorphic number.
- If they are the same, go to the next step.
- Remove the last digit of the given number i.e. num.
- Repeat steps 4 to 6 until the given number becomes 0.

```java
public class AutomorphicProgram {
	public static void main(String[] args) {
		System.out.println(isAutomorphic(5) ? "Automorphic!." : "Not Automorphic!.");
	}
	static boolean isAutomorphic(int num) {
		// get Square of the num
		int square = num * num;
		while(num>0) {
			//find the remainder (last digit) of the variable num and square and comparing them
			if(num%10 != square%10) {
				return false;
			}
			//reduce num and square by dividing them by 10
			num = num/10;
			square /= 10;
		}
		return true;
	}
}
```

---

## Question 3: Sunny Number in Java

### Sunny Number

A number is called a sunny number if the number next to the given number is a perfect square.

In other words, a number N will be a sunny number if N+1 is a perfect square.

Let's understand it through an example.

### Sunny Number Example

Suppose, we have to check if 80 is a sunny number or not.

Given, N=80 then N+1 will be 80+1=81, which is a perfect square of the number 9. Hence 80 is a sunny number.

Let's take another number 10.

Given, N=10 then N+1 will be 10+1=11, which is not a perfect square. Hence 10 is not a sunny number.

### Steps to Find Sunny Number

The logic is very simple. To find the sunny number, we need only to check whether N+1 is the perfect square or not.

- Read or initialize a number (num).
- Add 1 to the given number i.e. num+1.
- Find the square root of num+1.
- If the square root is an integer, the given number is sunny, else not a sunny number.
- Let's implement the above steps in a Java program.

```java
public class SunnyNumberProgram {
	static void isSunnyNumber(int num) {
		if (isPerfectSquare(num + 1)) {
			System.out.println("The given number is a sunny number.");
		} else {
			System.out.println("The given Number is not a sunny number.");
		}
	}
	private static boolean isPerfectSquare(int num) {
		double sqare_root = Math.sqrt(num);
		return (sqare_root - (Math.floor(sqare_root)) == 0);
	}
}
```

Find Sunny Betwee 2 inputs numbers

```
#Example
Enter lower range: 1
Enter upper range: 1000
The Sunny number from 1 to 1000 are:
```

```java
public SunnyProgram{
static void findSunnyNumbers() {
		int start = 0, end = 0;
		System.out.println("Enter Number Between :");
		System.out.print("From ");
		start = sc.nextInt();
		System.out.print("To ");
		end = sc.nextInt();
		for (int i = start; i <= end; i++) {
			if(isSunny(i))System.out.println(i);
		}
	}

	private static boolean isSunny(int i) {
	  return (Math.sqrt(i+1)%1==0)? true:false;
	}
}
```

---

## Buzz Number Java

Let's take some examples of Buzz numbers.

- 42 is a Buzz number because it is divisible by 7.
- 107 is a Buzz number because it ends with 7.
- 147 is a Buzz number because it ends with 7 and also divisible by 7.
- 134 is not a Buzz number because it is neither end with 7 nor divisible by 7.

```java
static boolean checkBuzzNumber(int num) {
		// check whether the number ends with 7,
		// is divisible by 7 or not
		if (num % 7 == 0 || num % 10 == 7) {
			return true;
		}
		return false;
	}
```

### FizzBuzz Program

```java
	public static void fizzBuzz(int nums) {
		for (int i = 1; i <= nums; i++) {
			if (i % (3 * 5) == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Fizz");
			} else if (i % 3 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
```

### The Buzz number in a given range

```java
static void checkBuzzBetween() {
		int start,end;
		System.out.print("Enter Start :");
		start=sc.nextInt();
		System.out.print("Enter end :");
		end = sc.nextInt();
		for(int i=start;i<=end;i++) {
			if(i%10==7 || i%7==0) {
				System.out.println(i+ " is a Buzz number.");
			}
		}
}
```
