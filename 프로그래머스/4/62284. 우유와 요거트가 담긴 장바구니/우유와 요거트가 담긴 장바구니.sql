select CART_ID
from CART_PRODUCTS
where NAME = 'Yogurt' or NAME = 'Milk'
group by 1
having count(distinct NAME) >= 2
order by 1