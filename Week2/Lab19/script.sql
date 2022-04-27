create table if not exists songs(
    id int primary key,
	name varchar(64) NOT NULL,
	artisit varchar(64) NOT NULL,
	albumn varchar(136) NOT NULL,
	duration DECIMAL(3, 2)
);

insert into songs (id, name, artisit, albumn, duration) values
	(1, 'In The End', 'Linkin Park', 'Hybrid Theory', 3.62),
	(2, 'Kryptonite', '3 Doors Down','The Better Life', 3.9),
	(3, 'Play It Again', 'Luke Bryan', 'Crash My Party', 3.78),
	(4, 'Austin', 'Blake Shelton', 'Blake Shelton', 3.83),
    (5, 'Mr. Brightside', 'The Killers', 'Hot Fuss', 3.72),
    (6, 'Stacys Mom', 'Bowling For Soup', 'Ive Never Anything Like This', 3.22);

select * from songs;