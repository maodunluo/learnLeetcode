-- 1795. Rearrange Products Table
USE learning;

CREATE TABLE IF NOT EXISTS Products
(
    product_id int,
    store1     int,
    store2     int,
    store3     int
);
TRUNCATE TABLE Products;
INSERT INTO Products (product_id, store1, store2, store3)
VALUES ('0', '95', '100', '105');
INSERT INTO Products (product_id, store1, store2, store3)
VALUES ('1', '70', 'None', '80');

with summary as (SELECT product_id,
                        'store1' AS store,
                        store1   AS price
                 FROM products
                 union
                 SELECT product_id,
                        'store2' AS store,
                        store2   AS price
                 FROM products
                 union
                 SELECT product_id,
                        'store3' AS store,
                        store3   AS price
                 FROM products
)

select product_id, store, price
FROM summary
WHERE price IS NOT null;