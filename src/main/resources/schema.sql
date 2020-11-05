create database practica6

create table employees
(
   id integer not null,
   first_name varchar(30) not null,
   last_name varchar(60) not null,
   email_address varchar(30) not null,
   primary key(id)
);

CREATE TABLE `practica6`.`inventario` (
`id` INT NOT NULL AUTO_INCREMENT ,
`titulo` VARCHAR(100) NOT NULL ,
`descripcion` VARCHAR(200) NOT NULL ,
`cantidad` INT NOT NULL ,
`costo` INT NOT NULL ,
`fecha_creacion` VARCHAR(10) NOT NULL ,
PRIMARY KEY (`id`)
) ENGINE = InnoDB;

CREATE TABLE `practica6`.`factura` (
 `id` INT NULL ,
 `idEmployee` INT NOT NULL ,
 `fecha_creacion` VARCHAR(10) NOT NULL,
 `total` int NOT NULL,
 PRIMARY KEY (`id`)
 ) ENGINE = InnoDB;

 CREATE TABLE `practica6`.`detallefac` (
  `id` INT NULL ,
  `idFactura` INT NOT NULL ,
  `idProducto` INT NOT NULL ,
  `cantidad` INT NOT NULL ,
  `precio` INT NOT NULL ,
  PRIMARY KEY (`id`)) ENGINE = InnoDB;