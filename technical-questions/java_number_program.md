## Table of Content

- [Reverse Number ](#question-1-reverse-a-number-in-java)
- []()

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

## What is an automorphic number?

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
