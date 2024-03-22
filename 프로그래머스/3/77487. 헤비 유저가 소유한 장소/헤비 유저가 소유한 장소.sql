select a.ID, a.NAME, b.HOST_ID
from PLACES a inner join (select HOST_ID
from PLACES
group by HOST_ID
Having count(HOST_ID) >= 2
) b on a.HOST_ID = b.HOST_ID
order by 1