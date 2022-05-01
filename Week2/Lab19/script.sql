CREATE TABLE songs(
	id int NOT NULL PRIMARY KEY,
	name varchar(255) NOT NULL,
	artist varchar(255) NOT NULL,
	album varchar(255) NOT NULL,
	duration decimal(4,2)	
	);
	
INSERT INTO songs
VALUES(
	1,
    'In The End',
    'Linkin Park',
    'Hybrid Theory',
    3.62
);

INSERT INTO songs
VALUES(
	2,
    'Kryptonite',
    '3 Doors Down',
    'The Better Life',
    3.9
);

INSERT INTO songs
VALUES(
	3,
    'Play It Again',
    'Luke Bryan',
    'Crash My Party',
    3.78
);

INSERT INTO songs
VALUES(
	4,
    'Austin',
    'Blake Shelton',
    'Blake Shelton',
    3.83
);

INSERT INTO songs
VALUES(
	5,
    'Mr. Brightside',
    'The Killers',
    'Hot Fuss',
    3.72
);

INSERT INTO songs
VALUES(
	6,
    'Stacys Mom',
    'Bowling For Soup',
    'Ive Never Anything Like This',
    3.22
);
    
SELECT * FROM songs;