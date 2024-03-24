select a.HISTORY_ID,
       case when c.DURATION_TYPE is null then (datediff(a.END_DATE, a.START_DATE)+1)*b.DAILY_FEE
       else round((datediff(a.END_DATE, a.START_DATE)+1)*b.DAILY_FEE*(100-c.DISCOUNT_RATE)/100) end FEE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY a left join CAR_RENTAL_COMPANY_CAR b on a.CAR_ID = b.CAR_ID
left join CAR_RENTAL_COMPANY_DISCOUNT_PLAN c on b.CAR_TYPE = c.CAR_TYPE
and case when datediff(a.END_DATE, a.START_DATE) + 1 >= 90 then '90일 이상'
         when datediff(a.END_DATE, a.START_DATE) + 1 >= 30 then '30일 이상'
         when datediff(a.END_DATE, a.START_DATE) + 1 >= 7 then '7일 이상' end = c.DURATION_TYPE
where b.CAR_TYPE = '트럭'
order by 2 desc, 1 desc