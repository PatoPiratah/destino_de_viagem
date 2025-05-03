package destinoViagem_Index;
import java.time.LocalDate;

import destinoViagem_class.*;
import destinoViagem_list.IdentificadorDeGerenciamentoDeViagens;
import destinoViagem_list.Lista;
import destinoViagem_list.ListaFila;
import destinoViagem_list.ListaPilha;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Viajante p1 = new Viajante("Gustavo","Gus@gmail.com","Brasileiro");
		Viajante p2 = new Viajante("Walter","walterwhite@gmail.com","estadunidense");
		
		Destino d1 = new Destino("Salvador", "Brasil");
		Destino d2 = new Destino("Medelin", "Colombia");
		Destino d3 = new Destino("Distrito Federal", "Brasil");
		Destino d4 = new Destino("Buenos Aires", "Argentina");
		Destino d5 = new Destino("Santiago", "Chile");
		//System.out.println(d1.Descreva_Destino());
		
		Viagem v1 = new Viagem(p1, LocalDate.of(2010, 03, 20), 
				LocalDate.of(2012, 11, 22));
		Viagem v2 = new Viagem(p1, LocalDate.of(2018, 12, 20), 
				LocalDate.of(2018, 12, 22));
		Viagem v3 = new Viagem(p2, LocalDate.of(2021, 05, 23), 
				LocalDate.of(2023, 12, 22));		
		
		
		//Testes PILHA;
		ListaFila Fila1 = new ListaFila();
		
		Fila1.Inserir(v3);
		System.out.println("Fila elemento unico: \n"+Fila1);
		Fila1.Inserir(v2);
		Fila1.Inserir(v1);
		
		System.out.println("Fila Completa: \n"+Fila1);
		
		Fila1.RemoverInicio();
		System.out.println("Remoção Fila: \n"+Fila1);
		
		System.out.println("\nIdentificadores: \n"+IdentificadorDeGerenciamentoDeViagens.identificar(Fila1));

		//Testes PILHA;
		ListaPilha Pilha1 = new ListaPilha();
		
		Pilha1.Inserir(v3);
		System.out.println("Pilha elemento unico: \n"+Pilha1);
		Pilha1.Inserir(v2);
		Pilha1.Inserir(v1);
		
		System.out.println("Pilha Completa: \n"+Pilha1);
		Pilha1.RemoverFinal();
		System.out.println("Remoção Pilha: \n"+Pilha1);
		
		System.out.println("\nIdentificadores: "+IdentificadorDeGerenciamentoDeViagens.identificar(Pilha1));
		
		//teste add destino; - Part 1 & 2;
		
		v1.AdicionarDestino(d1);
		v1.AdicionarDestino(d2);
		v1.AdicionarDestino(d3);
		v1.AdicionarDestino(d1);
		
		v2.AdicionarDestino(d3);
		v2.AdicionarDestino(d5);
		
		v3.AdicionarDestino(d2);
		v3.AdicionarDestino(d3);
		v3.AdicionarDestino(d4);
		
		System.out.println("\n");
		System.out.println(v1);
		System.out.println("\n");
		System.out.println(v2.Descricao_Viagem());
		System.out.println("\n");
		System.out.println(v3.Descricao_Viagem());
		
		//teste remover destino;
		
		v3.removerDestino(d4);
		System.out.println("\n");
		System.out.println(v3.Descricao_Viagem());
		
		System.out.println("\nQuantidade de destinos do Viajante 1: "+v1.QuantDestinos());
		System.out.println("Quantidade de dias de Viagem do Viajante 1: "+v1.DiasDeViagem());
		
		System.out.println("\nQuantidade de destinos do Viajante 2: "+v2.QuantDestinos());
		System.out.println("Quantidade de dias de Viagem do Viajante 2: "+v2.DiasDeViagem());
		
		System.out.println("\nQuantidade de destinos do Viajante 3: "+v3.QuantDestinos());
		System.out.println("Quantidade de dias de Viagem do Viajante 3: "+v3.DiasDeViagem());
		
		
	}

}


