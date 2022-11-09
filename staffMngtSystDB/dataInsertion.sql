INSERT INTO Employee(empNo,empName,unitNo,street,town,city,depID,basicSAL) VALUES(1,'Thisuni Damsathi', '11','Mihindu Mw','Hannam','Malabe',1,500000.00);

INSERT INTO Department(depNo,depName) VALUES(1,'Fashion Design');

SELECT * FROM Employee;

INSERT INTO fullTimer(empNo) VALUES(1);

INSERT INTO Employee(empNo,empName,unitNo,street,town,city,depID,basicSAL) VALUES(2,'Thulari Thisanja', '11','Mihindu Mw','Hannam','Malabe',1,1000.00);

INSERT INTO partTime(empNo) VALUES(2);

INSERT INTO Manager(empNo) VALUES(1);

UPDATE fullTimer SET basicSal=500000.00; 

UPDATE Employee SET username='ChiefDesignerThisuni', pssWrd='dr0pSome$$';

UPDATE Employee SET username='MissPartTimer', pssWrd='padiWadiKaranna'
WHERE empNo=2;


SELECT * FROM Rates

INSERT INTO Rates(rateType,amt) VALUES('otRate', 1000.00);
INSERT INTO Rates(rateType,amt) VALUES('hourlyRate', 250.00);

SELECT * FROM fullTimer

