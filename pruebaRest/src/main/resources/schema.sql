
CREATE SEQUENCE SEQ_PERSONA_ID
  START WITH 3
  INCREMENT BY 1; 

CREATE SEQUENCE SEQ_GENERICA
  START WITH 3
  INCREMENT BY 1;


CREATE TABLE tipo_identificacion (
	codigo LONG AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(20),
	fecha_creacion TIMESTAMP,
	usuario_creacion VARCHAR(50),
	fecha_modificacion TIMESTAMP,
	usuario_modificacion VARCHAR(50)
);

CREATE TABLE estado (
	codigo LONG AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(20),
	fecha_creacion TIMESTAMP,
	usuario_creacion VARCHAR(50),
	fecha_modificacion TIMESTAMP,
	usuario_modificacion VARCHAR(50)
);

CREATE TABLE persona (
	codigo LONG AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100) NOT NULL,
	apellido VARCHAR(100) NOT NULL,
	fecha_nacimiento DATE NOT NULL,
	username VARCHAR(20) NOT NULL,
	password VARCHAR(50) NOT NULL,
	identificacion LONG NOT NULL,
	codigo_tipo_identificacion LONG NOT NULL,
	codigo_estado LONG NOT NULL,
	FOREIGN KEY (codigo_tipo_identificacion) REFERENCES tipo_identificacion(codigo),
	FOREIGN KEY (codigo_estado) REFERENCES Estado(codigo)
);
