select floor(price/10000) * 10000 PRICE_GROUP, count(1) PRODUCTS
from PRODUCT
group by 1
order by 1