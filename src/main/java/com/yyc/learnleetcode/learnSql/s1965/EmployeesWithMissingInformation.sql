-- 1965. Employees With Missing Information

USE learning;

CREATE TABLE IF NOT EXISTS Employees
(
    employee_id int,
    name        varchar(30)
);
CREATE TABLE IF NOT EXISTS Salaries
(
    employee_id int,
    salary      int
);
TRUNCATE TABLE Employees;
INSERT INTO Employees (employee_id, name)
VALUES ('2', 'Crew');
INSERT INTO Employees (employee_id, name)
VALUES ('4', 'Haven');
INSERT INTO Employees (employee_id, name)
VALUES ('5', 'Kristian');
TRUNCATE TABLE Salaries;
INSERT INTO Salaries (employee_id, salary)
VALUES ('5', '76071');
INSERT INTO Salaries (employee_id, salary)
VALUES ('1', '22517');
INSERT INTO Salaries (employee_id, salary)
VALUES ('4', '63539');


SELECT employee_id
FROM Employees
WHERE employee_id not in (SELECT Salaries.employee_id
                          FROM Salaries)
UNION
SELECT employee_id
FROM Salaries
WHERE employee_id NOT IN (SELECT Employees.employee_id
                          FROM Employees)
ORDER BY employee_id
