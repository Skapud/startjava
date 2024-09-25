\echo вся таблица
SELECT *
  FROM jaegers
 ORDER BY model_name;

\echo не уничтоженные роботы
SELECT *
  FROM jaegers
 WHERE status <> 'Destroyed'
 ORDER BY model_name;

\echo роботы серии Mark-1 и Mark-4
SELECT *
  FROM jaegers
 WHERE mark IN (1, 4)
 ORDER BY model_name;

\echo все роботы, кроме Mark-1 и Mark-4, сортировка по убыванию по столбцу mark
SELECT *
  FROM jaegers
 WHERE mark NOT IN (1, 4)
 ORDER BY mark DESC;

\echo самые старые роботы
SELECT *
  FROM jaegers
 WHERE launch < '2016-01-01'
 ORDER BY model_name;

\echo роботы, которые уничтожили больше всех kaiju
SELECT model_name, mark, launch, kaiju_kill
  FROM jaegers
 WHERE kaiju_kill = (SELECT MAX(kaiju_kill) FROM jaegers)
 ORDER BY model_name;

\echo средний вес роботов, округлённый 3-х знаков после запятой
SELECT ROUND(AVG(weight), 3) AS weight_avg
  FROM jaegers;

\echo увеличение на 1 количество уничтоженных kaiju у неразрушенных роботов
UPDATE jaegers
   SET kaiju_kill = kaiju_kill + 1
 WHERE status = 'Active';

\echo вся таблица
SELECT *
  FROM jaegers
 ORDER BY model_name;

\echo удалить всех уничтоженных роботов
DELETE
  FROM jaegers
 WHERE status = 'Destroyed';

\echo оставшиеся роботы
SELECT *
  FROM jaegers
 ORDER BY model_name;

