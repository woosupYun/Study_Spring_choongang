-- 각각
create table A(
	id bigint,
	name varchar(50)
);

create table B(
	id bigint,
	b1
	b2
);

create table C(
	id bigint,
	C1
	C2
);

create table D(
	c1
	c2
	D1
	D2
);

create table E(
	c1
	c2
	E1
	E2
);

-- bottom
create table B(
	id bigint,
	name varchar(50),
	b1
	b2
);

create table D(
	id bigint,
	name varchar(50),
	c1
	c2
	d1
	d2
);

create table E(
	id bigint,
	name varchar(50),
	c1
	c2
	e1
	e2
);

-- top
create table A(
	id bigint,
	name varchar(50),
	descrimi
	b1
	b2
	c1
	c2
	d1
	d2
	e1
	e2
); 
        	유지보수성		성능
each 			높다		낮다

botom			중간		중간

top				낮다		높다