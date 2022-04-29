select employee_name, department_name
from employee
join department on department = department_id;

select employee_name, department_name
from employee
right join department on department = department_id;

select employee_name, city
from location
left join employee on location = location_id;

select *
from employee where location = 1
union
select *
from employee where department = 1;

select *
from employee where department = 1
except
select *
from employee where location = 1;

select *
from employee where department = 1
intersect
select *
from employee where department = 1;