select b.AUTHOR_ID, c.AUTHOR_NAME, b.CATEGORY, sum(a.SALES*b.PRICE) TOTAL_SALES
from BOOK_SALES a left join BOOK b on a.BOOK_ID = b.BOOK_ID left join AUTHOR c on b.AUTHOR_ID = c.AUTHOR_ID
where a.SALES_DATE like '2022-01%'
group by b.AUTHOR_ID, b.CATEGORY
order by b.AUTHOR_ID, b.CATEGORY desc