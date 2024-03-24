with NUMB as (select count(distinct USER_ID) cn
           from USER_INFO
           where year(JOINED) = '2021')

select year(a.SALES_DATE) YEAR, month(a.SALES_DATE) MONTH, 
       count(distinct a.USER_ID) PUCHASED_USERS,
       round(count(distinct a.USER_ID)/(select cn from NUMB),1) PUCHASED_RATIO
from ONLINE_SALE a left join USER_INFO b on a.USER_ID = b.USER_ID
where a.USER_ID in (select USER_ID
                    from USER_INFO
                    where year(JOINED) = '2021')
group by 1, 2
order by 1, 2