
SELECT * FROM songs WHERE name = 'Austin';

SELECT artist FROM songs WHERE genre = 'Country';

SELECT name FROM songs WHERE duration > 3.5 and genre = 'Hip Hop';

SELECT * FROM songs WHERE name LIKE 'H%';

SELECT * FROM songs WHERE genre = 'Country' and artist LIKE '% Allen';

UPDATE songs SET fav = 't' WHERE genre = 'Hip Hop';

UPDATE songs SET fav = 't' WHERE artist = 'Nirvana';

UPDATE songs SET fav = 't' WHERE name = 'Austin' or name = 'Springsteen';

DELETE FROM songs WHERE fav = FALSE;

DELETE FROM songs WHERE genre = 'Country';

DELETE FROM songs WHERE duration > 3.5;

DELETE FROM songs WHERE artist = 'Jason Derulo';
