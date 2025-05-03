package destinoViagem_class;

public class Viajante {
	
	private String nome;
	private String email;
	private String nacionalidade;
	private String identificador;
	static int contador=1;
	
	public Viajante(String nome, String email, String nacionalidade){
		this.nome=nome;
		this.email=email;
		this.nacionalidade=nacionalidade;
		
		identificador = "V"+contador;
		contador++;
	}
	
	/** Encapsulamento de Viajante já existente;
	 * 
	 */
	public Viajante(Viajante clone) {
		
		this.nome=clone.getNome();
		this.email=clone.getEmail();
		this.nacionalidade=clone.getNacionalidade();
		this.identificador=clone.getIdentificador();
		
	}
	
	public String Descricao_Viajante(){
		return identificador+" - "+nome+" - "+email+" - "+nacionalidade;
	}
	//getters;
	public String getNome(){
		return nome;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getNacionalidade(){
		return nacionalidade;
	}
	
	public String getIdentificador(){
		return identificador;
	}
	
	//setters;
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public void setIdentificador(String identificador){
		this.identificador = identificador;
	}
	
	public String toString() {
		return Descricao_Viajante();
	}
}


