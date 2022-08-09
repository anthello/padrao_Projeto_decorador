
public class pensaoCompleta extends alojamentoDecorado {
	  
	    public pensaoCompleta (alojamento disponivel){
	        super (disponivel);
	    }    
	    public String getDescricao(){
	        return getAlojamento().getDescricao().concat("Pensao Completa");
	    }    
	    public double ObterOrcamento(){
	        return getAlojamento().ObterOrcamento()+150;
	    }
	    @Override
	    public String getTipo() {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }    
}

