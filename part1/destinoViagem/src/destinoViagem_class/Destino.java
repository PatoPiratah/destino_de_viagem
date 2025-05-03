package destinoViagem_class;

public class Destino {
	 
	private String regiao;
	private String pais;
	
	
	public Destino(String regiao, String pais) {
		this.regiao=regiao;
		this.pais=pais;
	}
	
	public String Chegada() {
		return regiao+" – "+pais;
	}
	
	//getters;
	public String getRegiao() {
		return regiao;
	}
	
	public String getPais() {
		return pais;
	}
	
	//setters;
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
}
