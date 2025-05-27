CREATE TABLE Vuelo (
    id_vuelo INT PRIMARY KEY,
    ds_destino VARCHAR(20)
);

CREATE TABLE Ruta (
    id_ruta INT PRIMARY KEY
);

INSERT INTO Vuelo (id_vuelo, ds_destino) VALUES (1, 'MEX');