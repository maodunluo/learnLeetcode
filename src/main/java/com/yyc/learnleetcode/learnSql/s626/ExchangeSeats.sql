-- 也可以用union,吃完饭后再看另一种解法。

SELECT
id,(CASE WHEN id % 2 = 0 THEN
    (SELECT student FROM seat WHERE id = (i.id - 1))
         WHEN id % 2 != 0 AND id != (SELECT MAX(id) from seat) THEN (SELECT student FROM seat WHERE id = (i.id + 1)) ELSE
             student END) AS student
FROM seat as i;

-- 不能直接用select max（id）
-- SELECT
-- id,(CASE WHEN id % 2 = 0 THEN
--     (SELECT student FROM seat WHERE id = (i.id - 1))
--          WHEN id % 2 != 0 AND id < SELECT MAX(id) from seat THEN (SELECT student FROM seat WHERE id = (i.id + 1)) ELSE
--              student END) AS student
-- FROM seat as i;

-- The MySQL UNION operator is used to combine the result sets of 2 or more SELECT statements.
-- It removes duplicate rows between the various SELECT statements.
-- Each SELECT statement within the UNION operator must have the same number of fields in the result sets with similar data types.

-- 这个如果嵌套查student就会报错，应该怎么改？？
SELECT id, student FROM seat WHERE id % 2 != 0 AND id = (SELECT MAX(id) FROM seat)
UNION
SELECT id - 1 AS id, student FROM seat WHERE id % 2 = 0
UNION
SELECT id + 1 AS id, student FROM seat WHERE id % 2 != 0 AND id != (SELECT MAX(id) FROM seat)
ORDER BY id ASC
