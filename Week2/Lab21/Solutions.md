SELECT employee.employee_name AS NAME, department.department_name AS DEPARTMENT 
FROM employee 
INNER JOIN department
ON employee.department = department.department_id;

SELECT employee.employee_name AS NAME, department.department_name AS DEPARTMENT 
FROM employee 
RIGHT JOIN department
ON employee.department = department.department_id;

SELECT employee.employee_name AS NAME, location.city AS CITY
FROM location 
LEFT JOIN employee
ON location.location_id = employee.location;

SELECT * FROM employee 
WHERE department=1
UNION
SELECT * FROM employee
WHERE location=1;

SELECT *
FROM employee 
WHERE department=1
MINUS
SELECT *
FROM employee
WHERE location=1;

SELECT *
FROM employee 
WHERE department=1
INTERSECT
SELECT *
FROM employee
WHERE department=1
