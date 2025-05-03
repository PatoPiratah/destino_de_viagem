package destinoViagem_Ordem;

import java.util.Comparator;
import destinoViagem_class.Destino;

public class DestinoCrescente implements Comparator<Destino> {
	
	@Override
	public int compare(Destino o1, Destino o2) {
		return o1.getRegiao().compareTo(o2.getRegiao());
	}
}

