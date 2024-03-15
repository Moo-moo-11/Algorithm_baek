select WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS,
       if (FREEZER_YN is null, 'N', FREEZER_YN) FREEZER_YN
from FOOD_WAREHOUSE
where ADDRESS like '경기도%'
order by WAREHOUSE_ID