select a.BOOK_ID, b.AUTHOR_NAME, date_format(a.PUBLISHED_DATE, '%Y-%m-%d') PUBLISHED_DATE
from BOOK a inner join AUTHOR b on a.AUTHOR_ID = b.AUTHOR_ID
where a.CATEGORY = '경제'
order by 3