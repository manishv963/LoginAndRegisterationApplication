create table login_log_info(
SRNO int NOT NULL AUTO_INCREMENT PRIMARY KEY,
LOGINID varchar(100),
loginPassword varchar(100),
LOGINDATE DATETIME ON UPDATE CURRENT_TIMESTAMP );


create table userRegisteration(
SRNO bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
loginId varchar(10) UNIQUE KEY,
loginPassword varchar(100),
fullName varchar(100),
email varchar(100),
mobile varchar(15),
registerationDate  DATETIME ON UPDATE CURRENT_TIMESTAMP  );