CREATE TABLE book (
	id int NOT NULL AUTO_INCREMENT ,
	name VARCHAR(20) NOT NULL,
	description VARCHAR(20),
	isbn  VARCHAR(20),
	PRIMARY KEY (id)
) ENGINE=InnoDB;