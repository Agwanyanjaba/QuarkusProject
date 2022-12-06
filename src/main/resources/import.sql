create table if not exists Tickets (id bigint auto_increment,name varchar(255), seat varchar(255),
created_at DATETIME,primary key (id));

INSERT INTO Tickets(name,seat,created_at) VALUES ('Phantom of the Opera','11A',current_timestamp);
INSERT INTO Tickets(name,seat,created_at) VALUES ('Chorus Line','5B', current_timestamp);
INSERT INTO Tickets(name,seat,created_at) VALUES ('Mamma mia','21A',current_timestamp);