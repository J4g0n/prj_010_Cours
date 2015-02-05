-- Se positionner sur la bd voulue
USE bdChanteursSS;
GO

INSERT INTO chanteurs (nom, prenom, date) 
VALUES ('Aznavour', 'Charles', 1945);
GO

INSERT INTO chanteurs (nom, prenom, date) 
VALUES ('Roussos', 'Demis', 1930);
GO

INSERT INTO chanteurs (nom, prenom, date) 
VALUES ('Goya', 'Chantal', 1910);
GO

INSERT INTO chanteurs (nom, prenom, date) 
VALUES ('Sardou', 'Michel', 1955);
GO

INSERT INTO chanteurs (nom, prenom, date) 
VALUES ('Lama', 'Serge', 1935);
GO

SELECT * FROM chanteurs;
GO