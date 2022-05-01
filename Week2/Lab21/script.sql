SELECT employee.employee_name, department.department_name FROM employee 
INNER JOIN department 
ON department.department_id = employee.department;

SELECT employee.employee_name, department.department_name FROM employee 
RIGHT JOIN department 
ON department.department_id = employee.department;

SELECT employee.employee_name, location.city FROM location 
LEFT JOIN employee 
ON location.location_id = employee.location;

SELECT * FROM employee
WHERE department=1
UNION
SELECT * FROM employee 
WHERE location =1;

SELECT * FROM employee
WHERE department=1
MINUS
SELECT * FROM employee 
WHERE location =1;

SELECT * FROM employee
WHERE location =1 OR department=1
INTERSECT
SELECT * FROM employee 
WHERE department =1;

--Milan