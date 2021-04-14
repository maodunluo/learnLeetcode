-- 610. Triangle Judgement
USE learning;
CREATE TABLE IF NOT EXISTS triangle (x int, y int, z int);
TRUNCATE TABLE triangle;
INSERT INTO triangle (x, y, z) VALUES ('13', '15', '30');
INSERT INTO triangle (x, y, z) VALUES ('10', '20', '15');

SELECT
x,y,z, IF(x+y>z and x+z>y and y+z > x, "Yes", "No") AS triangle
FROM triangle
