-- 1407. Top Travellers

SELECT
    Users.name,IFNULL(SUM(distance), 0) AS travelled_distance
FROM
    Users
LEFT JOIN
    Rides
ON
    Users.id = Rides.user_id
GROUP BY
    Users.id
ORDER BY
    travelled_distance DESC, Users.name

-- 这一种比上面的快
SELECT
    Users.name,COALESCE(SUM(distance), 0) AS travelled_distance
FROM
    Users
LEFT JOIN
    Rides
ON
    Users.id = Rides.user_id
GROUP BY
    Users.id
ORDER BY
    travelled_distance DESC, Users.name