SELECT AVERAGE_FEE
FROM
(
SELECT CAR_TYPE, ROUND(AVG(DAILY_FEE)) as AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR
GROUP BY CAR_TYPE
) a
WHERE CAR_TYPE = "SUV"