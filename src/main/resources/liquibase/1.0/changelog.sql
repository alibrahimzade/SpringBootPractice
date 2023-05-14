--liquibase formatted sql

--changeset ali:1

create table customers(
    id serial primary key ,
    name varchar,
    age integer,
    passport_id integer,

    foreign key (passport_id) references passport(id)
)