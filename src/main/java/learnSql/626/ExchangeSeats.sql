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