select FLAVOR
from
(
select a.FLAVOR, rank() over (order by sum(a.TOTAL_ORDER + if(b.TOTAL_ORDER is null, 0, b.TOTAL_ORDER)) desc) rn
from JULY a left join FIRST_HALF b on a.SHIPMENT_ID = b.SHIPMENT_ID
group by a.FLAVOR
) c
where rn <= 3
order by rn