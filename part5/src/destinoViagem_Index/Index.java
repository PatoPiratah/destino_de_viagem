package destinoViagem_Index;
import java.time.LocalDate;

import destinoViagem_class.*;
import destinoViagem_list.IdentificadorDeGerenciamentoDeViagens;
import destinoViagem_list.Lista;
import destinoViagem_list.ListaFila;
import destinoViagem_list.ListaPilha;
import execao.MyException;

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
		
		ListaFila Fila1 = new ListaFila();
		ListaPilha Pilha1 = new ListaPilha();
		
		try {
			Viagem v1 = new Viagem(p1, LocalDate.of(2011, 03, 20), 
					LocalDate.of(2012, 11, 22));
			
			Pilha1.Inserir(v1);
			Fila1.Inserir(v1);
			
			System.out.println("\nDestinos: ");
			v1.AdicionarDestino(d1);
			v1.AdicionarDestino(d4);
			v1.AdicionarDestino(d3);
			v1.AdicionarDestino(d2);
			v1.AdicionarDestino(d1);			
			
			System.out.println("\n Alfabetica Crescente: \n"+" - "+v1.OrdemCrescente());
			System.out.println("\n Alfabetica Decrescente: \n"+" - "+v1.OrdemDecrescente());
			System.out.println("\n	Elemento 1: \n"+v1);
			
		} catch (MyException e) {
			e.printStackTrace();
		}
		
		try {
			Viagem v2 = new Viagem(p1, LocalDate.of(2010, 12, 20), 
					LocalDate.of(2009, 12, 22));
			
			Fila1.Inserir(v2);
			Pilha1.Inserir(v2);
			
			System.out.println("\nDestinos: ");
			v2.AdicionarDestino(d3);
			v2.AdicionarDestino(d5);
			
			System.out.println("\n Alfabetica Crescente: \n"+" - "+v2.OrdemCrescente());
			System.out.println("\n Alfabetica Decrescente: \n"+" - "+v2.OrdemDecrescente());
			
			System.out.println("\n	Elemento 2: \n"+v2);
			
		} catch (MyException e) {
			e.printStackTrace();
		}
		
		try{ Viagem v3 = new Viagem(p2, LocalDate.of(2021, 05, 23), 
				LocalDate.of(2023, 12, 22));	
		
		Fila1.Inserir(v3);
		Pilha1.Inserir(v3);
		
		System.out.println("\nDestinos: ");
		v3.AdicionarDestino(d2);
		v3.AdicionarDestino(d3);
		v3.AdicionarDestino(d4);
		System.out.println("\n	Elemento 3: \n"+v3);
		
		System.out.println("\n Alfabetica Crescente: \n"+" - "+v3.OrdemCrescente());
		System.out.println("\n Alfabetica Decrescente: \n"+" - "+v3.OrdemDecrescente());
		
		System.out.println("Elemento 3: \n"+v3);
		
		} catch (MyException e) {
			e.printStackTrace();
		}
		
		//Testes PILHA;
		
		System.out.println("\n	Fila Completa: \n"+Fila1);
		
		Fila1.Remover();
		System.out.println("\n	Remoção Fila: \n"+Fila1);
		
		System.out.println("\nIdentificadores: \n"+IdentificadorDeGerenciamentoDeViagens.identificar(Fila1));
		
		System.out.println("\n	Fila Completa: \n"+Fila1);
		
		//Testes PILHA;
		
		System.out.println("\n	Pilha Completa: \n"+Pilha1);
		Pilha1.Remover();
		System.out.println("\n	Remoção Pilha: \n"+Pilha1);
		
		System.out.println("\nIdentificadores: "+IdentificadorDeGerenciamentoDeViagens.identificar(Pilha1));
		
		//teste add destino; - Part 1 & 2;
		
		/*
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
		
		*/
	}

}


