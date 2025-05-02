-- BASE DE DATOS PARA GUARDAR LAS PARTIDAS

DROP DATABASE videojuego; 
CREATE DATABASE videojuego;
USE videojuego;
DROP TABLE IF EXISTS ganadores;
DROP TABLE IF EXISTS personajes;

CREATE TABLE personajes (
    id_personaje INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    tipo INT NOT NULL,
    nombre VARCHAR(100) NOT NULL, 
    vida DECIMAL(5,2) NOT NULL,
    vidaMaxima DECIMAL(5,2) NOT NULL,
    fuerza DECIMAL(5,2) NOT NULL,
    energia DECIMAL(5,2) NOT NULL,
    nivelExperiencia INT NOT NULL,
    experiencia DECIMAL(5,2) NOT NULL,
    moneda INT NOT NULL,
    curacion INT NOT NULL,
    fortuna INT NOT NULL
);

CREATE TABLE ganadores (
    id_ganador INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_personaje INT NOT NULL,
    FOREIGN KEY (id_personaje) REFERENCES personajes(id_personaje)
);

-- Insertar personajes de prueba
INSERT INTO personajes (tipo, nombre, vida, vidaMaxima, fuerza, energia, nivelExperiencia, experiencia, moneda, curacion, fortuna)
VALUES
(1, 'admin', 900.00, 900.00, 100.00, 90.00, 100, 0.00, 100, 10, 15),
(2, 'Mage1', 80.00, 80.00, 30.00, 50.00, 2, 100.00, 200, 5, 10),
(3, 'Archer1', 90.00, 90.00, 40.00, 40.00, 3, 200.00, 150, 8, 20),
(1, 'Warrior2', 120.00, 120.00, 60.00, 20.00, 1, 0.00, 50, 12, 25),
(2, 'Mage2', 85.00, 85.00, 35.00, 45.00, 4, 250.00, 300, 6, 18);

-- Insertar ganadores de prueba
INSERT INTO ganadores (id_personaje) VALUES (1);

-- querys de prueba
SELECT *
FROM personajes;

SELECT * 
FROM personajes p 
INNER JOIN ganadores g 
ON g.id_personaje = p.id_personaje;

