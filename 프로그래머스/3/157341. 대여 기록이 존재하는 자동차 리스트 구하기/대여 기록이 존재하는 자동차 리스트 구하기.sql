select distinct a.CAR_ID
from CAR_RENTAL_COMPANY_RENTAL_HISTORY a inner join CAR_RENTAL_COMPANY_CAR b on a.CAR_ID = b.CAR_ID
where b.CAR_TYPE = '세단' and month(a.START_DATE) = 10
order by 1 desc