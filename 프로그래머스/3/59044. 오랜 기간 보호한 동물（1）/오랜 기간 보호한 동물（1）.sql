select NAME, a.DATETIME
from
(
select a.NAME, a. DATETIME, rank() over (order by a.DATETIME) rn
from ANIMAL_INS a left join ANIMAL_OUTS b on a.ANIMAL_ID = b.ANIMAL_ID
where b.ANIMAL_ID is null
) a
where rn<=3
order by 2