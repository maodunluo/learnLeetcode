-- 这题是sql函数，已经忘记了这方面的知识。待填坑。

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      SELECT
      e1.Salary AS getNthHighestSalary
      FROM (SELECT DISTINCT Salary FROM Employee) e1
      WHERE (SELECT COUNT(*) FROM (SELECT DISTINCT Salary FROM Employee) e2 WHERE e1.Salary < e2.Salary) = N -1
      LIMIT 1
  );
END