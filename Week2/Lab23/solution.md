SELECT
    *
FROM
    employee AS a,
    employee AS b
WHERE
    a.managerId = b.id
        AND a.salary > b.salary;