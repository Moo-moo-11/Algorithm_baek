select USER_ID, NICKNAME, 전체주소, 전화번호
from
(
SELECT b.USER_ID, b.NICKNAME, concat(b.CITY," ",b.STREET_ADDRESS1," ", b.STREET_ADDRESS2) 전체주소,
       concat(substr(b.TLNO,1,3),"-",substr(b.TLNO,4,4),"-",substr(b.TLNO,8,4)) 전화번호,
       count(1) cn
from USED_GOODS_BOARD a inner join USED_GOODS_USER b on a.WRITER_ID = b.USER_ID
group by 1
) a
where cn >= 3
order by 1 desc