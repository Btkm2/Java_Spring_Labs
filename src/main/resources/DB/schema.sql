CREATE TABLE car(
    ID SERIAL primary key,
    MODEL VARCHAR(50) NOT NULL,
    MILAGE INT NOT NULL,
    CONDITION VARCHAR(20) NOT NULL,
    MANUFACTURER VARCHAR(50) NOT NULL,
    YEAR VARCHAR(4) NOT NULL,
    PRICE INT NOT NULL
);