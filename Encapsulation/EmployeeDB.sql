/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  User
 * Created: 2019/6/21
 */
DROP TABLE EMPLOYEE;

CREATE TABLE EMPLOYEE(
        ID INTEGER NOT NULL,
        FIRSTNAME VARCHAR(40) NOT NULL,
        LASTNAME VARCHAR(40) NOT NULL,
        BIRTHDATE DATE,
        SALARY REAL,
        PRIMARY KEY(10),
);

INSERT INTO EMPLOYEE VALUE (110, 'Tony', 'Hammer', '1991-02-23', 10000.15);
INSERT INTO EMPLOYEE VALUE (111, 'Andy', 'Liu', '1977-05-1', 1200000.15);
INSERT INTO EMPLOYEE VALUE (112, 'JOHN', 'Mr', '1909-09-1', 6600000.66);