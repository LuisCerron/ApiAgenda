INSERT INTO usuario(id,nombre,correo,contraseña) VALUES(1,'Luis','prueba1@gmail.com','123456');
INSERT INTO usuario(id,nombre,correo,contraseña) VALUES(2,'Antonio','prueba2@gmail.com','112233');


INSERT INTO contacto(id,nombre,telefono,direccion,id_usuario) VALUES(1, 'Contacto232','945454658','Jr.Cacere',1);
INSERT INTO contacto(id,nombre,telefono,direccion,id_usuario) VALUES(2, 'Contacto112','999945658','Av.Castilla',2);
INSERT INTO contacto(id,nombre,telefono,direccion,id_usuario) VALUES(3, 'Contacto32','912454658','Psje.Mercurio',2);
INSERT INTO contacto(id,nombre,telefono,direccion,id_usuario) VALUES(4, 'Contacto82','912354658','Av.Miguel Grau',1);

INSERT INTO cita(id,recordatorio,fecha,id_usuario,id_contacto) VALUES(1,'Cita1','2024-10-24',2,3);
INSERT INTO cita(id,recordatorio,fecha,id_usuario,id_contacto) VALUES(2,'Cita2','2024-10-30',1,4);

INSERT INTO tarea(id,titulo,descripcion,fecha,id_usuario) VALUES(1,'Avance 1','Terminar los diseños de pagina','2024-09-24',1);
INSERT INTO tarea(id,titulo,descripcion,fecha,id_usuario) VALUES(2,'Avance 1','Terminar la base de datos','2024-09-18',2);
