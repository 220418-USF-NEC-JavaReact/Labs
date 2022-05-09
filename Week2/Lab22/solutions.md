SELECT COUNT(employee_id) AS TOTAL_EMPLOYEES FROM employee;

SELECT department, ROUND(AVG(monthly_salary)) AS AVG_SALARY
FROM employee
GROUP BY department
HAVING department>1;


SELECT *
FROM employee 
WHERE monthly_salary = 
    (SELECT MAX(monthly_salary)
    FROM employee);
