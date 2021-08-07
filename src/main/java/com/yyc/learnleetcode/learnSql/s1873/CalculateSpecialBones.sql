-- 1873. Calculate Special Bonus

USE learning;
CREATE TABLE IF NOT EXISTS Employees
(
    employee_id int,
    name        varchar(30),
    salary      int
);
TRUNCATE TABLE Employees;
INSERT INTO Employees (employee_id, name, salary)
VALUES ('2', 'Meir', '3000');
INSERT INTO Employees (employee_id, name, salary)
VALUES ('3', 'Michael', '3800');
INSERT INTO Employees (employee_id, name, salary)
VALUES ('7', 'Addilyn', '7400');
INSERT INTO Employees (employee_id, name, salary)
VALUES ('8', 'Juan', '6100');
INSERT INTO Employees (employee_id, name, salary)
VALUES ('9', 'Kannon', '7700');



SELECT employee_id,
       IF(employee_id % 2 = 0 OR name LIKE 'M%', 0, salary) AS bonus
FROM Employees
