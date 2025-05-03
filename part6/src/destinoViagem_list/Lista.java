package destinoViagem_list;

import java.util.ArrayList;

import destinoViagem_class.Destino;
import destinoViagem_class.Viagem;

public abstract class Lista {
	
	protected ArrayList<Viagem> listaViagem;
	
	public Lista() {
		listaViagem= new ArrayList<Viagem>();
		
	}	
	public void Remover() {
		listaViagem.remove(0);
	}
	
	public boolean Verificar(Viagem lista) {
		return listaViagem.contains(lista);
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
