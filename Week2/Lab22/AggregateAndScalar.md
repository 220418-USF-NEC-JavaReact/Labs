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

Return the total number of Employees from the table above
- Should just return a number

## Task 2

Return the Department ID and Average monthly salary
- Use the `ROUND` scalar function, and the `AVG` aggregate function to accomplish this
- Return should look like:
| department_id | average |
|---------------|---------|
| 1             | 4000    |
| 2             | 5000    |

## Task 3

Return the singular employee with the highest salary
- Use the `MAX` aggregate function to find which employee has the highest salary
- (Hint) you will need to you a subquery with the above aggregate function

## As you complete the SQL statements above, run the Lab-22.jar file to test the output of each statement