select b.MEMBER_NAME, a.REVIEW_TEXT, date_format(a.REVIEW_DATE, '%Y-%m-%d') REVIEW_DATE
from REST_REVIEW a inner join MEMBER_PROFILE b on a.MEMBER_ID = b.MEMBER_ID
where a.MEMBER_ID in (select MEMBER_ID
                      from
                      (
                      select MEMBER_ID, rank() over (order by count(1) desc) rn
                      from REST_REVIEW
                      group by 1
                      ) a
                      where rn = 1
                      )
order by a.REVIEW_DATE, a.REVIEW_TEXT