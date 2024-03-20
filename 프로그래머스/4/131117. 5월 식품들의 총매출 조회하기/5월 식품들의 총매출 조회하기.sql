select a.PRODUCT_ID, b.PRODUCT_NAME, sum(a.AMOUNT * b.PRICE) TOTAL_SALES
from FOOD_ORDER a inner join FOOD_PRODUCT b on a.PRODUCT_ID = b.PRODUCT_ID
where year(a.PRODUCE_DATE) = 2022 and month(a.PRODUCE_DATE) = 5
group by 1
order by 3 desc, 1