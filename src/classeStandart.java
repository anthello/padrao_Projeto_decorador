
public class classeStandart extends alojamentoDecorado{
	   
    public classeStandart (alojamento disponivel){
        super (disponivel);
    }    
    public String getDescricao(){
        return getAlojamento().getDescricao().concat ("Apartamento Standart");
    }    
    public double ObterOrcamento(){
        return getAlojamento().ObterOrcamento()+50;
    }
    @Override
    public String getTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
