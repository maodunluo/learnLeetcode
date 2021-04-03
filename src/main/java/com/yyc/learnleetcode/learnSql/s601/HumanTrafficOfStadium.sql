-- 601. Human Traffic of Stadium
USE learning;

CREATE TABLE IF NOT EXISTS stadium (id int, visit_date DATE NULL, people int);
TRUNCATE TABLE stadium;
INSERT INTO stadium (id, visit_date, people) VALUES ('1', '2017-01-01', '10');
INSERT INTO stadium (id, visit_date, people) VALUES ('2', '2017-01-02', '109');
INSERT INTO stadium (id, visit_date, people) VALUES ('3', '2017-01-03', '150');
INSERT INTO stadium (id, visit_date, people) VALUES ('4', '2017-01-04', '99');
INSERT INTO stadium (id, visit_date, people) VALUES ('5', '2017-01-05', '145');
INSERT INTO stadium (id, visit_date, people) VALUES ('6', '2017-01-06', '1455');
INSERT INTO stadium (id, visit_date, people) VALUES ('7', '2017-01-07', '199');
INSERT INTO stadium (id, visit_date, people) VALUES ('8', '2017-01-09', '188');