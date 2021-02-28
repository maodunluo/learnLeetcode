-- 1173. Immediate Food Delivery I

USE learning;
CREATE TABLE IF NOT EXISTS Delivery
(
    delivery_id                 int,
    customer_id                 int,
    order_date                  date,
    customer_pref_delivery_date date
);
TRUNCATE TABLE Delivery;
INSERT INTO Delivery (delivery_id, customer_id, order_date, customer_pref_delivery_date)
VALUES ('1', '1', '2019-08-01', '2019-08-02');
INSERT INTO Delivery (delivery_id, customer_id, order_date, customer_pref_delivery_date)
VALUES ('2', '5', '2019-08-02', '2019-08-02');
INSERT INTO Delivery (delivery_id, customer_id, order_date, customer_pref_delivery_date)
VALUES ('3', '1', '2019-08-11', '2019-08-11');
INSERT INTO Delivery (delivery_id, customer_id, order_date, customer_pref_delivery_date)
VALUES ('4', '3', '2019-08-24', '2019-08-26');
INSERT INTO Delivery (delivery_id, customer_id, order_date, customer_pref_delivery_date)
VALUES ('5', '4', '2019-08-21', '2019-08-22');
INSERT INTO Delivery (delivery_id, customer_id, order_date, customer_pref_delivery_date)
VALUES ('6', '2', '2019-08-11', '2019-08-13');

SELECT *
FROM Delivery;



SELECT ROUND(SUM(order_date = customer_pref_delivery_date) * 100 / COUNT(delivery_id)
           , 2)
           AS immediate_percentage
FROM Delivery

