-- 这个是找到比上一天温度高的id https://leetcode.com/problems/rising-temperature/submissions/
-- 表结构为 id date temperature  需要用到自联结和TO_DAYS函数.将日期作为联结的项。
            -- 方法1：将表1作为温度高的表进行比较，并取表1中的id, run 735ms
    SELECT t1.Id
    FROM weather t1
    INNER JOIN weather t2
    ON TO_DAYS(t1.RecordDate) = TO_DAYS(t2.RecordDate) + 1
    WHERE t1.Temperature > t2.Temperature;

-- 方法2：将表2作为温度高的表，并取表2中的id
    SELECT t2.Id
    FROM weather t1
    INNER JOIN weather t2
    ON TO_DAYS(t1.RecordDate) + 1 = TO_DAYS(t2.RecordDate)
    WHERE t1.Temperature < t2.Temperature;

-- 方法3：使用where来代替join（需比较是哪一种效率更高一些）run 716ms
    SELECT t1.Id
    FROM weather t1, weather t2
    WHERE t1.Temperature > t2.Temperature AND TO_DAYS(t1.RecordDate) = TO_DAYS(t2.RecordDate) + 1;

-- 方法4：最优 用date_sub
    SELECT
    FROM weather t1, weather t2
    where t1.RecordDate = date_sub(t2.RecordDate, interval 1 day)
    and t1.Temperature < t2.Temperature;
