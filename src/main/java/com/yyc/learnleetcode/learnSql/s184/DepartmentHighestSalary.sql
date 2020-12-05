-- 如何取出同一departmentId中salary最大的那一列。先通过departmentId分组吗？貌似不可行。不用自联结，要在where中上一步生成的中间表。

-- WHERE e2.DepartmentId = dep.Id这是重点

-- SELECT
-- "D.Name" AS Department, "E.Name" AS Employee, "E.Salary" AS Salary
-- FROM
-- Employee  E LEFT JOIN Department D
-- ON E.DepartmentId = D.Id
-- WHERE E.Id = (SELECT Id from Employee WHERE Salary = SELECT max(Salary) FROM Employee  E LEFT JOIN Department D ON E.DepartmentId = D.Id GROUP BY "D.Name")
-- GROUP BY "D.Name"
-- ORDER BY "E.Salary" DESC

SELECT dep.Name AS Department, emp.Name AS Employee, emp.Salary
FROM Department dep, Employee emp
WHERE emp.DepartmentId=dep.Id AND
emp.Salary = (SELECT MAX(Salary) FROM Employee e2 WHERE e2.DepartmentId = dep.Id)
ORDER BY emp.Salary DESC;