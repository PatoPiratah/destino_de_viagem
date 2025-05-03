package destinoViagem_list;

import destinoViagem_class.Viagem;

public class ListaPilha extends Lista{
	
	//remover do final;
	public void Inserir(Viagem lista) {
		if(!Verificar(lista)){
			listaViagem.add(0, lista);
		}
	}
	
	@Override
	public String Frase() {
		// TODO Auto-generated method stub
		
		String frase;
		frase = "Isso é uma PILHA de viagens!";
		return frase;
	}

}
