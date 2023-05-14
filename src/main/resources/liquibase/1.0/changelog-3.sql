--liquibase formatted sql

--changeset ali:4

create table contacts(
    id serial primary key ,
    contact_type varchar,
    customer_id bigint,

    foreign key (customer_id) references customers(id)
)