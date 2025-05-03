package destinoViagem_index;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Viajante p1 = new Viajante("Gustavo","Gus@gmail.com","Brasileiro");
		System.out.println(p1.Descricao());
		
		Destino d1 = new Destino("Salvador", "Brasil");
		System.out.println(d1.Chegada());
	}

}
