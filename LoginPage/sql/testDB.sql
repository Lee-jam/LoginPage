drop table member;

create table member(
 mem_id varchar2(16) PRIMARY KEY,
 mem_pw varchar2(16) not null,
 mem_name varchar2(10) not null,
 mem_hp varchar2(16) not null,
 mem_email varchar2(255) not null);