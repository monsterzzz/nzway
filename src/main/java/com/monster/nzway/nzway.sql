create database if not exists nzway character set utf8mb4 collate utf8mb4_unicode_ci;

# drop database nzway;

use nzway;
create table if not exists product (
    id Bigint(20) PRIMARY KEY comment 'id',
    name varchar(50) NOT NULL comment '名称',
    avatar varchar(256) NOT NULL comment '图片地址',
    price double NOT NULL comment '销售价格',
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

create table field_key(
    id int(10) primary key ,
    name varchar(20) not null
);

create table field_value(
    id int(10) primary key ,
    value varchar(1000) not null
);

create table type_field(
    id int(10) primary key ,
    tid int(10) not null ,
    kid int(10) not null
);

create table field(
    id int(10) primary key ,
    pid int(10) not null ,
    kid int(10) not null ,
    vid int(10) not null
)