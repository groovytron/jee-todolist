USE todolist;

CREATE TABLE users (
  id int(11) NOT NULL AUTO_INCREMENT,
  login_name varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  password varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY users_login_name_uk (login_name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Table of users';
 
CREATE TABLE groups (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY groups_name_uk (name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Table of user groups';
 
CREATE TABLE users_groups (
  login_name varchar(50) NOT NULL,
  group_name varchar(50) NOT NULL,
  UNIQUE KEY users_groups_uk (login_name,group_name),
  KEY users_groups_group_name_fk (group_name),
  CONSTRAINT users_groups_login_name_fk FOREIGN KEY (login_name) REFERENCES users (login_name),
  CONSTRAINT users_groups_group_name_fk FOREIGN KEY (group_name) REFERENCES groups (name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Table of groups to which the users belong';

/* Rows of the table users */
INSERT INTO users (login_name, password) VALUES ('julien', MD5('secret'));
INSERT INTO users (login_name, password) VALUES ('axel', MD5('secret'));
INSERT INTO users (login_name, password) VALUES ('julia', MD5('secret'));

/* Rows of the table groups */
INSERT INTO groups (name) VALUES ('users');
INSERT INTO groups (name) VALUES ('admins');

/* Rows of the table user_groups */
INSERT INTO users_groups (login_name, group_name) VALUES ('julien','users');
INSERT INTO users_groups (login_name, group_name) VALUES ('axel','admins');
INSERT INTO users_groups (login_name, group_name) VALUES ('julia','users');
