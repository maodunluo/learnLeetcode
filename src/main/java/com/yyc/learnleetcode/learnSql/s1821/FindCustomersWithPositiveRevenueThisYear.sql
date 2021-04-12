-- 1821. Find Customers With Positive Revenue this Year
use learning;
CREATE TABLE IF NOT EXISTS Customers (customer_id int, year int, revenue int);
TRUNCATE TABLE Customers;
INSERT INTO Customers (customer_id, year, revenue) VALUES ('1', '2018', '50');
INSERT INTO Customers (customer_id, year, revenue) VALUES ('1', '2021', '30');
INSERT INTO Customers (customer_id, year, revenue) VALUES ('1', '2020', '70');
INSERT INTO Customers (customer_id, year, revenue) VALUES ('2', '2021', '-50');
INSERT INTO Customers (customer_id, year, revenue) VALUES ('3', '2018', '10');
INSERT INTO Customers (customer_id, year, revenue) VALUES ('3', '2016', '50');
INSERT INTO Customers (customer_id, year, revenue) VALUES ('4', '2021', '20');

SELECT
    customer_id
FROM Customers
WHERE year = 2021
AND revenue > 0