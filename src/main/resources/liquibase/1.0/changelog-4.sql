--liquibase formatted sql

--changeset ali:5

create table customer_course(
    customer_id integer,
    course_id integer,

    foreign key (customer_id) references customers(id),
    foreign key (course_id) references courses(id)
)