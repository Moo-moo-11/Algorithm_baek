SELECT hour(DATETIME) HOUR, count(1) COUNT
FROM ANIMAL_OUTS
where hour(DATETIME) between 9 and 19
group by 1
order by 1