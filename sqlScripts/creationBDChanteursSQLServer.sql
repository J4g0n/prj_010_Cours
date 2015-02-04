-- Se positionner sur la bd voulue
USE bdChanteursSS;

CREATE TABLE chanteurs (
	nom VARCHAR(128) NOT NULL,
	prenom VARCHAR(128) NOT NULL,
	date INT NULL,
	PRIMARY KEY(nom)
);