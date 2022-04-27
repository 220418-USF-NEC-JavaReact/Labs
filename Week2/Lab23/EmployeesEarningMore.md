# In the `script.sql` file write the correct SQL statements to accomplish the following:
## The local database file will be created in your C:\Users\<USERNAME>\ you can delete it after the test lab is complete

## Assume you have a database with the following tables:

### employee table

| Key | Column Name | Data Type |
|-----|-------------|-----------|
| PK  | id          | int       |
|     | name        | varchar   |
|     | salary      | int       |
|     | managerId   | int       |

id is the primary key column for this table

Each row of this table indicates the ID of an employee, their name, salary, and the ID of their manager

## Task

Write an SQL query to find the employees who earn more than their managers

Return the result table in any order

The query result should only include the employees name

## As you complete the challenge, run the Lab-23.jar file to test the output of your statement