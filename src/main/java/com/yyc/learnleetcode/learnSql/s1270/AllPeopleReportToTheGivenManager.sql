-- 1270. All People Report to the Given Manager
USE learning;

CREATE TABLE If NOT EXISTS Employees
(
    employee_id   int,
    employee_name varchar(30),
    manager_id    int
);
Truncate table Employees;
insert into Employees (employee_id, employee_name, manager_id)
values ('1', 'Boss', '1');
insert into Employees (employee_id, employee_name, manager_id)
values ('3', 'Alice', '3');
insert into Employees (employee_id, employee_name, manager_id)
values ('2', 'Bob', '1');
insert into Employees (employee_id, employee_name, manager_id)
values ('4', 'Daniel', '2');
insert into Employees (employee_id, employee_name, manager_id)
values ('7', 'Luis', '4');
insert into Employees (employee_id, employee_name, manager_id)
values ('8', 'John', '3');
insert into Employees (employee_id, employee_name, manager_id)
values ('9', 'Angela', '8');
insert into Employees (employee_id, employee_name, manager_id)
values ('77', 'Robert', '1');

SELECT employee_id
FROM Employees
WHERE manager_id IN
      (SELECT employee_id
       FROM Employees
       WHERE manager_id IN
             (SELECT employee_id
              FROM Employees
              WHERE manager_id = 1
                AND employee_id != 1))
   OR manager_id IN
      (SELECT employee_id
       FROM Employees
       WHERE manager_id = 1
         AND employee_id != 1)
   OR (manager_id = 1
    AND employee_id != 1)
