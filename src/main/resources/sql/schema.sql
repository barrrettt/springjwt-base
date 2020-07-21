/*RESET*/
DROP TABLE IF EXISTS  users;

/*CREATE TABLES .*/ 
CREATE TABLE users( 
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    active BOOLEAN default false,
    roles VARCHAR(200)
);

/* Un usuario admin + 2 users: uno activo y otro no */
-- admin abc123..  https://bcrypt-generator.com/
INSERT INTO users(username, password, active, roles) VALUES
  ('admin','$2y$12$b69LWwDuQ7kARZQy9Hfpne938ArU6WHsZau9CEFnaVGUqX1oz0VBa',true,'ROLE_ADMIN'),
  ('a','$2y$12$b69LWwDuQ7kARZQy9Hfpne938ArU6WHsZau9CEFnaVGUqX1oz0VBa',true,'ROLE_USER'),
  ('b','$2y$12$b69LWwDuQ7kARZQy9Hfpne938ArU6WHsZau9CEFnaVGUqX1oz0VBa',false,'ROLE_USER');
