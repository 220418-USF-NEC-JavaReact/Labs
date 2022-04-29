select count(*) from employee;

select department , round(avg(monthly_salary))
from employee
group by department having department > 1;

select * from employee
where monthly_salary = (
    select max(monthly_salary)
    from employee
);