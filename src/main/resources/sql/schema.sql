/*RESET*/
DROP TABLE IF EXISTS  users;

/*CREATE TABLES .*/ 
CREATE TABLE users( 
    id INT AUTO_INCREMENT PRIMARY KEY,

    username VARCHAR(100) NOT NULL,
    pass VARCHAR(100) NOT NULL,

);

-- admin abc123..
INSERT INTO user(username, pass) VALUES
  ('admin','$2y$12$b69LWwDuQ7kARZQy9Hfpne938ArU6WHsZau9CEFnaVGUqX1oz0VBa');
