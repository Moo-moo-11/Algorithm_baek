select Year(a.SALES_DATE) YEAR, month(a.SALES_DATE) MONTH, b.GENDER, count(distinct a.USER_ID) USERS
from ONLINE_SALE a inner join USER_INFO b on a.USER_ID = b.USER_ID
where b.GENDER is not null
group by 1, 2, 3
order by 1, 2, 3