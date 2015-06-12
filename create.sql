create table Customer(
	email varchar(256),
	pw varchar(16),
	name varchar(128), 
	surename varchar(128)
);

create table Products(
	internal integer,
	price	float,
	description varchar(1024),
	pricture varchar(1014)
);

create table Basket(
	internal integer,
	email varchar(256)
);
