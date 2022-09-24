## Basic String Program

### Count Total Characters from a String.

```java
  public static void countCharacters() {
    String str = "The best of both worlds";
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ')
        count++;
    }
    System.out.println("Total Chars : " + count);
  }
```

### Count Total Punctuations from a String.

```java
  public static void countPunctuations() {
    String str = "!!!!!He said, 'The mailman loves you.' I heard it with my own ears.";
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '!' ||
          str.charAt(i) == ',' ||
          str.charAt(i) == ';' ||
          str.charAt(i) == '.' ||
          str.charAt(i) == '?' ||
          str.charAt(i) == '-' ||
          str.charAt(i) == '\'' ||
          str.charAt(i) == '\"' ||
          str.charAt(i) == ':') {
        count++;
      }
    }
    System.out.println("Total Punctuations : " + count);
}
```

---

### Count vowels and consonants

```java
	public static void countVowelConsonant() {
		String str = "abce   ";
		int vCount =0,cCount=0;
		for(int i=0;i<str.length();i++) {
			str = str.toLowerCase().trim();
			if(isVowel(str.charAt(i))) {
				vCount++;
			}else {
				cCount++;
			}
		}
		System.out.println("Total Vowel : " + vCount);
		System.out.println("Total Constants : " + cCount);
	}

private static boolean isVowel(char data) {
		return (data=='a' ||
				   data=='e' ||
				   data=='i' ||
				   data=='o' ||
				   data=='u' )? true :false;
	}
```

---

Here is a list of some of the frequently asked String Interview Questions from Coding Interviews:

1. Print duplicate characters from String?.

```java

```

---

2. Check if two Strings are anagrams of each other? (solution)

---

3. Print the first non-repeated character from String? (solution)

---

4. Reverse a given String using recursion? (solution)

5. Check if a String contains only digits? (solution)

6. Find duplicate characters in a String? (solution)

7. Count many vowels and consonants in a given String? (solution)

8. Count the occurrence of a given character in String? (solution)

9. Find all permutations of String? (solution)

10. Reverse words in a given sentence without using any library method? (solution)

11. Check if two String is a rotation of each other? (solution)

12. Check if the given String is Palindrome? (solution)

Read more: https://www.java67.com/2018/06/data-structure-and-algorithm-interview-questions-programmers.html#ixzz7fTzVoZE8
