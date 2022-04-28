select employee_name, department_name
from employee
join department on department = department_id;

select employee_name, department_name
from employee
right join department on department = department_id;

select employee_name, city
from employee
left join location on location = location_id;

