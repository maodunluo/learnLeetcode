-- 1393. Capital Gain/Loss
USE learning;

CREATE TABLE IF NOT EXISTS Stocks
(
    stock_name    varchar(15),
    operation     ENUM ('Sell', 'Buy'),
    operation_day int,
    price         int
);
TRUNCATE TABLE Stocks;
INSERT INTO Stocks (stock_name, operation, operation_day, price)
VALUES ('Leetcode', 'Buy', '1', '1000');
INSERT INTO Stocks (stock_name, operation, operation_day, price)
VALUES ('Corona Masks', 'Buy', '2', '10');
INSERT INTO Stocks (stock_name, operation, operation_day, price)
VALUES ('Leetcode', 'Sell', '5', '9000');
INSERT INTO Stocks (stock_name, operation, operation_day, price)
VALUES ('Handbags', 'Buy', '17', '30000');
INSERT INTO Stocks (stock_name, operation, operation_day, price)
VALUES ('Corona Masks', 'Sell', '3', '1010');
INSERT INTO Stocks (stock_name, operation, operation_day, price)
VALUES ('Corona Masks', 'Buy', '4', '1000');
INSERT INTO Stocks (stock_name, operation, operation_day, price)
VALUES ('Corona Masks', 'Sell', '5', '500');
INSERT INTO Stocks (stock_name, operation, operation_day, price)
VALUES ('Corona Masks', 'Buy', '6', '1000');
INSERT INTO Stocks (stock_name, operation, operation_day, price)
VALUES ('Handbags', 'Sell', '29', '7000');
INSERT INTO Stocks (stock_name, operation, operation_day, price)
VALUES ('Corona Masks', 'Sell', '10', '10000');

SELECT stock_name,
       SUM(IF(operation = 'Buy', -price, price)) AS capital_gain_loss
FROM Stocks
GROUP BY stock_name