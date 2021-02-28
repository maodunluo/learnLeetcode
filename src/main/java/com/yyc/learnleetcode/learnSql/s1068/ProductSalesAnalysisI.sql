-- 1068. Product Sales Analysis I

USE learning;
CREATE TABLE Sales
(
    sale_id    int,
    product_id int,
    year       int,
    quantity   int,
    price      int
);
CREATE TABLE Product
(
    product_id   int,
    product_name varchar(10)
);
TRUNCATE TABLE Sales;
INSERT INTO Sales (sale_id, product_id, year, quantity, price)
VALUES ('1', '100', '2008', '10', '5000');
INSERT INTO Sales (sale_id, product_id, year, quantity, price)
VALUES ('2', '100', '2009', '12', '5000');
INSERT INTO Sales (sale_id, product_id, year, quantity, price)
VALUES ('7', '200', '2011', '15', '9000');
TRUNCATE TABLE Product;
INSERT INTO Product (product_id, product_name)
VALUES ('100', 'Nokia');
INSERT INTO Product (product_id, product_name)
VALUES ('200', 'Apple');
INSERT INTO Product (product_id, product_name)
VALUES ('300', 'Samsung');

SELECT product_name, year, price
FROM Product,
     Sales
WHERE Product.product_id = Sales.product_id