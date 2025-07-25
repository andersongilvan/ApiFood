CREATE TABLE tb_foods(

    id SERIAL NOT NULL PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    img_url VARCHAR(300) NOT NULL,
    description VARCHAR(500) NOT NULL,
    price DECIMAL(10, 2) NOT NULL

);