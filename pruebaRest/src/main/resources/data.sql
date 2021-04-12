INSERT INTO tipo_identificacion (
		nombre, fecha_creacion, usuario_creacion, fecha_modificacion, 
		usuario_modificacion) VALUES 
		('Cédula', '2021-04-09', 'jcfd', null, null);
	
INSERT INTO estado (
		nombre, fecha_creacion, usuario_creacion, fecha_modificacion, 
		usuario_modificacion) VALUES 
		('Activo', '2021-04-09', 'jcfd', null, null),
		('Inactivo', '2021-04-09', 'jcfd', null, null);

INSERT INTO persona (
	nombre, apellido, fecha_nacimiento, username, password, identificacion, 
	codigo_tipo_identificacion, codigo_estado) VALUES
  ('Julio', 'Ferreira', '1989-08-31', 'jcfd', '123456', 1144130775, 
	(SELECT codigo FROM tipo_identificacion WHERE nombre LIKE 'Cédula'), 
	(SELECT codigo FROM estado WHERE nombre LIKE 'Activo')
  ),
  ('César', 'Dávalos', '1989-08-31', 'cosmo', '987654', 1144130779, 
	(SELECT codigo FROM tipo_identificacion WHERE nombre LIKE 'Cédula'), 
	(SELECT codigo FROM estado WHERE nombre LIKE 'Activo')
  );