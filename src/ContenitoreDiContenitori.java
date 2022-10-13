import java.util.ArrayList;

public class ContenitoreDiContenitori implements ContenitoreProdotto {
	
	private ArrayList<ContenitoreProdotto> prodotti;
	
	public ContenitoreDiContenitori() {
		this.prodotti = new ArrayList<ContenitoreProdotto>();
	}
	
	public ContenitoreDiContenitori(ArrayList<ContenitoreProdotto> prodotti) {
		this.prodotti = prodotti;
	}
	
	@Override
	public void aggiungiProdotto(ContenitoreProdotto prodotto) {
		if (!this.contieneContenitore(prodotto) && !prodotto.contieneContenitore(this)) {
			this.prodotti.add(prodotto);
			System.out.println("prodotto inserito");
		} else System.out.println("impossibile inserire");
	}

	@Override
	public long getPrezzo() {
		long sum = 0;
		for (int i = 0; i < prodotti.size(); i++) {
			sum += prodotti.get(i).getPrezzo();
		}
		return sum;
	}

	@Override
	public boolean contieneContenitore(ContenitoreProdotto contenitore) {
		if (contenitore.equals(this)) return true;
		for (int i = 0; i < prodotti.size(); i++) {
			if (prodotti.get(i).contieneContenitore(contenitore)) return true; 
		}
		return false;
	}

}
