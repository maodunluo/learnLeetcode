-- 262. Trips and Users

USE learning;
CREATE TABLE IF NOT EXISTS Trips
(
    Id         int,
    Client_Id  int,
    Driver_Id  int,
    City_Id    int,
    Status     ENUM ('completed', 'cancelled_by_driver', 'cancelled_by_client'),
    Request_at varchar(50)
);
CREATE TABLE IF NOT EXISTS Users
(
    Users_Id int,
    Banned   varchar(50),
    Role     ENUM ('client', 'driver', 'partner')
);
Truncate table Trips;
INSERT INTO Trips (Id, Client_Id, Driver_Id, City_Id, Status, Request_at)
VALUES ('1', '1', '10', '1', 'completed', '2013-10-01');
INSERT INTO Trips (Id, Client_Id, Driver_Id, City_Id, Status, Request_at)
VALUES ('2', '2', '11', '1', 'cancelled_by_driver', '2013-10-01');
INSERT INTO Trips (Id, Client_Id, Driver_Id, City_Id, Status, Request_at)
VALUES ('3', '3', '12', '6', 'completed', '2013-10-01');
INSERT INTO Trips (Id, Client_Id, Driver_Id, City_Id, Status, Request_at)
VALUES ('4', '4', '13', '6', 'cancelled_by_client', '2013-10-01');
INSERT INTO Trips (Id, Client_Id, Driver_Id, City_Id, Status, Request_at)
VALUES ('5', '1', '10', '1', 'completed', '2013-10-02');
INSERT INTO Trips (Id, Client_Id, Driver_Id, City_Id, Status, Request_at)
VALUES ('6', '2', '11', '6', 'completed', '2013-10-02');
INSERT INTO Trips (Id, Client_Id, Driver_Id, City_Id, Status, Request_at)
VALUES ('7', '3', '12', '6', 'completed', '2013-10-02');
INSERT INTO Trips (Id, Client_Id, Driver_Id, City_Id, Status, Request_at)
VALUES ('8', '2', '12', '12', 'completed', '2013-10-03');
INSERT INTO Trips (Id, Client_Id, Driver_Id, City_Id, Status, Request_at)
VALUES ('9', '3', '10', '12', 'completed', '2013-10-03');
INSERT INTO Trips (Id, Client_Id, Driver_Id, City_Id, Status, Request_at)
VALUES ('10', '4', '13', '12', 'cancelled_by_driver', '2013-10-03');
TRUNCATE TABLE Users;
INSERT INTO Users (Users_Id, Banned, Role)
VALUES ('1', 'No', 'client');
INSERT INTO Users (Users_Id, Banned, Role)
VALUES ('2', 'Yes', 'client');
INSERT INTO Users (Users_Id, Banned, Role)
VALUES ('3', 'No', 'client');
INSERT INTO Users (Users_Id, Banned, Role)
VALUES ('4', 'No', 'client');
INSERT INTO Users (Users_Id, Banned, Role)
VALUES ('10', 'No', 'driver');
INSERT INTO Users (Users_Id, Banned, Role)
VALUES ('11', 'No', 'driver');
INSERT INTO Users (Users_Id, Banned, Role)
VALUES ('12', 'No', 'driver');
INSERT INTO Users (Users_Id, Banned, Role)
VALUES ('13', 'No', 'driver');


WITH cts AS (SELECT * FROM users where role = 'client' AND banned = 'No'),
     cts2 AS (select * FROM users where role = 'driver' AND banned = 'No')
SELECT request_at                                                        AS Day,
       ABS(ROUND(SUM(IF(status = 'completed', 1, 0)) / COUNT(*), 2) - 1) AS "Cancellation Rate"
FROM trips,
     cts,
     cts2
WHERE trips.client_id = cts.users_id
  AND trips.driver_id = cts2.users_id
  AND trips.request_at BETWEEN ('2013-10-01') AND ('2013-10-03')
GROUP BY request_at

