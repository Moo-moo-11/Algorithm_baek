select b.PRODUCT_CODE, sum(a.SALES_AMOUNT * b.PRICE) SALES
from OFFLINE_SALE a left join PRODUCT b on a.PRODUCT_ID = b.PRODUCT_ID
group by 1
order by 2 desc, 1