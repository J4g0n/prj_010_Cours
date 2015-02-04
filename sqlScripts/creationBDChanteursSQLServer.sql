-- Se positionner sur la bd voulue
USE bdChanteursSS;

CREATE TABLE chanteurs (
	nom VARCHAR(128) NOT NULL,
	prenom VARCHAR(128) NOT NULL,
	date INT NULL,
	PRIMARY KEY(nom)
);

USE BDTest;

CREATE TABLE tennismen (
	id INT NOT NULL,
	nom VARCHAR(128) NOT NULL,
	prenom VARCHAR(128) NOT NULL,
	age INT NULL,
	PRIMARY KEY(nom) AUTO INCREMENT
);

DELETE FROM tennismen;

USE GestionCommerciale;

CREATE TABLE clients (
	numClient INT NOT NULL,
	nom VARCHAR(128) NOT NULL,
	adresse VARCHAR(128) NOT NULL,
	codePostal VARCHAR(10) NOT NULL,
	VILLE VARCHAR(32) NOT NULL,
	PRIMARY KEY(numClient)
);

CREATE TABLE commandes (
	numCde INT NOT NULL,
	numClient INT NOT NULL,
	montant INT NOT NULL,
	dateCreation VARCHAR(128) NOT NULL,
	PRIMARY KEY(numCde),
);

DELETE FROM clients;
DELETE FROM commandes;
DROP TABLE commandes;
DROP TABLE clients;
