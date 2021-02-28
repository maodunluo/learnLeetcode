-- 185. Department Top Three Salaries

USE learning;
CREATE TABLE IF NOT EXISTS Employee
(
    Id           int,
    Name         varchar(255),
    Salary       int,
    DepartmentId int
);
CREATE TABLE IF NOT EXISTS Department
(
    Id   int,
    Name varchar(255)
);
TRUNCATE TABLE Employee;
INSERT INTO Employee (Id, Name, Salary, DepartmentId)
VALUES ('1', 'Joe', '85000', '1');
INSERT INTO Employee (Id, Name, Salary, DepartmentId)
VALUES ('2', 'Henry', '80000', '2');
INSERT INTO Employee (Id, Name, Salary, DepartmentId)
VALUES ('3', 'Sam', '60000', '2');
INSERT INTO Employee (Id, Name, Salary, DepartmentId)
VALUES ('4', 'Max', '90000', '1');
INSERT INTO Employee (Id, Name, Salary, DepartmentId)
VALUES ('5', 'Janet', '69000', '1');
INSERT INTO Employee (Id, Name, Salary, DepartmentId)
VALUES ('6', 'Randy', '85000', '1');
INSERT INTO Employee (Id, Name, Salary, DepartmentId)
VALUES ('7', 'Will', '70000', '1');
TRUNCATE TABLE Department;
INSERT INTO Department (Id, Name)
VALUES ('1', 'IT');
INSERT INTO Department (Id, Name)
VALUES ('2', 'Sales');


SELECT B.Name as Department,
       A.Name as Employee,
       A.Salary
FROM (SELECT *, DENSE_RANK() OVER (PARTITION BY DepartmentId ORDER BY Salary DESC) AS 'rank'
      FROM Employee) A,
     Department B
WHERE A.DepartmentId = B.Id
  AND A.Rank BETWEEN 1 AND 3


