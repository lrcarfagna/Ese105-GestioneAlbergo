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
				throw new IllegalArgumentException("Errore nome<=0");
		else
			throw new IllegalArgumentException("Errore nome=null");
		
		if(cognome!=null)
			if(cognome.length()>0){
				this.cognome=cognome;
			}
			else
				throw new IllegalArgumentException("Errore cognome<=0");
		else
			throw new IllegalArgumentException("Errore cognome=null");
		
		if(email!=null)
			if(email.length()>0){
				this.email=email;
			}
			else
				throw new IllegalArgumentException("Errore email<=0");
		else
			throw new IllegalArgumentException("Errore email=null");
		
		if(cellulare!=null)
			if(cellulare.length()>0)
				this.cellulare=cellulare;
			else
				throw new IllegalArgumentException("Errore cellulare<=0");
		else
			throw new IllegalArgumentException("Errore cellulare=null");
	}
	
	public Cliente(String nome,String cognome,String cellulare){
		
		if(nome!=null)
			if(nome.length()>0){
				this.nome=nome;
			}
			else
				throw new IllegalArgumentException("Errore nome<=0");
		else
			throw new IllegalArgumentException("Errore nome=null");
		
		if(cognome!=null)
			if(cognome.length()>0){
				this.cognome=cognome;
			}
			else
				throw new IllegalArgumentException("Errore cognome<=0");
		else
			throw new IllegalArgumentException("Errore cognome=null");
		
		if(cellulare!=null)
			if(cellulare.length()>0){
				this.cellulare=cellulare;
			}
			else
				throw new IllegalArgumentException("Errore cellulare<=0");
		else
			throw new IllegalArgumentException("Errore cellulare=null");
		
		this.email="/"; // quando l'email non viene fornita inserisco il lo slash che verrà stampato nel toString()
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
			else
				throw new IllegalArgumentException("Errore email<=0");
		else throw new IllegalArgumentException("Errore email=null");
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", email="
				+ email + ", cellulare=" + cellulare + "]";
	}

}
