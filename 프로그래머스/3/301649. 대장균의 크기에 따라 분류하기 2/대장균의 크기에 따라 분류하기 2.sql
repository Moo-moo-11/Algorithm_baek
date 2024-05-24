WITH CTE AS (
SELECT COUNT(1) cn
FROM ECOLI_DATA
)

SELECT ID,
       CASE WHEN rn BETWEEN 1 AND (SELECT cn FROM CTE)/4 THEN 'CRITICAL'
            WHEN rn BETWEEN (SELECT cn FROM CTE)/4 + 1 AND 2*(SELECT cn FROM CTE)/4 THEN 'HIGH'
            WHEN rn BETWEEN 2*(SELECT cn FROM CTE)/4 + 1 AND 3*(SELECT cn FROM CTE)/4 THEN 'MEDIUM'
            ELSE 'LOW' END COLONY_NAME
FROM
(SELECT ID, RANK() OVER (ORDER BY SIZE_OF_COLONY DESC) rn
FROM ECOLI_DATA) a
ORDER BY ID