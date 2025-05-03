package destinoViagem_class;
import java.time.LocalDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Viagem {
	private Viajante viajante;
	private Destino[] listaDestino;
	private LocalDate data_ida;
	private LocalDate data_volta;
	private String identificador;
	static int contador=1;
	static int ano=0;
	
	public Viagem(Viajante viajante, int QuantidadeDestino,
			LocalDate data_ida, LocalDate data_volta) {
		
		this.viajante=viajante;
		listaDestino = new Destino[QuantidadeDestino];
		this.data_ida=data_ida;
		this.data_volta=data_volta;
		
		if(ano != data_ida.getYear()) {
		
			ano = data_ida.getYear();
			contador=1;
		}
		
		identificador = data_ida.getYear()+"-"+contador;
		contador++;
	}
	
	public String Descricao_Viagem(){
		
		String texto;
		texto = "\nIdentificador: "+identificador+" – "+viajante+"-";
		texto += "\nData de Ida: "+data_ida+"\nData de Ida: "+data_volta;
		
		for(int i=0; i < listaDestino.length; i++) {
			if(listaDestino[i] != null) {
				texto += "\n"+listaDestino[i];
			}
		}
		
		return texto;
	}
	
	//destinos totais
	public boolean AdicionarDestino(Destino destino) {
		
		for(int i=0; i < listaDestino.length; i++) {
			//depositar em posicoes vazias, evita realocacao;
			if(listaDestino[i] == null) {
				listaDestino[i] = destino;
				
				return true;
			}
		}
		return false;
	}
	
	public int QuantDestinos() {
			int contador=0;
			for(int i=0; i < listaDestino.length; i++){
				if(listaDestino[i] != null){
					contador++;
				}
			}
			return contador;
	}
	
	public int DiasDeViagem() {
		int dias;
		dias = (int) (data_volta.toEpochDay() - data_ida.toEpochDay());
		
		/* Apesar de ser uma variável 'long', não serão necessários tantos espaços
		 * de memória neste exemplo!
		*/
		return dias;
	}
	
	public String toString() {
		return Descricao_Viagem();
	}
}
