package destinoViagem_list;

import destinoViagem_class.Viagem;

public class ListaPilha extends Lista{
	
	//remover do final;
	public void RemoverFinal() {
		listaViagem.remove(listaViagem.size()-1);
	}
	
	@Override
	public String Frase() {
		// TODO Auto-generated method stub
		
		String frase;
		frase = "Isso é uma PILHA de viagens!";
		return frase;
	}

}
