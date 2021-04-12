-- 586. Customer Placing the Largest Number of Orders

use learning;
CREATE TABLE IF NOT EXISTS orders (order_number int, customer_number int);
TRUNCATE TABLE orders;
INSERT INTO orders (order_number, customer_number) VALUES ('1', '1');
INSERT INTO orders (order_number, customer_number) VALUES ('2', '2');
INSERT INTO orders (order_number, customer_number) VALUES ('3', '3');
INSERT INTO orders (order_number, customer_number) VALUES ('4', '3');

SELECT customer_number
FROM (SELECT count(1) as count,
             customer_number
      FROM Orders
      GROUP BY customer_number
      ORDER BY count DESC) AS t1
LIMIT 1