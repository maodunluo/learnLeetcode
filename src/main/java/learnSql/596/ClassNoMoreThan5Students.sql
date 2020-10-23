-- 这道题如果没有加distinct就会报错。distinct的作用是如果表里面有重复数据就会将重复数据过滤过去，防止同一个student被重复添加进去。
SELECT class
FROM courses
GROUP BY class
HAVING count(DISTINCT student) >= 5
