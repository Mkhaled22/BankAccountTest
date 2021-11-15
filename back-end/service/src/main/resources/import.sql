insert into CLIENT (id,name) values ('1','steve.jobs');
insert into CLIENT (id,name) values ('2','elon.musk');
insert into CLIENT (id,name) values ('3','jeff.bezos');

insert into ACCOUNT (code, balance, owner_id) values ('14451', 100, (select id from CLIENT where name = 'steve.jobs'));
insert into ACCOUNT (code, balance, owner_id) values ('14452', 150, (select id from CLIENT where name = 'steve.jobs'));
insert into ACCOUNT (code, balance, owner_id) values ('14453', 350, (select id from CLIENT where name = 'elon.musk'));
insert into ACCOUNT (code, balance, owner_id) values ('14454', 250, (select id from CLIENT where name = 'jeff.bezos'));