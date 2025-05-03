CREATE TABLE Kunde(
	
	kunde_id SERIAL PRIMARY KEY,
	navn VARCHAR(25) NOT NULL,
	epost VARCHAR(50) NULL -- kan være null
	
	
	
	
);
/* her opprettes det ingen fremmeds nøkler, det vil vært mest realistisk å ta hoyde for at en kunde skal ha navn, men 
man kan forvente at det er ikke alle som har en epost derfor blir den satt til null*/



INSERT INTO Kunde (navn,epost) VALUES ('cscs','sas');
/* slipper å ta med kunde_id pga vi bruker serial er en autonummerering av kunde_id. 
Verdier når en value blir insatt eller er insatt fra før av
*/

ALTER TABLE Kunde ADD column adresse VARCHAR(50) NULL;

/* legger bare til en kunde kolonne adresse som tilallet null viss ikkje du har et hjem eller er hjemløs*/

CREATE INDEX epost_index ON Kude(epost);
/* her valgte eg å gi epost en index, kunne gjort det med de andre, men valgte navn*/


SELECT * FROM Ordre ORDER BY kunde_id desc;
/* Velger den relasjonen som skal bli tatt i bruk, her er det Ordre som vi skal ta utgangspunktet i, 
også bruker vi ORDER BY som velger ka rekke føgle til skal være i, 
deretter så velger vi ka kolonne vi har lyst å endre rekke følge på. 
Vi velger kunde_id og bruker desc som er en descending rekke følge eks(9-8-7-6..)
Standart sortering er stigende rekkefølge*/


SELECT * FROM Ordre,kunde 
WHERE Ordre.kunde_ id = Kunde.kunde_id
ORDER BY Ordre.kunde_id desc;



















































a) Create table kunde(
kunde_id serial primary key,
navn varchar(50) not null,
epost varchar(50) null
);
Denne tabellen har ingen fremmednøkler, så det skal ikke være bruk av on
update/delete. Trolig vil det være mest naturlig å kreve at kunde har navn (not null),
mens man kanskje bør ta høyde for at det kan være kuner som ikke har epost. Det er
kom for å bruke andre valg av datatyper og lignende, men de bør være “fornuftige”.
b) Insert into kunde (navn, epost) values (‘Kari Nordmann’, ‘kari@nordmann.no’);
Siden vi har valgt autonummerering av kunde_id, bør vi ikke angi kundenummer har
(dersom man brukte int eller char må man selvsagt det). Vi angir derfor de kolonnene
vi har behov for å sette, og tilhørende verdier.
c) Alter table kunde add column epost varchar(50) null;
Her var det i oppgaveteksten egentlig tenkt å bruke telefonnummer, men det ble ved
en feil brukt epost istedenfor, selv om tabellen allerede har denne kolonnen. Det er
selvsagt beklagelig, men vi håper at dette ikke har medført problemer. Som tidligere
nevnt, så er det trolig mest fornuftig å tillate null-verdier her (men annet kan
argumenteres for).
d) Create index epost_index on kunde(epost);
Her har vi valgt kolonnen epost i tabellen Kunde, men kunne også vært en annen
kolonne.
e) Select *
from ordre
order by kunde_id desc;
Dette var egentlig ment å være en veldig enkel spørring, som bare involverer en tabell.
Standard sortering er stigende, så man må legge til desc.
f) Select *
from ordre, kunde
where ordre.kunde_id=kunde.kunde_id
order by order.kunde_id desc;
Her har vi utvidet forrige spørring med en enkel likekobling for å få med info om
kunden. Bruk av inner join, left outer join eller right outer join blir også generelt sett
akseptert.
g) ordre ⋈ordre.kunde_idr=kunde.kunde_idkunde
Det er rom for å bruke ulike tegn og notasjon for å få frem dette, men det bør i all
hovedsak minne om dette.
h) Select kunde.*, count(ordre.kunde_id)
from kunde inner join ordre on kunde.kunde_id=ordre.kunde_id
group by kunde.kunde_id;
11 / 21
Har har vi brukt en inner join for å koble sammen tabellene. Siden oppgaven ikke
setter noen spesielle krav til koblingen, kunne man også brukt en likekobling eller en
varient av left/right outer join (men ikke full outer joun) dersom de blir brukt riktg. Det
er viktig at count(...) og group by blir brukt riktig.
i) Select kunde.*, count(ordre.kunde_id)
from kunde left outer join ordre on kunde.kunde_id=ordre.kunde_id
group by kunde.kunde_id;
Her skal man først vurdere om svaret ditt på forrige oppgave vil ta med kunder som
ikke har noen ordrer. Dersom man i forrige oppgave brukte en inner join eller
likekobling, så vil de ikke det, siden kunde_id fra kunde ikke kan matches med noen
kunde_id i ordre. Da må man i dette tilfelle skrive om til en left outer join. Dersom
man i forrige oppgave brukte en likekobling eller inner join, så må man bruke en left
outer join her (eventuelt right outer join hvis rekkefølgen på tabellene var omvendt).
j) En rad i tabllen Kunde består av serial (integer: 4 byte + navn: 50*2 byte (antar 2 byte
per tegn for unicode) + epost: 50+*2 byte = 104 byte. En rad i tabellen Ordre beatår av
ordre_id: serial (integer) 4 byte + kunde_id: integer 4 bye = 8 byte. Totalt får vi da:
104*100 + 8*1000 = 10400 + 8000 = 18400 byte = 18,4 kB. Disse beregningene
avhenger selvsagt av hva man valgte for datatyper i disse tabellene





















Insert into kunde (navn, epost) values (‘Kari Nordmann’, ‘kari@nordmann.no’);