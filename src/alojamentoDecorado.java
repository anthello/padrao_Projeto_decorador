
public abstract class alojamentoDecorado implements alojamento {

    private alojamento disponivel;    
    public alojamentoDecorado (alojamento disponivel){
        this.disponivel = disponivel;
    }    
    public alojamento getAlojamento() {
        return this.disponivel;    }
    
    public void setAlojamento (alojamento disponivel) {
        this.disponivel = disponivel;
    }    
    public String getDescricao() {
        return getAlojamento().getDescricao();
    }    
    public String ObterTipo(){
        return getAlojamento().getTipo();
    }    
    public double ObterOrcamento() {
        return getAlojamento().ObterOrcamento();
    }    
}

