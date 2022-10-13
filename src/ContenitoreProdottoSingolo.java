
public class ContenitoreProdottoSingolo implements ContenitoreProdotto {
	
	private long prezzo;
	
	public ContenitoreProdottoSingolo(long prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public void aggiungiProdotto(ContenitoreProdotto prodotto) {
	}

	@Override
	public long getPrezzo() {
		return this.prezzo;
	}

	@Override
	public boolean contieneContenitore(ContenitoreProdotto contenitore) {
		return contenitore.equals(this);
	}

}
