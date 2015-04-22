package gestionealbergo;

public class Cliente {
	
	private String nome;
	private String cognome;
	private String email;
	private String cellulare;
	
	public Cliente(String nome,String cognome,String email,String cellulare){
		
		if(nome!=null)
			if(nome.length()>0){
				this.nome=nome;
			}
			else
				throw new IllegalArgumentException("Errore nome");
		else
			throw new IllegalArgumentException("Errore nome");
		
		if(cognome!=null)
			if(nome.length()>0){
				this.cognome=cognome;
			}
			else
				throw new IllegalArgumentException("Errore cognome");
		else
			throw new IllegalArgumentException("Errore nome");
		
		if(email!=null)
			if(email.length()>0){
				this.email=email;
			}
			else
				throw new IllegalArgumentException("Errore email");
		else
			throw new IllegalArgumentException("Errore nome");
		
		if(cellulare!=null)
			if(cellulare.length()>0)
				this.cellulare=cellulare;
			else
				throw new IllegalArgumentException("Errore cellulare");
		else
			throw new IllegalArgumentException("Errore nome");
	}
	
	public Cliente(String nome,String cognome,String cellulare){
		
		if(nome!=null)
			if(nome.length()>0){
				this.nome=nome;
			}
			else
				throw new IllegalArgumentException("Errore nome");
		else
			throw new IllegalArgumentException("Errore nome");
		
		if(cognome!=null)
			if(nome.length()>0){
				this.cognome=cognome;
			}
			else
				throw new IllegalArgumentException("Errore cognome");
		else
			throw new IllegalArgumentException("Errore nome");
		
		if(cellulare!=null)
			if(cellulare.length()>0){
				this.cellulare=cellulare;
			}
			else
				throw new IllegalArgumentException("Errore cellulare");
		else
			throw new IllegalArgumentException("Errore nome");
	}
	
	public String getNome(){
		return this.nome;
	}
	public String getCognome(){
		return this.cognome;
	}
	public String getCellulare(){
		return this.cellulare;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		if(email!=null)
			if(email.length()>0)
				this.email=email;
	}

}
