-- 1789. Primary Department for Each Employee
USE learning;
CREATE TABLE IF NOT EXISTS Employee
(
    employee_id   int,
    department_id int,
    primary_flag  ENUM ('Y','N')
);
TRUNCATE TABLE Employee;
INSERT INTO Employee (employee_id, department_id, primary_flag)
VALUES ('1', '1', 'N');
INSERT INTO Employee (employee_id, department_id, primary_flag)
VALUES ('2', '1', 'Y');
INSERT INTO Employee (employee_id, department_id, primary_flag)
VALUES ('2', '2', 'N');
INSERT INTO Employee (employee_id, department_id, primary_flag)
VALUES ('3', '3', 'N');
INSERT INTO Employee (employee_id, department_id, primary_flag)
VALUES ('4', '2', 'N');
INSERT INTO Employee (employee_id, department_id, primary_flag)
VALUES ('4', '3', 'Y');
INSERT INTO Employee (employee_id, department_id, primary_flag)
VALUES ('4', '4', 'N');


SELECT e1.employee_id,
       e1.department_id
FROM Employee e1
         LEFT JOIN (SELECT employee_id,
                           COUNT(employee_id) AS count
                    FROM Employee
                    GROUP BY employee_id) e2 ON e1.employee_id = e2.employee_id
WHERE e1.primary_flag = 'Y'
   OR e2.count = 1