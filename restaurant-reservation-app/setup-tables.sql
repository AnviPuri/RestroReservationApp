create database restaurant_reservation;

use restaurant_reservation;

--CREATE LATER
--create table user_login(
--	user_login_id int not null auto_increment primary key,
--	userlogin varchar(256),
--	password varchar(200),
--	is_active bit not null,
--);

create table address(
	address_id int not null auto_increment primary key,
	street_address varchar(500),
	city varchar(100) not null,
	region varchar(100),
	postal_code varchar(20),
	country varchar(100) not null,
	latitude float,
	longitude float
);

create table user(
	user_id int not null auto_increment primary key,
	first_name varchar(100) not null,
	last_name varchar(100),
	email varchar(100) not null,
	phone_number varchar(20),
	address_id int,
	is_active bit not null,
	foreign key (address_id) references address(address_id)
);

create table restaurant(
	restaurant_id int not null auto_increment primary key,
	restaurant_name varchar(200),
	address_id int,
	is_active bit not null,
	foreign key (address_id) references address(address_id)
);

create table table_info(
	table_info_id int not null auto_increment primary key,
	restaurant_id int,
	table_number varchar(20),
	number_of_seats int,
	is_available bit not null,
	foreign key (restaurant_id) references restaurant(restaurant_id)
);

create table reservation(
	reservation_id int not null auto_increment primary key,
	table_info_id int,
	user_id int,
	booking_start_time bigint,
	booking_end_time bigint,
	foreign key (table_info_id) references table_info(table_info_id),
	foreign key (user_id) references user(user_id)
);