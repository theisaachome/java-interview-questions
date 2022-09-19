## Creating Database and Tables

### list all databases from the server

```sql
mysql> show databases;
```

### Create Database

```sql
mysql> CREATE DATABASE  dog_db;
```

### Delete Database

```
DROP DATABASE <db_name>;
```

```sql
mysql> DROP DATABASE test_db;
```

### Using Database

```sql
# USE <db_name>;
mysql>  USE dog_db;
```

### Create Table

```sql
Create Table Cats(
  name VARCHAR(225) NOT NULl,
  breed VARCHAR(225),
  age INT
);
```

### Setup Not Null Column

```sql
CREATE TABLE Cats(
  name VARCHAR(100) NOT NUll ,
  age INT NOT Null
)
```

### Setup Default Values

```sql
CREATE TABLE Cats(
name VARCHAR(100) NOT NULL DEFAULT 'unamed',
age INT NOT NULL DEFAULT 99
)
```

### Setup Primaty Key

```sql
CREATE TABLE  Cats (
cat_id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(100),
age INT,
PRIMARY KEY (cat_id)
);
```
