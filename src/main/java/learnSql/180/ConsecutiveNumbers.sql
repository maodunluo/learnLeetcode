SELECT DISTINCT l1.Num AS ConsecutiveNums
FROM Logs l1 LEFT JOIN Logs l2 ON l1.Id = l2.Id - 1
LEFT JOIN Logs l3 on l2.Id = l3.Id -1
WHERE l1.Num = l2.Num and l2.Num = l3.Num;

-- WHERE l1.Num = l2.Num = l3.Num这个只有在l3.Num为0或者1时才会正确。因为第一个等于号生成的表达式为布尔表达式，结果是0或者1。
-- 还得滤重，如果大于三个的话只取一个值。