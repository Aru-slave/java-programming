-- 코드를 입력하세요
SELECT a.ANIMAL_ID as ANIMAL_ID,
       a.NAME as NAME
FROM ANIMAL_OUTS a
left outer join ANIMAL_INS b on a.ANIMAL_ID = b.ANIMAL_ID
where b.ANIMAL_ID is null
order by a.ANIMAL_ID;