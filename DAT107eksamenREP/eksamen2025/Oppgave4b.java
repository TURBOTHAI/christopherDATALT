package eksamen2025;

public class Oppgave4b {
	/*
	a) Hvilken av følgende påstander er korrekt?
			1. XML Schema benyttes til å beskrive lovlig oppbygning av JSON dokumenter
			- begrunnelse er at XML benyttes til å validere xml, ikkje json.
			- for json så har vi json schema
			
			2. Følgende kan benyttes til å deklarere et XML dokument:
			<#xml version="1.0" encoding="UTF-8"#>
			-det som er feil her er bruk av hashtag og ikkje spørsmål tegn
			- korrekt måte er: <?xml version="1.0" encoding="UFT-8"?>
			
			3. XML beskriver både struktur og presentasjon
			-nesten rikig, den beskriver struktur og innhold, men ikkje presentasjon
			
			4. Alle alternativer over er korrekte
			- 
			5. Ingen av alternativene over er korrekte
			
			
			
			svar ingen er korrekte
			
			
			
			
			
			
	b) (6% ~ 15 min) Lag et eksempel på et velformet og gyldig XML dokument som referer til (kobles)
			og følger XML Schema dokumentet “menu.xsd” (se vedlegg 4.2).
			Eksemplet skal inneholde minst to forretter, to hovedretter og to desserter.
			En av rettene skal innholde et allergen (f.eks. Gluten).
			
			
			<?xml version ="1.0" encoding = "utf-8"?>
			<menu xmlns=http://eksamen.hvl.no/databaser
				xmlns:xsi=http://www.w3.org/2001/XMLSCHEMA-instance"
				xsi:schemaLocation="http://eksamen.hvl.no/databaser oppg4-1.xsd">
					<starters>
					 <starter name ="hvitloksbro">
						<description> løk brød med ost </description>
						<price> 100.00 </price>
					 </starter>
					 <starter name ="aviolismor">
						<description> avioli med smør </description>
						<price> 23.00 </price>
					 </starter>
					</starters>		
					
					<mainCourses>
					 <mainCourse name ="lasange">
						<description>  pasta med tomat </description>
						<price> 43.00 </price>
						<allergen> gluten </allergen>
					</mainCourse>				
					 <mainCourse name ="spagetti">
						<description>  pasta med tomat </description>
						<price> 44.00 </price>
					   <allergener>
						<allergen> gluten </allergen>
					   </allergner>
					 </mainCourse>
					</mainCourses>
					
					<desserts>
					 <dessert name= "is">
						<description> melk </description>
						<price> 100.00 </price>
					 <dessert name= "sjokoladekake">
						<description> sjokalade og brød</description>
						<price> 200.00 </price>
					</desserts>
	         </menu>
	         
	         
	         
	 
				   
				   
					
						
					
					
					
					
				
				
				
				
				
				
				
					
			
			
			
			
			*/
	
	
	
	
	

/* ka er det som defineres som en velformet og gyldig xml dokumnet
	- den må ha et og bare et rot element
	- alle elementer må ha en start tag og en slutt tag
	- Hvert element ka ha et antall atributter( ikke to attributter med samme navn)
	- kan ha nøstede elementer som i html, men elementer kan ikke overlappe
	
*/
	
	
	
}
