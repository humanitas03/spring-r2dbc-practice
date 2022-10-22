DROP TABLE IF EXISTS r2dbc.person;
DROP TABLE IF EXISTS r2dbc.team;

CREATE TABLE IF NOT EXISTS r2dbc.person
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    name VARCHAR(100) NULL,
    phone_number VARCHAR(100) NULL,
    team_id INT NULL
);

CREATE TABLE IF NOT EXISTS r2dbc.team
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    team_name VARCHAR(100) NULL
);