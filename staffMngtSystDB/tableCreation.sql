

CREATE TABLE Department(
	depNo INT PRIMARY KEY,
	depName VARCHAR(30),
);


CREATE TABLE Employee(
	empNo INT PRIMARY KEY,
	empName VARCHAR(50),
	unitNo VARCHAR(5),
	street VARCHAR(20),
	town VARCHAR(10),
	city VARCHAR(10),
	depID INT,

	CONSTRAINT fk_depID FOREIGN KEY(depID) 
	REFERENCES Department(depNo)


);

CREATE TABLE ContactEmployee(
	empNo INT,
	contactNo VARCHAR(10),

	CONSTRAINT pk_contactEmp PRIMARY KEY(empNo,contactNo),

	CONSTRAINT fk_empNo FOREIGN KEY(empNo)
	REFERENCES Employee(empNo)


	);

CREATE TABLE fullTimer(
	empNo INT

	FOREIGN KEY(empNo) REFERENCES Employee(empNo)
);

CREATE TABLE partTime(
	empNo INT

	FOREIGN KEY(empNo) REFERENCES Employee(empNo)
);

CREATE TABLE fullTimeWork(
	empNo INT,
	thisMonth VARCHAR(10),
	workedDays INT,

	FOREIGN KEY(empNo) REFERENCES Employee(empNo)
);

CREATE TABLE partTimeWork(
	empNo INT,
	thisMonth VARCHAR(10),
	workedHrs INT

	FOREIGN KEY(empNo) REFERENCES Employee(empNo)
);

CREATE TABLE Manager(
	empNo INT

	FOREIGN KEY(empNo) REFERENCES Employee(empNo)
);

ALTER TABLE fullTimer ADD basicSAL REAL;

CREATE TABLE Salary(
	paySlipID INT PRIMARY KEY,
	dateCalculated DATE,
	empNo INT,

	FOREIGN KEY(empNo) REFERENCES Employee(empNo)
);

CREATE TABLE Rates(
	rateType VARCHAR(25) PRIMARY KEY,
	amt REAL

);

ALTER TABLE Employee DROP COLUMN basicSal;

ALTER TABLE Employee ADD username VARCHAR(40), pssWrd VARCHAR(60);