
public class primeiraClasse extends alojamentoDecorado {

	    public primeiraClasse (alojamento disponivel){
	        super (disponivel);
	    }       
	    public String getDescricao(){
	        return getAlojamento().getDescricao().concat("Vista ao mar");
	    }    
	    public double ObterOrcamento(){
	        return getAlojamento().ObterOrcamento()+200;
	    }
	    @Override
	    public String getTipo() {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }
}
