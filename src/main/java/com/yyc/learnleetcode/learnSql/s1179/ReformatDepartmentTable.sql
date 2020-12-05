-- 解题思路：
-- 这张表的结构是有三个字段，因为题目要求是按照id排序，这里就考虑到每个月份的收入作为独立的字段，那么必须按照id分组。
-- 如果不用sum的话,得把这里面的group by去掉。但是查出来也是错的，会导致同一个ID有多列数据。
-- To get one row for each id we need to aggregate by id using GROUP BY.
SELECT
id,
SUM(CASE WHEN month = "Jan" THEN revenue ELSE null END) AS "Jan_Revenue",
SUM(CASE WHEN month = "Feb" THEN revenue ELSE null END) AS "Feb_Revenue",
SUM(CASE WHEN month = "Mar" THEN revenue ELSE null END) AS "Mar_Revenue",
SUM(CASE WHEN month = "Apr" THEN revenue ELSE null END) AS "Apr_Revenue",
SUM(CASE WHEN month = "May" THEN revenue ELSE null END) AS "May_Revenue",
SUM(CASE WHEN month = "Jun" THEN revenue ELSE null END) AS "Jun_Revenue",
SUM(CASE WHEN month = "Jul" THEN revenue ELSE null END) AS "Jul_Revenue",
SUM(CASE WHEN month = "Aug" THEN revenue ELSE null END) AS "Aug_Revenue",
SUM(CASE WHEN month = "Sep" THEN revenue ELSE null END) AS "Sep_Revenue",
SUM(CASE WHEN month = "Oct" THEN revenue ELSE null END) AS "Oct_Revenue",
SUM(CASE WHEN month = "Nov" THEN revenue ELSE null END) AS "Nov_Revenue",
SUM(CASE WHEN month = "Dec" THEN revenue ELSE null END) AS "Dec_Revenue"
FROM Department
GROUP BY id
ORDER BY id;
