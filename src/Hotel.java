
public class Hotel implements alojamento {
	
    private double custo_base = 100;
    private String tipo = "Hotel";
    private String descricao;

    public Hotel (String descricao) {
        this.descricao = descricao;
    }   
    
    public String getDescricao(){
        return this.descricao;
    } 
    
    public String getTipo(){
        return this.tipo;
    } 
    
    public double ObterOrcamento(){
        return this.custo_base;
    }   
}
