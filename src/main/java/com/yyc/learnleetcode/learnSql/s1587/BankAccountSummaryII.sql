-- solution1
SELECT *
FROM
(SELECT
name, SUM(amount) AS balance
FROM Transactions LEFT JOIN Users ON Transactions.account = Users.account
GROUP BY Transactions.account) AS middleResult
WHERE middleResult.balance > 10000

-- solution2
SELECT
name, SUM(amount) AS balance
FROM Transactions LEFT JOIN Users ON Transactions.account = Users.account
GROUP BY Transactions.account
HAVING balance > 10000