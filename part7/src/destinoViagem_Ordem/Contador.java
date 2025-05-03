package destinoViagem_Ordem;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;

import destinoViagem_class.Destino;
import destinoViagem_class.Viagem;

public class Contador {
	private Map<Destino, Viagem> lista = new HashMap();
		
	public boolean Vazia() {
		return lista.isEmpty();
	}
	
	public void Distribuir(Destino destino, Viagem viagem) {
		this.lista.put(destino, viagem);
	}
	
	public Viagem getDestino(Destino destino) {
		return this.lista.get(destino);
	}
	
	/*
	 * Só conseguimos interar sobre uma lista e não um Map. por isso temos que usar
	 * o método keySet() que retorna uma lista de chaves contidas no Map.
	 */
	
	public Set<Destino> getLista(){
		return this.lista.keySet();
	}
	public void Contabilizar(){
		
		Set<Viagem> lista = new HashSet<Viagem>();
		
		for (Lista item : listaViagem) {
			for (Destino dest : item.getListaDestino()) {
				item.getIdentificador();
			}
		}
	}
}
