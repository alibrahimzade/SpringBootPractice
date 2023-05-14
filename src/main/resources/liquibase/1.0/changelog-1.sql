--liquibase formatted sql

--changeset ali:2

create table passport (
    id serial primary key ,
    serial_number varchar
)