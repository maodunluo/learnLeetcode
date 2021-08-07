-- 1853. Convert Date Format

USE learning;
CREATE TABLE IF NOT EXISTS Days (day date);
TRUNCATE TABLE Days;
INSERT INTO Days (day) VALUES ('2022-04-12');
INSERT INTO Days (day) VALUES ('2021-08-09');
INSERT INTO Days (day) VALUES ('2020-06-26');

SELECT DATE_FORMAT(day, '%W, %M %e, %Y') AS day FROM Days;