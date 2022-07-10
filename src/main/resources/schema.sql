CREATE TABLE users (
    user_id int AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NUll UNIQUE,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NUll,
    gender VARCHAR(50) NOT NULL,
    enabled boolean not null DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE authorities (
    id int AUTO_INCREMENT PRIMARY KEY,
    username varchar(100) not null,
    authority varchar(100) not null,
    constraint fk_authorities_users foreign key(username) references users(username)
);

create unique index ix_auth_username on authorities (username,authority);