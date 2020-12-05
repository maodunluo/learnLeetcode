SELECT
e1.employee_id, count(e1.employee_id) AS team_size
FROM
Employee e1 LEFT JOIN Employee e2 ON e1.team_id = e2.team_id
GROUP BY e1.employee_id