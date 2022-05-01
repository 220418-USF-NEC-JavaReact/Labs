SELECT count(*) FROM employee;

SELECT department, ROUND(AVG(monthly_salary),0) FROM employee 
GROUP BY department
 HAVING department>1;

SELECT * FROM employee 
WHERE monthly_salary = (SELECT max(monthly_salary) FROM employee);