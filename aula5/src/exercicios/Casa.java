package exercicios;

public class Casa extends Imovel {
    private boolean garagem;
    
    public Casa(String local, double valor, boolean garagem) {
        super(local, valor);
        this.garagem = garagem;
    }
    
    public boolean isGaragem() { return garagem; }
    public void setGaragem(boolean garagem) { this.garagem = garagem; }
}
