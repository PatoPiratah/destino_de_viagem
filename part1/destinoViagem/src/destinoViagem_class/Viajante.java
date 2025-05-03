package destinoViagem_class;

public class Viajante {
	
	private String nome;
	private String email;
	private String nacionalidade;
	
	
	public Viajante(String nome, String email, String nacionalidade){
		this.nome=nome;
		this.email=email;
		this.nacionalidade=nacionalidade;
	}
	
	public String Descricao(){
		
		return nome+" – "+email+" - "+nacionalidade;
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
}
