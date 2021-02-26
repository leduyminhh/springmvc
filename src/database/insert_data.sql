use springmvc;

insert into role(id,code,name) values(1,'ADMIN','Quản trị');
insert into role(id,code,name) values(2,'USER','Người dùng');

insert into users(id,username,password,fullname,status)
values(100001,'admin','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','Lê Duy Minh',1);
insert into users(username,password,fullname,status)
values(100002,'nguyenvana','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','Nguyễn Văn A',1);
insert into users(username,password,fullname,status)
values(100003,'nguyenvanb','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','Nguyễn Văn B',1);

INSERT INTO user_role(user_id,role_id) VALUES (100001,1);
INSERT INTO user_role(user_id,role_id) VALUES (100002,2);
INSERT INTO user_role(user_id,role_id) VALUES (100003,2);