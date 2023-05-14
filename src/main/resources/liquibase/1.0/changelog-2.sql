--liquibase formatted sql

--changeset ali:3

create table  courses (
    id serial primary key ,
    course_name varchar
)