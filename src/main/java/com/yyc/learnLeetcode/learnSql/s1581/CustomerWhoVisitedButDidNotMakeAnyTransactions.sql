SELECT customer_id, COUNT(*) AS count_no_trans
FROM Visits where visit_id not in (SELECT DISTINCT visit_id FROM Transactions)
GROUP BY customer_id