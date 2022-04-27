# In the `script.sql` file write the correct SQL statements to accomplish the following:
## The local database file will be created in your C:\Users\<USERNAME>\ you can delete it after the test lab is complete

## Assume you have a database with the following tables:

### dempartment:

| Keys  | Column Name     | Datatype      | References |
|------ |-----------------|---------------|------------|
| PK    | department_id   | int           |            |
|       | department_name | varchar(50)   |            |
|       | monthly_budget  | numberic(7,2) |            |

### location:

| Keys  | Column Name | Datatype    | References |
|------ |-------------|-------------|------------|
| PK    | location_id | int         |            |
|       | street      | varchar(25) |            |
|       | city        | varchar(25) |            |
|       | state       | varchar(2)  |            |
|       | zipcode     | int         |            |

### employee:

| Keys  | Column Name    | Datatype     | References    | Constraints |
|------ |----------------|--------------|---------------|-------------|
| PK    | employee_id    | int          |               |             |
|       | employee_name  | varchar(64)  |               |             |
|       | birthday       | date         |               |             |
|       | monthly_salary | numeric(7,2) |               | NOT NULL    |
| FK    | department     | int          | department_id | NOT NULL    |
|       | hire_date      | date         |               |             |
|       | position       | varchar(20)  |               |             |
|       | manager        | int          |               |             |
| FK    | location       | int          | location_id   | NOT NULL    |

## Task 1

Use an inner join to return each employee's name and their department name
- Use only a single sql statement

## Task 2

Use a right join to return each department with all of their employees
- Use only a single sql statement
- (Hint) one department has no employees and did not show up in the previous join

# Task 3

Use a left join to return each employee's name who does not work from home, and their city they work in
- Use only a single sql statement
- (Hint) if they work from home their location is null

# Task 4

Use a UNION to the return the Employees who either work in department 1, or location 1
- Use only a single statement

# Task 5

Use a MINUS to return the Employees who work in department 1, but not in location 1
- Use only a single statement

# Task 6

Use an INTERSECT to return the Employees who work in department 1 AND in location 1
- Use only a single statement

## As you complete the SQL statements above, run the Lab-20.jar file to test the output of each statement