

CREATE TABLE Articulo (
	id_articulo int,
	nombre varchar(50),
	precio numeric,
 primary key(id_articulo)		
);

CREATE TABLE Bebida (
	id_bebida int,
	etiqueta varchar(50),
	existencias numeric,
	id_articulo int,
 primary key(id_bebida)		
);
alter table Bebida add constraint id_articulo foreign key (id_articulo) references Articulo(id_articulo);

CREATE TABLE Bocata (
	id_bocata int,
	etiqueta varchar(50),
	id_articulo int,
 primary key(id_bocata)		
);
alter table Bocata add constraint id_articulo foreign key (id_articulo) references Articulo(id_articulo);

CREATE TABLE Montado (
	id_montado int,
	etiqueta varchar(50),
	id_articulo int,
 primary key(id_montado)		
);
alter table Montado add constraint id_articulo foreign key (id_articulo) references Articulo(id_articulo);

CREATE TABLE Otro (
	id_otro int,
	etiqueta varchar(50),
	id_articulo int,
 primary key(id_otro)		
);
alter table Otro add constraint id_articulo foreign key (id_articulo) references Articulo(id_articulo);

CREATE TABLE Mojito (
	id_mojito int,
	etiqueta varchar(50),
	id_articulo int,
 primary key(id_mojito)		
);
alter table Mojito add constraint id_articulo foreign key (id_articulo) references Articulo(id_articulo);



CREATE TABLE Ticket (
	id_ticket int,
	fecha date,
	importe numeric,
 primary key(id_ticket)		
);

CREATE TABLE LineaTicket (
	id_linea int,
	nombre varchar(50),
	precio numeric,
        id_articulo int,
	id_ticket int,
 primary key(id_linea)		
);
alter table LineaTicket add constraint id_articulo foreign key (id_articulo) references Articulo(id_articulo);
alter table LineaTicket add constraint id_ticket foreign key (id_ticket) references Ticket(id_ticket);


CREATE TABLE Extraccion (
	id_extraccion int,
	fecha_extraccion date,
	c200 numeric,
	c100 numeric,
	c50 numeric,
	c20 numeric,
	c10 numeric,
	c5 numeric,
	c2 numeric,
	c1 numeric,
	c05 numeric,
	c02 numeric,
	c01 numeric,
	c005 numeric,
 primary key(id_extraccion)		
);