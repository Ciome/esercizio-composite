/*
per il composite puoi fare un interfaccia ContenitoreProdotto che ha come metodo: 
aggiungiProdotto(ContenitoreProdotto) che ti permette di aggiungere un oggetto di tipo ContenitoreProdotto ad una lista;
getPrezzo() che ti restituisce la somma dei prezzi degli oggetti della lista;

poi fai due classi concrete che implementano l'interfaccia ContenitoreProdotto: ContenitoreProdottoSingolo e ContenitoreDiContenitori
    
ContenitoreProdottoSingolo e' un oggetto che restituisce un solo prezzo 
e ha il metodo aggiungiProdotto(ContenitoreProdotto) "vuoto" in quanto contenitore prodotto singolo

ContenitoreDiContenitori e' una classe che ha una lista di ContenitoreProdotto, 
il getPrezzo che somma il prezzo di tutto cio' che e' contenuto nella sua lista,
e il suo aggiungiProdotto(ContenitoreProdotto) gli permette di aggiungere sia oggetti di tipo ContenitoreProdottoSingolo che oggetti di tipo ContenitoreDiContenitori
perche' implementano tutti la stessa interfaccia


in pratica devi creare una struttura ad albero con metodi che fanno chiamate ricorsive
 */
public class EsercizioComposite {

	public static void main(String[] args) {
		ContenitoreDiContenitori composite = new ContenitoreDiContenitori();
		composite.aggiungiProdotto(new ContenitoreProdottoSingolo(56));
		composite.aggiungiProdotto(new ContenitoreProdottoSingolo(17));
		composite.aggiungiProdotto(new ContenitoreProdottoSingolo(36));
		System.out.println("prezzo totale: " + composite.getPrezzo());
		
		ContenitoreDiContenitori composite2 = new ContenitoreDiContenitori();
		composite2.aggiungiProdotto(new ContenitoreProdottoSingolo(12));
		composite2.aggiungiProdotto(composite);
		System.out.println("prezzo totale 2: " + composite2.getPrezzo());
		
		composite.aggiungiProdotto(composite2);
	}

}
