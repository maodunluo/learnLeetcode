-- 1777. Product's Price for Each Store

USE learning;

CREATE TABLE IF NOT EXISTS Products
(
    product_id int,
    store      ENUM ('store1', 'store2', 'store3'),
    price      int
);
TRUNCATE TABLE Products;
INSERT INTO Products (product_id, store, price)
VALUES ('0', 'store1', '95');
INSERT INTO Products (product_id, store, price)
VALUES ('0', 'store3', '105');
INSERT INTO Products (product_id, store, price)
VALUES ('0', 'store2', '100');
INSERT INTO Products (product_id, store, price)
VALUES ('1', 'store1', '70');
INSERT INTO Products (product_id, store, price)
VALUES ('1', 'store3', '80');

SELECT product_id,
       SUM(IF(store = 'store1', price, null)) AS 'store1',
       SUM(IF(store = 'store2', price, null)) AS 'store2',
       SUM(IF(store = 'store3', price, null)) AS 'store3'
FROM Products
GROUP BY product_id