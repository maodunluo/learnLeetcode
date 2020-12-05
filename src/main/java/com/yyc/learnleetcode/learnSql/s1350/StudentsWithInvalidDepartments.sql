# Write your MySQL query statement below
SELECT id, name
FROM Students s
WHERE s.id NOT IN
    (SELECT S.id
    FROM
    Students S , Departments D
    WHERE S.department_id = D.id)