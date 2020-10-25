-- 没难度
SELECT t1.name, t1.population, t1.area
FROM world t1
WHERE t1.area > 3000000 OR t1.population > 25000000;