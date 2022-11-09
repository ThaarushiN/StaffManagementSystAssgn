CREATE PROCEDURE userValidation(@usern VARCHAR(40), @passw VARCHAR(60), @empID INT OUT)
AS
BEGIN

	IF(EXISTS(SELECT * FROM Employee WHERE username=@usern AND pssWrd=@passw))
		BEGIN
			SELECT @empID=empNo
			FROM Employee
			WHERE username=@usern AND pssWrd=@passw

			RETURN @empID
		END

	ELSE
		RETURN NULL
END



DECLARE @emp INT

EXEC @emp= userValidation 'ChiefDesignerThisuni','dr0pSome$$'

PRINT @emp

DROP PROCEDURE userValidation






	