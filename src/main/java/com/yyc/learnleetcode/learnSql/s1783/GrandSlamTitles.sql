-- 1783. Grand Slam Titles

USE learning;

CREATE TABLE IF NOT EXISTS Players
(
    player_id   int,
    player_name varchar(20)
);
CREATE TABLE IF NOT EXISTS Championships
(
    year      int,
    Wimbledon int,
    Fr_open   int,
    US_open   int,
    Au_open   int
);
TRUNCATE TABLE Players;
INSERT INTO Players (player_id, player_name)
VALUES ('1', 'Nadal');
INSERT INTO Players (player_id, player_name)
VALUES ('2', 'Federer');
INSERT INTO Players (player_id, player_name)
VALUES ('3', 'Novak');
TRUNCATE TABLE Championships;
INSERT INTO Championships (year, Wimbledon, Fr_open, US_open, Au_open)
VALUES ('2018', '1', '1', '1', '1');
INSERT INTO Championships (year, Wimbledon, Fr_open, US_open, Au_open)
VALUES ('2019', '1', '1', '2', '2');
INSERT INTO Championships (year, Wimbledon, Fr_open, US_open, Au_open)
VALUES ('2020', '2', '1', '2', '2');


with data as (
    SELECT year, Wimbledon as winner
    FROM Championships

    UNION ALL

    SELECT year, Fr_open as winner
    FROM Championships

    UNION ALL

    SELECT year, US_open as winner
    FROM Championships

    UNION ALL

    SELECT year, Au_open as winner
    FROM Championships)

select p.player_id, p.player_name, COUNT(*) as grand_slams_count
from Players as p
         join data as d
              on d.winner = p.player_id
group by p.player_id, p.player_name

