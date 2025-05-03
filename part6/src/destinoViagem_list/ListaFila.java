package destinoViagem_list;

import destinoViagem_class.Destino;
import destinoViagem_class.Viagem;

public class ListaFila extends Lista{
	
	//remover do inicio;
	public void Inserir(Viagem lista) {
		if(!Verificar(lista)){
			listaViagem.add(lista);
		}
	}

	@Override
	public String Frase() {
		// TODO Auto-generated method stub
		
		String frase;
		frase = "Isso é uma FILA de viagens!";
		return frase;
	}
}
