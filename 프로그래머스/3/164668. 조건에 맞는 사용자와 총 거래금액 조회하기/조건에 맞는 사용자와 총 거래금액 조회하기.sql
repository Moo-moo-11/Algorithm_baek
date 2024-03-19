select USER_ID, NICKNAME, TOTAL_SALES
from
(
select b.USER_ID, b.NICKNAME, sum(a.PRICE) TOTAL_SALES
from USED_GOODS_BOARD a inner join USED_GOODS_USER b on a.WRITER_ID = b.USER_ID
where a.STATUS = 'DONE'
group by 1
) a
where TOTAL_SALES >= 700000
order by 3