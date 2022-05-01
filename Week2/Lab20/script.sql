SELECT * FROM songs 
WHERE name LIKE 'Austin';

SELECT artist FROM songs 
WHERE genre='Country';

SELECT name FROM songs 
WHERE genre='Hip Hop' 
AND duration >3.50;

SELECT * FROM songs 
WHERE name LIKE 'H%';

SELECT * FROM songs 
WHERE genre='Country' 
AND artist LIKE '%Allen';

UPDATE songs 
SET fav = TRUE 
WHERE genre='Hip Hop';

UPDATE songs 
SET fav = TRUE 
WHERE artist='Nirvana';

UPDATE songs 
SET fav = TRUE 
WHERE name='Austin' OR name='Springsteen';

DELETE FROM songs 
WHERE fav = FALSE;

DELETE FROM songs 
WHERE genre LIKE 'Country';

DELETE FROM songs 
WHERE duration > 3.5;

DELETE FROM songs 
WHERE artist LIKE 'Jason Derulo';