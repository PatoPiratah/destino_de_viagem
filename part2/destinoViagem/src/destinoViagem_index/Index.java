package destinoViagem_index;
import java.time.LocalDate;

import destinoViagem_class.*;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Viajante p1 = new Viajante("Gustavo","Gus@gmail.com","Brasileiro");
		Viajante p2 = new Viajante("Walter","walterwhite@gmail.com","estadunidense");
		
		Destino d1 = new Destino("Salvador", "Brasil");
		Destino d2 = new Destino("Medelín", "Colombia");
		Destino d3 = new Destino("Distrito Federal", "Brasil");
		System.out.println(d1.Descreva_Destino());
		
		Viagem v1 = new Viagem(p1, 3, LocalDate.of(2010, 03, 20), 
				LocalDate.of(2012, 11, 22));
		Viagem v2 = new Viagem(p1, 3, LocalDate.of(2018, 12, 20), 
				LocalDate.of(2018, 12, 22));
		Viagem v3 = new Viagem(p2, 2, LocalDate.of(2021, 05, 23), 
				LocalDate.of(2023, 12, 22));		
		
		if(v1.AdicionarDestino(d1)) {
			System.out.println("Adicionado com sucesso!");
		}else {
			System.out.println("Falha ao adicionar!");
		}
		
		if(v1.AdicionarDestino(d2)) {
			System.out.println("Adicionado com sucesso!");
		}else {
			System.out.println("Falha ao adicionar!");
		}
		
		if(v1.AdicionarDestino(d3)) {
			System.out.println("Adicionado com sucesso!");
		}else {
			System.out.println("Falha ao adicionar!");
		}
		
		if(v3.AdicionarDestino(d2)) {
			System.out.println("Adicionado com sucesso!");
		}else {
			System.out.println("Falha ao adicionar!");
		}
		
		if(v2.AdicionarDestino(d3)) {
			System.out.println("Adicionado com sucesso!");
		}else {
			System.out.println("Falha ao adicionar!");
		}
		
		if(v1.AdicionarDestino(d1)) {
			System.out.println("Adicionado com sucesso!");
		}else {
			System.out.println("Falha ao adicionar!");
		}
		System.out.println("\n");
		System.out.println(v1);
		System.out.println("\n");
		System.out.println(v2.Descricao_Viagem());
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
