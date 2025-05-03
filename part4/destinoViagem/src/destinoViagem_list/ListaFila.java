package destinoViagem_list;

import destinoViagem_class.Viagem;

public class ListaFila extends Lista{
	
	//remover do inicio;
	public void RemoverInicio() {
		listaViagem.remove(0);
	}

	@Override
	public String Frase() {
		// TODO Auto-generated method stub
		
		String frase;
		frase = "Isso é uma FILA de viagens!";
		return frase;
	}
}
