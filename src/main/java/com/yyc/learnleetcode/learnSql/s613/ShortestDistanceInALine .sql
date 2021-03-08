-- 613. Shortest Distance in a Line

USE learning;

CREATE TABLE IF NOT EXISTS point (x INT NOT NULL, UNIQUE INDEX x_UNIQUE (x ASC));
TRUNCATE TABLE point;
INSERT INTO point (x) VALUES ('-1');
INSERT INTO point (x) VALUES ('0');
INSERT INTO point (x) VALUES ('2');

SELECT MIN(ABS(p1.x - p2.x)) AS shortest
FROM point p1,
     point p2
WHERE p1.x <> p2.x