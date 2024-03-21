select a.APNT_NO, c.PT_NAME, a.PT_NO, a.MCDP_CD, b.DR_NAME, a.APNT_YMD
from APPOINTMENT a inner join DOCTOR b on a.MDDR_ID = b.DR_ID inner join PATIENT c on a.PT_NO = c.PT_NO
where date(a.APNT_YMD) = '2022-04-13' and a.MCDP_CD = 'CS' and a.APNT_CNCL_YN = 'N'
order by 6