-- 1435. Create a Session Bar Chart

USE learning;

CREATE TABLE IF NOT EXISTS Sessions (session_id int, duration int);
TRUNCATE TABLE Sessions;
INSERT INTO Sessions (session_id, duration) VALUES ('1', '30');
INSERT INTO Sessions (session_id, duration) VALUES ('2', '199');
INSERT INTO Sessions (session_id, duration) VALUES ('3', '299');
INSERT INTO Sessions (session_id, duration) VALUES ('4', '580');
INSERT INTO Sessions (session_id, duration) VALUES ('5', '1000');

SELECT

FROM Sessions




SELECT SESSION_ID,
       CASE
           WHEN DURATION < 60*5
               THEN '[0-5>'
           WHEN DURATION > 60*5 AND DURATION < 60*10
               THEN '[5-10>'
           WHEN DURATION > 60*10 AND DURATION < 60*15
               THEN '[10-15>'
           WHEN DURATION > 60*15
               THEN '15 or more'
           END AS B
FROM SESSIONS
SELECT '[0-5>' AS B
UNION
SELECT '[5-10>' AS B
UNION
SELECT '[10-15>' AS B
UNION
SELECT '15 or more' AS B