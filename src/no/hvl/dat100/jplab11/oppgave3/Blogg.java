package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.Tekst;
import no.hvl.dat100.jplab11.oppgave2.Bilde;

public class Blogg {

	private Innlegg [] innleggtabell;
	//private Innlegg [] innleggtabell1;
	private int nesteledig;
	

	public Blogg() {
		innleggtabell = new Innlegg [20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde]; 
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
		
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		boolean funnet = false;
		int pos = 0;
		
		while(pos < nesteledig && !funnet) {
			if(innleggtabell[pos].erLik(innlegg)) {
			funnet = true;
		}else {
			pos++;
		}
			
	}
		if(funnet)
			return pos;
		else
			return -1;
		
		
		
//		int pos = -1;
//		for(int i = 0; i < innleggtabell.length; i++) {
//			if(innleggtabell[i].erLik(innlegg)) {
//				pos = i;
//			}
//		}
//		return pos;	
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = false;
		if(finnInnlegg(innlegg) >= 0) {
		finnes = true;
		}
		return finnes;
	}

	public boolean ledigPlass() {
		
		if(nesteledig < innleggtabell.length) {
			return true;
		}else {
			return false;
		}
	
	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean lagtTil = false;
		if(finnes(innlegg) == false) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			lagtTil = true;
		}
		
		return lagtTil;
		
	}
	
	public String toString() {
		String toString = nesteledig + "\n";
        for (int i = 0; i < innleggtabell.length; i++) {
            if (innleggtabell[i] != null)
            toString += innleggtabell[i].toString();
        }
        return toString;
		
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
//		innleggtabell1 = new Innlegg[40];
//		for(int i = 0; i < innleggtabell.length; i++) {
//			innleggtabell1[i] = innleggtabell[i];
//		}
//		nesteledig = innleggtabell.length;
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
//		boolean lagtTil = false;
//		if(finnes(innlegg) == false && nesteledig < innleggtabell.length) {
//			innleggtabell[nesteledig] = innlegg;
//			lagtTil =true;
//			
//		}else if(finnes(innlegg) == false && nesteledig >= innleggtabell.length) {
//			utvid();
//			innleggtabell1[nesteledig] = innlegg;
//			lagtTil = true;
//			
//		}else {
//			lagtTil = false;
//		}
//		return lagtTil;
//		
		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}