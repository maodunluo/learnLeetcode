-- 本题的考察点是order by 倒序排序。下面的 id % 2 != 0 可以用mod()函数来代替
SELECT
id, movie, description, rating
FROM cinema
WHERE id % 2 != 0 AND description != "boring"
ORDER BY rating DESC