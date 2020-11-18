drop database nzway;


create database if not exists nzway character set utf8mb4 collate utf8mb4_unicode_ci;



use nzway;
create table if not exists product (
    id bigint PRIMARY KEY comment 'id',
    name varchar(50) NOT NULL comment '名称',
    avatar_id bigint(50) not null ,
    brand varchar(50) not null ,
    standard varchar(50) not null ,
    price double NOT NULL comment '销售价格',
    company_id bigint(50) not null ,
    distributor_id bigint(50) not null ,
    description varchar(1000) NOT NULL  comment '描述'
);

create table banner(
    id bigint PRIMARY KEY ,
    name varchar(50) not null
);

create table type(
    id bigint primary key ,
    name varchar(50) not null
);

create table banner_type(
    id bigint primary key ,
    bid bigint(50) not null ,
    tid bigint(50) not null
);

create table product_type(
    id bigint primary key ,
    pid bigint(50) not null ,
    tid bigint(50) not null
);

create table distributor(
    id bigint primary key ,
    name varchar(50) not null ,
    address varchar(200) not null ,
    phone varchar(50) not null
);

create table company(
    id bigint primary key ,
    name varchar(50) not null ,
    address varchar(200) not null ,
    phone varchar(50) not null
);

create table pesticide(
    id bigint primary key ,
    pid bigint(50) not null ,
    nid bigint(50) not null ,
    level varchar(50) not null ,
    content varchar(50) not null
);

create table fertilizer(
    id bigint primary key ,
    pid bigint(50) not null ,
    nid bigint(50) not null ,
    type varchar(50) not null ,
    element_type varchar(50) not null ,
    element varchar(50) not null ,
    total_nutrient varchar(50) not null
);

create table number(
    id bigint primary key ,
    register_number varchar(100) not null ,
    production_license_number varchar(100) not null ,
    standard_number varchar(100) not null
);

create table insect(
    id bigint primary key ,
    avatar_id bigint(50) not null ,
    name varchar(50) not null ,
    nick_name varchar(100) ,
    description varchar(500) default '没有任何描述'
);

create table tree(
    id bigint primary key ,
    name varchar(50) not null ,
    nick_name varchar(100) ,
    avatar_id bigint(50) not null ,
    description varchar(500) default '没有任何描述'
);


create table avatar(
    id bigint primary key ,
    url varchar(256) not null
);

create table cure(
    id bigint primary key ,
    pesticide_id bigint(50) not null ,
    insect_id bigint(50) not null
);
