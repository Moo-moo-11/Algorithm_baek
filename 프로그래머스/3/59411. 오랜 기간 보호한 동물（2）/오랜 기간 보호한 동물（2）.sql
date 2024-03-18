select ANIMAL_ID, NAME
from
(
select a.ANIMAL_ID, a.NAME, rank() over (order by a.DATETIME - b.DATETIME desc) rn
from ANIMAL_OUTS a inner join ANIMAL_INS b on a.ANIMAL_ID = b.ANIMAL_ID
) a
where rn <= 2
order by rn