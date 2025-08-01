CREATE TABLE tb_foods(

    id UUID PRIMARY KEY,
    name TEXT NOT NULL,
    img_url TEXT NOT NULL,
    description TEXT NOT NULL,
    price NUMERIC(15, 2) NOT NULL

);