package gestionealbergo;

import java.util.*;

public class Camera {
	
	private String numero;
	private Vector<Prenotazione> prenotazioni;
	private int postiLetto;
	
	
	public Camera(String numero,int postiLetto){
		if(numero!=null)
			if(numero.length()>0)
				this.numero=numero;
			else
				throw new IllegalArgumentException("Errore numero");
		else 
			throw new IllegalArgumentException("Errore numero");
		
		if(postiLetto<=0){
			throw new IllegalArgumentException("Posti letto <= 0");
		}
		else this.postiLetto=postiLetto;
		
		prenotazioni = new Vector<Prenotazione>();
				
	}

	public void addPrenotazione(Prenotazione p){
		if(p!=null){
			
		}
	}
}
