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
INSERT INTO EMPLOYEE VALUES (112, 'Mr', 's', '1983-03-23', 3000030);
INSERT INTO EMPLOYEE VALUES (113, 'Mrs', 'rs', '1984-04-24', 4000040);
