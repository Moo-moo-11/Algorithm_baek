select a.ANIMAL_ID, a.ANIMAL_TYPE, a.NAME
from ANIMAL_OUTS a inner join ANIMAL_INS b on a.ANIMAL_ID = b.ANIMAL_ID
where b.SEX_UPON_INTAKE like '%Intact%' and
      (a.SEX_UPON_OUTCOME like '%Neutered%' or a.SEX_UPON_OUTCOME like '%Spayed%')
order by 1