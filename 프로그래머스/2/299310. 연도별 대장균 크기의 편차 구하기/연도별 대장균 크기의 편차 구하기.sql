
SELECT b.YEAR, b.mx - a.SIZE_OF_COLONY YEAR_DEV, a.ID
FROM ECOLI_DATA a LEFT JOIN (
SELECT YEAR(DIFFERENTIATION_DATE) YEAR, MAX(SIZE_OF_COLONY) mx
FROM ECOLI_DATA
GROUP BY YEAR) b ON YEAR(a.DIFFERENTIATION_DATE) = b.YEAR
ORDER BY b.YEAR, YEAR_DEV