create table department (
 id int(11) not null auto_increment,
 name varchar(60) default null,
 primary key (id)

);

create table seller (
id int(11) not null auto_increment,
name varchar(60) not null,
email varchar(60) not null,
birthdate datetime(6) not null,
basesalary double not null,
departmentid int(11) not null,
primary key (id),
foreign key (departmentid) references department (id)

);

insert into department (name) values 
  ('Computers'),
  ('Electronics'),
  ('Fashion'),
  ('Books');

insert into seller (name, email, birthdate, basesalary, departmentid) values 
  ('Bob Brown','bob@gmail.com','1998-04-21 00:00:00',1000,1),
  ('Maria Green','maria@gmail.com','1979-12-31 00:00:00',3500,2),
  ('Alex Grey','alex@gmail.com','1988-01-15 00:00:00',2200,1),
  ('Martha Red','martha@gmail.com','1993-11-30 00:00:00',3000,4),
  ('Donald Blue','donald@gmail.com','2000-01-09 00:00:00',4000,3),
  ('Alex Pink','bob@gmail.com','1997-03-04 00:00:00',3000,2);