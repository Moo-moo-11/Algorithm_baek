SELECT a.ITEM_ID, b.ITEM_NAME
FROM ITEM_TREE a LEFT JOIN ITEM_INFO b ON a.ITEM_ID = b.ITEM_ID
WHERE a.PAREnT_ITEM_ID IS NULL
ORDER BY 1