CREATE TABLE Ruta (
    id_ruta INT PRIMARY KEY,
    ds_descripcion VARCHAR(200)
);

CREATE TABLE Vuelo (
    id_vuelo INT PRIMARY KEY,
    ds_destino VARCHAR(20),
    id_ruta INT,
    CONSTRAINT fk_ruta
        FOREIGN KEY (id_ruta)
        REFERENCES Ruta (id_ruta)
);

INSERT INTO Ruta (id_ruta, ds_descripcion) VALUES (1, 'Ruta MEX-USA');
INSERT INTO Ruta (id_ruta, ds_descripcion) VALUES (2, 'Ruta USA-ARG');
INSERT INTO Ruta (id_ruta, ds_descripcion) VALUES (3, 'RUTA USA-MEX-ARG');

INSERT INTO Vuelo (id_vuelo, ds_destino, id_ruta) VALUES (1, 'MEX', 1);
INSERT INTO Vuelo (id_vuelo, ds_destino, id_ruta) VALUES (2, 'USA', 2);
INSERT INTO Vuelo (id_vuelo, ds_destino, id_ruta) VALUES (3, 'ARG', 3);