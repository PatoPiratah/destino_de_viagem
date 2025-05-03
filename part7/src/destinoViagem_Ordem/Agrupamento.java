package destinoViagem_Ordem;

import java.util.ArrayList;
import java.util.List;

import destinoViagem_class.Viagem;

public class Agrupamento<E> {

	private List<E> lista = new ArrayList<>();
	
	public void Inserir(E elemento) {
		lista.add(elemento);
	}
	
	public void Remover(E elemento) {
		lista.remove(elemento);
	}
	
	public boolean Verificar(E elemento) {
		return lista.contains(lista);
	}
	
	public void InserirGrupo(List<E> elementos) {
		for (E e: elementos) {
			Inserir(e);
		}
	}
}
