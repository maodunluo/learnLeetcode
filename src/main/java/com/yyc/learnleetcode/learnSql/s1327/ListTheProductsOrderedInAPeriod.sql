-- 1327. List the Products Ordered in a Period

use learning;

CREATE TABLE IF NOT EXISTS Products (product_id int, product_name varchar(40), product_category varchar(40));
CREATE TABLE IF NOT EXISTS Orders (product_id int, order_date date, unit int);
TRUNCATE TABLE Products;
INSERT INTO Products (product_id, product_name, product_category) VALUES ('1', 'Leetcode Solutions', 'Book');
INSERT INTO Products (product_id, product_name, product_category) VALUES ('2', 'Jewels of Stringology', 'Book');
INSERT INTO Products (product_id, product_name, product_category) VALUES ('3', 'HP', 'Laptop');
INSERT INTO Products (product_id, product_name, product_category) VALUES ('4', 'Lenovo', 'Laptop');
INSERT INTO Products (product_id, product_name, product_category) VALUES ('5', 'Leetcode Kit', 'T-shirt');
TRUNCATE TABLE Orders;
INSERT INTO Orders (product_id, order_date, unit) VALUES ('1', '2020-02-05', '60');
INSERT INTO Orders (product_id, order_date, unit) VALUES ('1', '2020-02-10', '70');
INSERT INTO Orders (product_id, order_date, unit) VALUES ('2', '2020-01-18', '30');
INSERT INTO Orders (product_id, order_date, unit) VALUES ('2', '2020-02-11', '80');
INSERT INTO Orders (product_id, order_date, unit) VALUES ('3', '2020-02-17', '2');
INSERT INTO Orders (product_id, order_date, unit) VALUES ('3', '2020-02-24', '3');
INSERT INTO Orders (product_id, order_date, unit) VALUES ('4', '2020-03-01', '20');
INSERT INTO Orders (product_id, order_date, unit) VALUES ('4', '2020-03-04', '30');
INSERT INTO Orders (product_id, order_date, unit) VALUES ('4', '2020-03-04', '60');
INSERT INTO Orders (product_id, order_date, unit) VALUES ('5', '2020-02-25', '50');
INSERT INTO Orders (product_id, order_date, unit) VALUES ('5', '2020-02-27', '50');
INSERT INTO Orders (product_id, order_date, unit) VALUES ('5', '2020-03-01', '50');

SELECT product_name, SUM(Orders.unit) AS unit
FROM Products LEFT JOIN Orders
ON Products.product_id = Orders.product_id
WHERE order_date BETWEEN "2020-02-01" AND "2020-02-29"
GROUP BY Products.product_id
HAVING SUM(Orders.unit) >= 100