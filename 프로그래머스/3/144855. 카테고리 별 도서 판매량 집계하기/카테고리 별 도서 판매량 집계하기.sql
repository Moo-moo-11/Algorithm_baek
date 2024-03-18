select b.CATEGORY, sum(a.SALES) TOTAL_SALES
from BOOK_SALES a inner join BOOK b on a.BOOK_ID = b.BOOK_ID
where Year(a.SALES_DATE) = 2022 and Month(a.SALES_DATE) = 1
group by 1
order by 1