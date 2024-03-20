select CATEGORY, PRICE MAX_PRICE, PRODUCT_NAME
from
(
select CATEGORY, rank() over (partition by CATEGORY order by PRICE desc) rn, PRICE, PRODUCT_NAME
from FOOD_PRODUCT
where CATEGORY in ('과자', '국', '김치', '식용유')
) a
where rn = 1
order by 2 desc