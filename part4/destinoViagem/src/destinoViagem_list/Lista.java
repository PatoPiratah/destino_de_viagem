package destinoViagem_list;

import java.util.ArrayList;
import destinoViagem_class.Viagem;

public abstract class Lista {
	
	protected ArrayList<Viagem> listaViagem;
	
	public Lista() {
		listaViagem= new ArrayList<Viagem>();
		
	}	
	
	public void Inserir(Viagem lista) {
		
		listaViagem.add(lista);
	}
	
	public abstract String Frase();
	
	public String toString() {
		String texto= new String();
		
		for(Viagem lista : listaViagem) {
			texto += lista + "\n\n";
		}
		
		return texto;
	}
}
