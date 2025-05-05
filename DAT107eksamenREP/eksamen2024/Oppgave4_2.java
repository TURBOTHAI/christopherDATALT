package eksamen2024;

public class Oppgave4_2 {
	/*
	Når vi snakker om NoSQL databaser så er disse ofte distribuerte systemer, som utgjør et 
	database kluster. Disse databasene bruker ofte teknikker som “Sharding” og “Replikering”.
	
	a) (2,5% ~ 6 min) Forklar kort hva som menes med “Sharding” når vi snakker om
	distribuerte database systemer? Hvilke fordeler gir denne typen partisjonering?
	- "Sharding" er en teknikk innen distribuerte  database systemer hvor datasettet deles  inn i mindre deler kalt "shards" 
	- på denne måten  partisjoneres data over flere datamaskiner eller servere
	- Skalarbarhet: Dette gjør det mulig å håndtere  store  datamengder mer effektiv  og skalere systemet horisontalt(billigere skalering, samt
	størr muligheter til å skalere.
	
	- Bedre ytelse. Spørringer  kan distribueres og prosseseres parallelt på flere noder. Sharding bidrar til å  forbedre ytelse  og tilgjenlighet i store
	distribuerte systemer ved å redursere belatningen  på enkeltkomponeneter. data kan plasseres/lokaliseres i "nærheten" 
	
	
	
	
	
	
	b) (2,5% ~ 6 min) Forklar kort hva som menes med “Replikering”? Hvilke fordeler og
	ulemper gir replikering?
	-  "Replikering  i distribuerte  database løsninger referer til prossesen med å opprettholde identiske kopier av data på flere servere/noder
	
	-fordelen med dette
	økt tilgjenglihet: hvis en server  eller node  mislykkes, kan spørringen og forespørsler bli rutet til en  av de  replikerte kopiene, 
	slik at tjenesten forblir tilgjenlig
	
	Bedre ytelse: Ved å ditribuere belastningen  på flere  kopier  av data, kan replikeringen  redursere flaksehalser og forbedre spørringer 
	ved å tillate parallell spørringsbehandling
	
	Feiltoleranse/ data redundans: Replikering gjør det mulig å gjenopprette data
	fra en av de replikerte kopiene i tilfelle datakorruptering eller feil, og dermed øker
	systemets feiltoleranse / data redundans
	
	Ulemper med replikering inkluderer:
	(2p) Økt kompleksitet. Synkroniseringsproblemer: Komplekst å synkronisere over
	replikaset og dermed holde data kopier konsistente.
	Andre ulemper (som vi godtar):
	(1p) Tar mye diskplass/kost (dobbel/trippel lagring av data)
	(1p) Replikering over geografiske områder (nærhet til data
	
	
	*/
}
