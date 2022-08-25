
DROP TABLE IF EXISTS SIMDETAILS;
CREATE TABLE SIMDETAILS(
simId NUMBER(10) PRIMARY KEY,
serviceNumber VARCHAR(10) NOT NULL,
simNumber VARCHAR(13) NOT NULL,
simStatus VARCHAR(20) NOT NULL
);


DROP TABLE IF EXISTS SIMOFFERS;
CREATE TABLE SIMOFFERS(
offerId NUMBER(10) PRIMARY KEY,
callQty NUMBER(10) NOT NULL,
cost NUMBER(10) NOT NULL,
dataQty NUMBER(10) NOT NULL,
duration NUMBER(10) NOT NULL,
offerName VARCHAR(100) NOT NULL,
simId NUMBER(10)
);


DROP TABLE IF EXISTS CUSTOMERADDRESS;
CREATE TABLE CUSTOMERADDRESS(
addressId NUMBER(10) PRIMARY KEY ,
address VARCHAR(100) NOT NULL,
city VARCHAR(100) NOT NULL,
pincode VARCHAR(6) NOT NULL,
state VARCHAR(100) NOT NULL
);


DROP TABLE IF EXISTS CUSTOMER;
CREATE TABLE CUSTOMER(
uniqueIdNumber VARCHAR(20) PRIMARY KEY,
dateOfBirth DATE NOT NULL,
emailAddress VARCHAR(100) NOT NULL,
firstName VARCHAR(100) NOT NULL,
lastName VARCHAR(100) NOT NULL,
idtype VARCHAR(100) NOT NULL,
customerAddress_addressId NUMBER(10) NOT NULL,
simId NUMBER(10) NOT NULL,
state VARCHAR(100) NOT NULL
);


DROP TABLE IF EXISTS CUSTOMERIDENTITY;
CREATE TABLE CUSTOMERIDENTITY(
uniqueIdNumber VARCHAR(20) PRIMARY KEY,
dateOfBirth DATE NOT NULL,
firstName VARCHAR(100) NOT NULL,
lastName VARCHAR(100) NOT NULL,
emailAddress VARCHAR(100) NOT NULL,
state VARCHAR(100) NOT NULL
);
