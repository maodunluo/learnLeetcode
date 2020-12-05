-- 将表里的男女的性别互转，有什么思路？？？
-- 在sql里使用if，在sql实现判断逻辑。需要掌握的知识点是IF()
-- IF(condition,true_value,false_value)
-- If expr1 is TRUE (expr1 <> 0 and expr1 <> NULL) then IF() returns expr2; otherwise it returns expr3.
-- 还有一种思路是IF里面进行位运算，来提高效率。

UPDATE
salary
SET sex = IF(sex = "m" ,"f", "m");


