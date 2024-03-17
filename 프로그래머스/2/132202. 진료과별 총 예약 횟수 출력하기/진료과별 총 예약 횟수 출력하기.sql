select MCDP_CD 진료과코드, count(1) 5월예약건수
from APPOINTMENT
where year(APNT_YMD) = 2022 and month(APNT_YMD) = 5
group by 1
order by 2, 1