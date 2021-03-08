-- 511. Game Play Analysis I

USE learning;

CREATE TABLE IF NOT EXISTS Activity
(
    player_id    int,
    device_id    int,
    event_date   date,
    games_played int
);
Truncate table Activity;
INSERT INTO ACTIVITY (player_id, device_id, event_date, games_played)
VALUES ('1', '2', '2016-03-01', '5');
INSERT INTO ACTIVITY (player_id, device_id, event_date, games_played)
VALUES ('1', '2', '2016-05-02', '6');
INSERT INTO ACTIVITY (player_id, device_id, event_date, games_played)
VALUES ('2', '3', '2017-06-25', '1');
INSERT INTO ACTIVITY (player_id, device_id, event_date, games_played)
VALUES ('3', '1', '2016-03-02', '0');
INSERT INTO ACTIVITY (player_id, device_id, event_date, games_played)
VALUES ('3', '4', '2018-07-03', '5');


SELECT player_id,
       min(event_date) As 'first_login'
FROM Activity
GROUP BY player_id
