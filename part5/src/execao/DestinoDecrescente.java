package execao;

import java.util.Comparator;
import destinoViagem_class.Destino;

public class DestinoDecrescente implements Comparator<Destino> {
		
	@Override
		public int compare(Destino o1, Destino o2) {
			return o2.getRegiao().compareTo(o1.getRegiao());
		}
	}

