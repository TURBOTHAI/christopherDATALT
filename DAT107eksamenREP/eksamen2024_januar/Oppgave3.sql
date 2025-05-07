

CREATE TABLE Ansatt(
	Ansattnr SERIAL PRIMARY KEY,
	navn varchar(25) NOT NULL,
	campus varchar(25),
	FOREIGN KEY (campus) REFERENCE Campus(navn);
	
)

INSERT INTO Ansatt VALUE ('christopher','hvl');

SELECT A.Ansattnr, A.navnmm A.campus C.telefonnr,
FROM Ansatt
LEFT JOIN Campus C ON A.campus=C.navn;

SELECT A.Ansattnr, A.navnmm A.campus C.telefonnr,
FROM Ansatt
INNER JOIN Campus C ON A.campus=C.navn;

SELECT Campus count(*) AS antall_ansatte
FROM Ansatt 
GROUP BY Campus;

SELECT * FROM Ansatt
ORDER BY navn

create INDEX idx_navn ON Ansatt(navn);




