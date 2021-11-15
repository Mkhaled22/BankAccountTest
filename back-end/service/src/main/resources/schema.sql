drop table if exists CLIENT;
create table CLIENT
(
    ID VARCHAR2 not null,
    NAME VARCHAR2
);

create unique index CLIENT_ID_UINDEX
    on CLIENT (ID);

alter table CLIENT
    add constraint CLIENT_PK
        primary key (ID);

drop table if exists ACCOUNT;
create table ACCOUNT
(
    code varchar2 not null,
    balance number,
    owner_id VARCHAR2,
    constraint "client___FK"
        foreign key (owner_id) references CLIENT (ID)
);

create unique index ACCOUNT_CODE_UINDEX
    on ACCOUNT (code);

alter table ACCOUNT
    add constraint ACCOUNT_PK
        primary key (code);

