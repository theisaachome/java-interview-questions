Programs to print triangles using _, numbers, and characters
Example 1: Program to print half pyramid using _

```
*
* *
* * *
* * * *
* * * * *
```

```java
public class Main {

  public static void main(String[] args) {
    int rows = 5;

    for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
```

### Example 2: Program to print half pyramid a using numbers

```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

```java
public class Main {

  public static void main(String[] args) {
    int rows = 5;

    for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
```

### Example 3: Program to print half pyramid using alphabets

```
A
B B
C C C
D D D D
E E E E E
```

```java
public class Main {

  public static void main(String[] args) {
    char last = 'E', alphabet = 'A';

    for (int i = 1; i <= (last - 'A' + 1); ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(alphabet + " ");
      }
      ++alphabet;

      System.out.println();
    }
  }
}
```

### Programs to print inverted half pyramid using \_ and numbers

### Example 4: Inverted half pyramid using \_

```
* * * * *
* * * *
* * *
* *
*
```

```java
public class Main {

public static void main(String[] args) {
int rows = 5;

    for (int i = rows; i >= 1; --i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }

}
}
```

### Example 5: Inverted half pyramid using numbers

```
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```

```java
public class Main {

public static void main(String[] args) {
int rows = 5;

    for (int i = rows; i >= 1; --i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

}
}
```

### Programs to display pyramid and inverted pyramid using \_ and digits

### Example 6: Program to print full pyramid using \_

```
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
```

```java
public class Main {

  public static void main(String[] args) {
    int rows = 5, k = 0;

    for (int i = 1; i <= rows; ++i, k = 0) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
  }
}
```

### Example 7: Program to print pyramid using numbers

```
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
```

```java

public class Main {

  public static void main(String[] args) {
    int rows = 5, k = 0, count = 0, count1 = 0;

    for (int i = 1; i <= rows; ++i) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
        ++count;
      }

      while (k != 2 * i - 1) {
        if (count <= rows - 1) {
          System.out.print((i + k) + " ");
          ++count;
        } else {
          ++count1;
          System.out.print((i + k - 2 * count1) + " ");
        }

        ++k;
      }
      count1 = count = k = 0;

      System.out.println();
    }
  }
}
```

### Example 8: Inverted full pyramid using \*

```
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
```

```java
public class Main {

  public static void main(String[] args) {
    int rows = 5;

    for(int i = rows; i >= 1; --i) {
      for(int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      for(int j=i; j <= 2 * i - 1; ++j) {
        System.out.print("* ");
      }

      for(int j = 0; j < i - 1; ++j) {
        System.out.print("* ");
      }

      System.out.println();
    }
  }
}
```

### Example 9: Print Pascal's triangle

```
           1
         1   1
       1   2   1
     1   3   3    1
   1   4   6   4   1
 1   5   10   10  5   1

```

```java
public class Main {

  public static void main(String[] args) {
    int rows = 6, coef = 1;

    for(int i = 0; i < rows; i++) {
      for(int space = 1; space < rows - i; ++space) {
        System.out.print("  ");
      }

      for(int j = 0; j <= i; j++) {
        if (j == 0 || i == 0)
          coef = 1;
        else
          coef = coef * (i - j + 1) / j;

        System.out.printf("%4d", coef);
      }

      System.out.println();
    }
  }
}
```

### Example 10: Print Floyd's Triangle.

```
1
2 3
4 5 6
7 8 9 10
```

```java
public class Main {

  public static void main(String[] args) {
    int rows = 4, number = 1;

    for(int i = 1; i <= rows; i++) {

      for(int j = 1; j <= i; j++) {
        System.out.print(number + " ");
        ++number;
      }

      System.out.println();
    }
  }
}
```
