SELECT a.TITLE, a.BOARD_ID, b.REPLY_ID, b.WRITER_ID, b.CONTENTS,
       date_format(b.CREATED_DATE, '%Y-%m-%d') CREATED_DATE
FROM USED_GOODS_BOARD a INNER JOIN USED_GOODS_REPLY b on a.BOARD_ID=b.BOARD_ID
WHERE a.CREATED_DATE like '2022-10%'
ORDER BY b.CREATED_DATE, a.TITLE