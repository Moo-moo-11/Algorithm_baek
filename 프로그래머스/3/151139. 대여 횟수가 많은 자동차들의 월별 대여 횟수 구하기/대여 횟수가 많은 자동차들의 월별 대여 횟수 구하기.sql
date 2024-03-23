select month(START_DATE) MONTH, CAR_ID, count(1) RECORDS
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where CAR_ID in (select CAR_ID
                 from CAR_RENTAL_COMPANY_RENTAL_HISTORY
                 where year(START_DATE) = '2022' and month(START_DATE) between 8 and 10
                 group by 1
                 having count(1) >= 5)
                 and year(START_DATE) = '2022' and month(START_DATE) between 8 and 10
GROUP BY 1, 2
having count(1) >= 1
order by 1, 2 desc