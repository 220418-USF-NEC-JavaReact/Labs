select *
from employee e
where e.salary > (
    select m.salary
    from employee m
    where e.managerId = m.id
);