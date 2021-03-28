CREATE DATABASE startjava;

\c startjava

CREATE TABLE Jaegers (
	id SERIAL PRIMARY KEY,
	modelName TEXT, 
	mark TEXT,
	height INTEGER,
	weight INTEGER,
	status TEXT,
	origin TEXT,
	launch INTEGER,
	kaijuKill INTEGER
);
