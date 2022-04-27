-- Lab19
create table songs (
    id int primary key,
    name varchar(64) not null,
    artist varchar(64) not null,
    album varchar(64) not null,
    duration decimal
);

insert into (1, 'In the End', 'Linkin Park', 'Hybrid Theory', 3.62),
    (2, 'Kryptonite', '3 Doors Down', 'The Better Life', 3.9),
    (3, 'Play It Again', 'Luke Bryan', 'Crash My Party', 3.78),
    (4, 'Austin', 'Blake Shelton', 'Blake Shelton', 3.83),
    (5, 'Mr. Brightside', 'The Killers', 'Hot Fuss', 3.72),
    (6, 'Stacy\'s Mom', 'Bowling For Soup', 'Ive Never Done Anything Like This', 3.22);

select * from songs;