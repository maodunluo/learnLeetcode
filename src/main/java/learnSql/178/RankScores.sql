-- 如何新创造一列rank？用sql排序
-- 这个问题的难点是用join连接，第二张表为滤重后的表，然后拼接后取的值为count，这个是不好想的，还有rank是mysql中的关键字，需要加上双引号才代表字符。
-- 还有要设置mac中的mysql，修改sql mode，使之取消only full group by.不然在navicat中通过不了。这个模式指的是SELECT后面接的列必须被GROUP BY后面接的列所包含
-- SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
SELECT
S1.Score, COUNT(S2.Score) AS "Rank"
FROM
Scores S1,
(SELECT DISTINCT Score FROM Scores) S2
WHERE S1.Score <= S2.Score
GROUP BY S1.Id
ORDER BY S1.Score DESC