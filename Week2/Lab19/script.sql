create table songs (
	id int primary key,
	name varchar(128) not null,
	artist varchar(128) not null,
	albumn varchar(128) not null,
	duration decimal(3, 2)
);

insert into songs (id, name, artist, albumn, duration) values
		(1, 'In The End', 'Linkin Park', 'Hybrid Theory', '3.62');
		
insert into songs (id, name, artist, albumn, duration) values
		(2, 'Kryptonite', '3 Doors Down', 'The Better Life', '3.9');
		
insert into songs (id, name, artist, albumn, duration) values
		(3, 'Play It Again', 'Luke Bryan', 'Crash My Party', '3.78');
	
insert into songs (id, name, artist, albumn, duration) values
		(4, 'Austin', 'Blake Shelton', 'Blake Shelton', '3.83');
	
insert into songs (id, name, artist, albumn, duration) values
		(5, 'Mr. Brightside', 'The Killers', 'Hot Fuss', '3.72');
	
insert into songs (id, name, artist, albumn, duration) values
		(6, 'Stacys Mom', 'Bowling For Soup', 'Ive Never Anything Like This', '3.22');

select * from songs;		
