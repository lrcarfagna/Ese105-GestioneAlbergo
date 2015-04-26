package gestionealbergo;

import java.time.LocalDateTime;
import java.time.Period;

public class Prenotazione {
	private LocalDateTime arrivo;
	private LocalDateTime partenza;
	private LocalDateTime effettuata;
	private LocalDateTime oraArrivo;
	private String richiesteAggiuntive;
	private Cliente cliente;
	private Camera camera;
	
	public Prenotazione(LocalDateTime arrivo,LocalDateTime partenza,
			LocalDateTime effettuata,LocalDateTime oraArrivo,String richiesteAggiuntive,Cliente cliente){
		
		if(arrivo!=null)
			this.arrivo=arrivo;
		else
			throw new IllegalArgumentException("arrivo=null");
		
		if(partenza!=null)
			this.partenza=partenza;
		else
			throw new IllegalArgumentException("partenza=null");
		
		if(effettuata!=null)
			this.effettuata=effettuata;
		else
			throw new IllegalArgumentException("effettuata=null");
		
		if(oraArrivo!=null)
			this.oraArrivo=oraArrivo;
		else
			throw new IllegalArgumentException("oraArrivo=null");
		
		if(cliente!=null)
			this.cliente=cliente;
		else
			throw new IllegalArgumentException("cliente=null");
		
		if(richiesteAggiuntive!=null)
			if(richiesteAggiuntive.length()>0)
				this.richiesteAggiuntive=richiesteAggiuntive;
			else 
				throw new IllegalArgumentException("richiesteAggiuntive<=0");
		else throw new IllegalArgumentException("richiesteAggiuntive=null");
			
		
		
	}
	
	public Prenotazione(LocalDateTime arrivo, LocalDateTime partenza, Cliente cliente) {

		if(arrivo!=null){
			this.arrivo=arrivo;
		}
		else throw new IllegalArgumentException("arrivo=null");
		
		if(partenza!=null){
			this.partenza=partenza;
		}
		else
			throw new IllegalArgumentException("partenza=null");
		
		if(cliente!=null)
			this.cliente=cliente;
		else
			throw new IllegalArgumentException("cliente=null");
		
	}
	
	public LocalDateTime getArrivo() {
		return arrivo;
	}

	public LocalDateTime getPartenza() {
		return partenza;
	}

	public LocalDateTime getEffettuata() {
		return effettuata;
	}

	public LocalDateTime getOraArrivo() {
		return oraArrivo;
	}

	public String getRichiesteAggiuntive() {
		return richiesteAggiuntive;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public Camera getCamera(){
		return this.camera;
	}
	
	public void setOraArrivo(LocalDateTime oraArrivo) {
		this.oraArrivo = oraArrivo;
	}

	public void setRichiesteAggiuntive(String richiesteAggiuntive) {
		this.richiesteAggiuntive = richiesteAggiuntive;
	}
	
	public void setCamera(Camera c){
		this.camera=c;
	}
	public int getNumeroNotti() {
		return Period.between(arrivo.toLocalDate(), partenza.toLocalDate()).getDays();
	}



}
