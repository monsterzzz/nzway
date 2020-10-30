create database if not exists nzway character set utf8mb4 collate utf8mb4_unicode_ci;

# drop database nzway;

use nzway;
create table if not exists product (
    id Bigint(20) PRIMARY KEY comment 'id',
    name varchar(50) NOT NULL comment '名称',
    avatar_id int(10) not null ,
    brand varchar(50) not null ,
    save_place varchar(50) not null ,
    standard varchar(50) not null ,
    price double NOT NULL comment '销售价格',
    company_id int(10) not null ,
    distributor_id int(10) not null ,
    description varchar(1000) NOT NULL  comment '描述'
);

create table banner(
    id int(10) PRIMARY KEY ,
    name varchar(50) not null
);

create table type(
    id int(10) primary key ,
    name varchar(50) not null
);

create table banner_type(
    id int(10) primary key ,
    bid int(10) not null ,
    tid int(10) not null
);

create table product_type(
    id int(10) primary key ,
    pid int(10) not null ,
    tid int(10) not null
);

create table distributor(
    id int(10) primary key ,
    name varchar(50) not null ,
    address varchar(200) not null ,
    phone varchar(50) not null
);

create table company(
    id int(10) primary key ,
    name varchar(50) not null ,
    address varchar(200) not null ,
    phone varchar(50) not null
);

create table pesticide(
    id int(10) primary key ,
    pid int(10) not null ,
    nid int(10) not null ,
    level varchar(50) not null ,
    content varchar(50) not null
);

create table fertilizer(
    id int(10) primary key ,
    pid int(10) not null ,
    nid int(10) not null ,
    type varchar(50) not null ,
    element_type varchar(50) not null ,
    element varchar(50) not null ,
    total_nutrient varchar(50) not null
);

create table number(
    id int(10) primary key ,
    register_number varchar(100) not null ,
    production_license_number varchar(100) not null ,
    standard_number varchar(100) not null
);

create table insect(
    id int(10) primary key ,
    avatar_id int(10) not null ,
    name varchar(50) not null ,
    nick_name varchar(100) ,
    description varchar(500) default '没有任何描述'
);

create table tree(
    id int(10) primary key ,
    name varchar(50) not null ,
    nick_name varchar(100) ,
    avatar_id int(10) not null ,
    description varchar(500) default '没有任何描述'
);


create table avatar(
    id int(10) primary key ,
    url varchar(256) not null
);

create table cure(
    id int(10) primary key ,
    pesticide_id int(10) not null ,
    insect_id int(10) not null
);
