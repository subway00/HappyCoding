/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  User
 * Created: 2019/6/21
 */
CREATE TABLE EMPLOYEE (
        ID INTEGER NOT NULL,
        FIRSTNAME VARCHAR(40) NOT NULL,
        LASTNAME VARCHAR(40) NOT NULL,
        BIRTHDATE DATE,
        SALARY REAL,
        PRIMARY KEY(ID)
);

INSERT INTO EMPLOYEE VALUES (110, 'John', 'Lin', '1965-03-31', 10000.10);
INSERT INTO EMPLOYEE VALUES (111, 'Mary', 'Won', '1986-08-26', 2000020);
