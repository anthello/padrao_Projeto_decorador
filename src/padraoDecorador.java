
public class padraoDecorador {

	public static void main(String[] args) {
      
		alojamento hotel_jequitimar = new Hotel ("Hotel Jequitimar Guaruja");
		hotel_jequitimar = new pensaoCompleta (hotel_jequitimar);
		hotel_jequitimar = new primeiraClasse (hotel_jequitimar);
		System.out.println (hotel_jequitimar.getDescricao());
		System.out.println ("R$" +hotel_jequitimar.ObterOrcamento());
	          
		alojamento hotel_ibis = new Hotel ("Hotel Ibis");
		hotel_ibis = new classeStandart (hotel_ibis);
		System.out.println (hotel_ibis.getDescricao());
		System.out.println ("R$" + hotel_ibis.ObterOrcamento());          
	}    
}

		

