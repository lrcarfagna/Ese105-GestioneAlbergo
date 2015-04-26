package gestionealbergo;

import java.time.LocalDateTime;
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
				throw new IllegalArgumentException("Errore numero=null");
		else 
			throw new IllegalArgumentException("Errore numero<=0");
		
		if(postiLetto<=0){
			throw new IllegalArgumentException("Posti letto <= 0");
		}
		else this.postiLetto=postiLetto;
		
		prenotazioni = new Vector<Prenotazione>();
				
	}

	public void addPrenotazione(Prenotazione p){
		if(p!=null){
			if(this.isDisponibile(p.getArrivo(),p.getPartenza())){
				prenotazioni.add(p);
				p.setCamera(this);
			}
			else throw new IllegalArgumentException("Camera non disponibile");
		}
		else throw new IllegalArgumentException("p=null");
				
			
	}
	
	public boolean isDisponibile(LocalDateTime dal,LocalDateTime al){
		boolean disponibile=true;
		for(int i=0;i<prenotazioni.size();i++){
			if(dal.isBefore(prenotazioni.elementAt(i).getPartenza()) || al.isAfter(prenotazioni.elementAt(i).getArrivo())){
				disponibile=false;
			}
		}
		return disponibile;
	}

	public String getNumero() {
		return numero;
	}

	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}

	public int getPostiLetto() {
		return postiLetto;
	}
	
	@Override
	public String toString() {
		return "Camera [numero=" + numero + ", postiLetto=" + postiLetto + "]";
	}
}
