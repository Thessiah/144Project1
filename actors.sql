CREATE TABLE Actors(Name char(40), Movie char(80), Year int, Role char(40));

LOAD DATA LOCAL INFILE ~/data/actors.csv INTO TABLE Actors;
