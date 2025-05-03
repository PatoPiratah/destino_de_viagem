package destinoViagem_Ordem;

public class Ranking {
	private String categoria;
	
	public Ranking(String categoria) {
		this.categoria = categoria;
	}
	
	public String Frase() {
		
		String frase;
		frase = "Destino de Categoria "+categoria+"!";
		return frase;
	}
}
