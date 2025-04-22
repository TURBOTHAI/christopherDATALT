package uke15.oppgave2;

public class KjedetBS_Tre<T extends Comparable<? super T>> extends BinaerTre<T> implements SoeketreADT<T> {
	KjedetBS_Tre() {
		super();
	}

	KjedetBS_Tre(T rotElement) {
		super(rotElement, null, null);
	}

	@Override
	public void setTre(T rotData) {
		// Vi ønskjer ikkje at denne metoden skal være tilgjengeleg
		// Ville i så fall være mulig å øydelegge det binære søketreet
		throw new UnsupportedOperationException();
	}

	@Override
	public void setTre(T rotData, BinaerTre<T> venstre, BinaerTre<T> hogre) {
		// Vi ønskjer ikkje at denne metoden skal være tilgjengeleg
		// Ville i så fall være mulig å øydelegge det binære søketreet
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean inneholder(T element) {
		return finn(element) != null;
	}

	@Override
	public T finn(T element) {
		return finn(element, getRot());
	}

	private T finn(T element, BinaerTreNode<T> p) {

		T svar = null;

		// basis: p == null -> tomt tre, element finst ikkje

		if (p != null) {
			int sml = element.compareTo(p.getElement());
			
			if (sml == 0) { // basis, funne elementet
				svar = p.getElement();
			} else if (sml < 0) {
				svar = finn(element, p.getVenstre());
			} else {
				svar = finn(element, p.getHogre());
			}
		}

		return svar;
	}
	
	public boolean erBalansert(BinaerTreNode<T> p) {
		
		// basis p == null -> tomt tre, element finst ikkje
		if(p==null) {
			return true;// et tomt tre er et balansert tre
		}
		// denne metoden kommer ikkje til å fungerer skikkelig før vi har en metode til som opptaterer HogdeU for hver node/undertree som går ned over
		
	
	    int hogdeUv;
	    
	    if(p.getVenstre()!=null) {
	    	hogdeUv= p.getVenstre().getHogdeU();
	    	
	    } else {
	    	hogdeUv=-1;
	    }
	    
	    int hogdeUh;
	    if(p.getHogre()!=null) {
	    	hogdeUh = p. getHogre().getHogdeU();
	    } else {
	    	hogdeUh=-1;
	    	
	    }
	    
	    if (Math.abs(hogdeUv - hogdeUh) > 1) {
	        return false;
	    }
	    
	    return erBalansert(p.getVenstre()) && erBalansert(p.getHogre());
		
	}

	@Override
	public T leggTil(T nyttElement) {
		if (getRot() == null){
			setRot(new BinaerTreNode<T>(nyttElement));
			return null;
		} else {
		return leggTil(nyttElement, getRot());
		}
	}

	private T leggTil(T nyttElement, BinaerTreNode<T> p) {
		// Veit at p != null
		
		T resultat = null;
		int sml = nyttElement.compareTo(p.getElement());
		
		if (sml == 0) {
			resultat = p.getElement();
			p.setElement(nyttElement);
		} else if (sml < 0) {
			if (p.getVenstre() == null) { // har funne rett plass
				BinaerTreNode<T> ny = new BinaerTreNode<>(nyttElement);
				p.setVenstre(ny);
			} else {
				resultat = leggTil(nyttElement, p.getVenstre());
			}
		} else {
			if (p.getHogre() == null) { // har funne rett plass
				BinaerTreNode<T> ny = new BinaerTreNode<>(nyttElement);
				p.setHogre(ny);
			} else {
				resultat = leggTil(nyttElement, p.getHogre());
			}
		}
		return resultat;
	}
	@Override
	public T fjern(T element) {
		/*
		 * Det er ikkje pensum å kunne skrive kode for denne.
		 */

		throw new UnsupportedOperationException();
	}
	

	public void skrivVerdier(T nedre, T ovre) {
		skrivVerdierRek(getRot(),nedre,ovre);
		
	}
	
	private void skrivVerdierRek(BinaerTreNode<T> t, T min, T maks) {
		if(t!=null) {
			if(t.getElement().compareTo(min)>0) {
				skrivVerdierRek(t.getVenstre(),min,maks);
			}
			
			
			if(t.getElement().compareTo(min)>= 0 && t.getElement().compareTo(maks)<=0){
				System.out.print(t.getElement()+ " ");
				
				
			}
			
			if((t.getElement().compareTo(maks)<0)) {
			skrivVerdierRek(t.getHogre(),min,maks);
			}
			
			}
	}
	
	
	private void skrivVerdierRek2(BinaerTreNode<T> t, T min, T maks) {
		if(t!=null) {
			skrivVerdierRek2(t.getVenstre(),min,maks);
			if((t.getElement().compareTo(min)>=0) && (t.getElement().compareTo(maks)<=0)) {
				System.out.print(t.getElement()+ " ");
			}
			skrivVerdierRek2(t.getHogre(),min,maks);
			
			}
	}
	
	public void skrivVerdier2(T nedre, T ovre) {
		skrivVerdierRek2(getRot(),nedre,ovre);
		
	}
	
}
