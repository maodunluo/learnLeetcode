-- 1445. Apples & Oranges

USE learning;

CREATE TABLE IF NOT EXISTS Sales (sale_date date, fruit ENUM('apples', 'oranges'), sold_num int);
TRUNCATE TABLE Sales;
INSERT INTO Sales (sale_date, fruit, sold_num) VALUES ('2020-05-01', 'apples', '10');
INSERT INTO Sales (sale_date, fruit, sold_num) VALUES ('2020-05-01', 'oranges', '8');
INSERT INTO Sales (sale_date, fruit, sold_num) VALUES ('2020-05-02', 'apples', '15');
INSERT INTO Sales (sale_date, fruit, sold_num) VALUES ('2020-05-02', 'oranges', '15');
INSERT INTO Sales (sale_date, fruit, sold_num) VALUES ('2020-05-03', 'apples', '20');
INSERT INTO Sales (sale_date, fruit, sold_num) VALUES ('2020-05-03', 'oranges', '0');
INSERT INTO Sales (sale_date, fruit, sold_num) VALUES ('2020-05-04', 'apples', '15');
INSERT INTO Sales (sale_date, fruit, sold_num) VALUES ('2020-05-04', 'oranges', '16');

SELECT s1.sale_date AS sale_date, s1.sold_num - s2.sold_num AS diff
FROM Sales s1 LEFT JOIN Sales s2 ON s1.sale_date = s2.sale_date AND s1.fruit != s2.fruit
WHERE s1.fruit = 'apples';

-- can use case when to avoid using left join
SELECT sale_date, SUM(IF(fruit = 'apples', sold_num, -sold_num)) AS diff
FROM Sales GROUP BY sale_date;