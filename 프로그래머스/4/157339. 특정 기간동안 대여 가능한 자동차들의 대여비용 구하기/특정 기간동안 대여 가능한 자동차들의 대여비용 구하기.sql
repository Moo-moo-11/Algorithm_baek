select a.CAR_ID, a.CAR_TYPE, round(a.DAILY_FEE*(100-b.DISCOUNT_RATE)*30/100) FEE
from CAR_RENTAL_COMPANY_CAR a left join CAR_RENTAL_COMPANY_DISCOUNT_PLAN b on a.CAR_TYPE = b.CAR_TYPE
where a.CAR_ID not in (select CAR_ID
                     from CAR_RENTAL_COMPANY_RENTAL_HISTORY
                     where '2022-11' between date_format(START_DATE, '%Y-%m') and date_format(END_DATE, '%Y-%m'))
                     and b.DURATION_TYPE = '30일 이상'
                     and a.DAILY_FEE*(100-b.DISCOUNT_RATE)*30/100 between 500000 and 2000000
                     and a.CAR_TYPE in ('세단', 'SUV')
order by 3 desc, 2, 1 desc
