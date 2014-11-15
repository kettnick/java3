CREATE TABLE Trabajador (id_trabajador INTEGER PRIMARY KEY Auto_Increment,
                         nombre varchar(120), paterno varchar (120), materno varchar (120));

create table usuario (id_usuario integer primary key auto_increment,
                      nombre varchar(250), edad integer, sueldo float);

create table direccion (id_direccion integer primary key auto_increment, 
                        id_usuario integer, calle varchar (250), cp integer, 
                        colonia varchar(300), estado varchar (200), 
                        constraint foreign key (id_usuario) references usuario (id_usuario)); 



