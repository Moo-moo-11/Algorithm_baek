select CAR_ID, if(num = 1, '대여중', '대여 가능') AVAILAVILITY
from 
(
select CAR_ID, sum(if(START_DATE <= '2022-10-16' and END_DATE >= '2022-10-16', 1, 0)) num
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by 1
) a
order by 1 desc