INSERT into users (username,full_name,email,password,gender,enabled,created_at)
values ("rahul", "Rahul Jain","rahulmjain24@outlook.com","pass123","MALE",true,current_time()),
("shubham", "Shubham Jain","shubhammjain24@outlook.com","pass123","MALE",true,current_time());

INSERT into authorities(username, authority)
values ("rahul","ROLE_ADMIN"),
("shubham","ROLE_USER");