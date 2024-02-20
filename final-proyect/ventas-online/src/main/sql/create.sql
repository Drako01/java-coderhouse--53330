CREATE DATABASE ventas;

CREATE TABLE ventas.cliente (
	clienteid int NOT NULL AUTO_INCREMENT,
    dni int NOT NULL,
    nombre varchar(255) NOT NULL,
    apellido varchar(255),
    PRIMARY KEY (clienteid)
);

CREATE TABLE ventas.producto (
	productoid int NOT NULL AUTO_INCREMENT,
    codigo int NOT NULL,
    descripcion varchar(255) NOT NULL,
    cantidad int,
    precio FLOAT(5, 2),
    PRIMARY KEY (productoid)
);

CREATE TABLE ventas.comprobante (
    comprobanteid int NOT NULL AUTO_INCREMENT,
    fecha datetime,
    cantidad int,
    total FLOAT(5, 2),
    clienteid int,
    PRIMARY KEY (comprobanteid),
    CONSTRAINT FK_cliente FOREIGN KEY (clienteid)
    REFERENCES cliente(clienteid)
);

CREATE TABLE ventas.linea (
    lineaid int NOT NULL AUTO_INCREMENT,
    descripcion varchar(255) NOT NULL,
    cantidad int,
    precio FLOAT(5, 2),
    comprobanteid int NOT NULL,
    productoid int NOT NULL,
    PRIMARY KEY (lineaid),
    CONSTRAINT FK_comprobante FOREIGN KEY (comprobanteid)
    REFERENCES comprobante(comprobanteid),
    CONSTRAINT FK_producto FOREIGN KEY (productoid)
    REFERENCES producto(productoid)
);