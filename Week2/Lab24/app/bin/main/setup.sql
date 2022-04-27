create table address(
    address_id int primary key,
    line_one varchar(64),
    line_two varchar(16),
    city varchar(24),
    state varchar(2),
    zip int,
    country varchar(32)
);

create table person(
    id int primary key,
    name varchar(64),
    email varchar(96),
    social int,
    address int references address(address_id)
);