-- 1251. Average Selling Price

SELECT
     UnitsSold.product_id AS product_id, ROUND(SUM(Prices.price * UnitsSold.units) / SUM(UnitsSold.units), 2) AS average_price
FROM
    UnitsSold, Prices
WHERE
    UnitsSold.product_id = Prices.product_id
AND
    UnitsSold.purchase_date BETWEEN Prices.start_date AND Prices.end_date
GROUP BY
	UnitsSold.product_id
