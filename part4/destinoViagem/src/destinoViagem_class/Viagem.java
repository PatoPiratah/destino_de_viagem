package destinoViagem_class;

import java.time.LocalDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Viagem {
	private Viajante viajante;
	private ArrayList<Destino> listaDestino;
	private LocalDate data_ida;
	private LocalDate data_volta;
	private String identificador;
	static int contador = 1;
	static int ano = 0;

	public Viagem(Viajante viajante, LocalDate data_ida, LocalDate data_volta) {

		this.viajante = viajante;
		this.listaDestino = new ArrayList<Destino>();
		this.data_ida = data_ida;
		this.data_volta = data_volta;

		if (ano != data_ida.getYear()) {

			ano = data_ida.getYear();
			contador = 1;
		}

		identificador = data_ida.getYear() + "-" + contador;
		contador++;
	}
	
	/**
	 * Formatador de dados da viagem;
	 * @return
	 */
	
	/** "for (Destino item : listaDestino)"
	 * 
	 * para cada item da 'listaDestino', adiciona-se 
	 * valor por valor, sendo 'item' a variável 
	 * representando valores.		 * 
	 * @return
	 */
	public String Descricao_Viagem() {

		String texto;
		texto = "\nIdentificador: " + identificador + " - " + viajante + "-";
		texto += "\nData de Ida: " + data_ida + "\nData de Ida: " + data_volta;
		
		for (Destino item : listaDestino) {
				texto += "\n" + item;
			}
		return texto;
	}

	public int DiasDeViagem() {
		int dias;
		dias = (int) (data_volta.toEpochDay() - data_ida.toEpochDay());

		/*
		 * Apesar de ser uma variável 'long', não serão necessários tantos espaços de
		 * memória neste exemplo!
		 */
		return dias;
	}

	/**
	 * arraylist methods;
	 * @param Destino a ser adicionado
	 * @return
	 */
	public void AdicionarDestino(Destino destino) {
		if(!verificar(destino)) {
		listaDestino.add(destino);
		}
	}

	public void removerDestino(Destino destino) {
			listaDestino.remove(destino);
	}

	public int QuantDestinos(){
		return listaDestino.size();
	}

	public boolean verificar(Destino destino) {
		return listaDestino.contains(destino);
	}
	
	//getters
	public LocalDate getData_ida() {
		return data_ida;
	}
	public LocalDate getData_volta() {
		return data_volta;
	}
	
	/** 
	 * Encapsulamento de Viajante já existente;
	 * 
	 */
	public Viajante getViajante() {
		Viajante clone = new Viajante(viajante);
		return clone;
	}
	
	/** 
	 * Encapsulamento de ArrayList já existente;
	 * 
	 */
	public ArrayList<Destino> getListaDestino() {
		ArrayList<Destino> clone = listaDestino;
		return clone;
	}
	
	public static int getAno() {
		return ano;
	}
	
	public static int getContador() {
		return contador;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	//setters
	public void setData_ida(LocalDate data_ida) {
		this.data_ida = data_ida;
	}
	
	public void setData_volta(LocalDate data_volta) {
		this.data_volta = data_volta;
	}
	
	public void setListaDestino(ArrayList<Destino> listaDestino) {
		this.listaDestino = listaDestino;
	}
	
	public void setViajante(Viajante viajante) {
		this.viajante = viajante;
	}
	
	public static void setAno(int ano) {
		Viagem.ano = ano;
	}
	
	public static void setContador(int contador) {
		Viagem.contador = contador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String toString() {
		return Descricao_Viagem();
	}
}
