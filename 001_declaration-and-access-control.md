# Java Basic

## Define Class

### Table Of Content

- [Source File Declaration Rules](#source-file-declaration-rules)

---

## Source File Declaration Rules

- There can be only one public class per source code file.

- Comments can appear at the beginning or end of any line in the source code file.

- If there is a public class in a file, the name of the file must match the name of the public class.  
  Example `Dog.java`
  ```java
  public class Dog { }
  ```
- If the class is part of a package, the package statement must be the first line in the source code file, before any import statements that may be present.

  ```java
  package com.isaachome.domain;
  public class Dog { }
  ```

- If there are import statements, they must go between the package statement and the class declaration.

  ```java
  package com.isaachome.domain;
  import com.isaachome.repo.DogRepo; // import statement
  public class Dog {
    private DogRepo dogRepo;
   }
  ```

  - If there isn’t a package statement, then the import statement(s) must be the first line(s) in the source code file.

  ```java
  import com.isaachome.domain; // no package statement
  public class Dog { }
  ```

  - If there are no package or import statements, the class declaration must be the first line in the source code file.

  ```java
    public class Dog { }
  ```

- import and package statements apply to all classes within a source code file.

- A file can have more than one non-public class.

- Files with no public classes can have a name that does not match any of the classes in the file.

  ```java
    public class Animal{ }
    class Cat{}
    class Dog{}
  ```
