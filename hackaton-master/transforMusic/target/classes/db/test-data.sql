DROP DATABASE IF EXISTS hackaUsers;
CREATE DATABASE hackaUsers;
USE hackaUsers;

DROP TABLE IF EXISTS users;

CREATE TABLE users(
    id INT PRIMARY KEY,
    firstname VARCHAR(255) NOT NULL,
    lastname VARCHAR(255) NOT NULL,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

INSERT INTO users(id, firstname, lastname, username, password, email) VALUES
(1, 'Luís', 'Rodrigues', 'luisRodrigues', 'rodrigues','lmcrjr@gmail.com'),
(2, 'Pedro', 'Fiuza', 'pedroFiuza', 'fiuza','pedrofiuza@gmail.com'),
(3, 'António', 'Rebelo', 'antonioRebelo', 'rebelo','antoniorebelo@gmail.com'),
(4, 'Miguel', 'Raposo', 'miguelRaposo', 'raposo','miguelRaposo@gmail.com'),
(5, 'André', 'Oliveira', 'andreOliveira', 'oliveira','andreOliveira@gmail.com');
