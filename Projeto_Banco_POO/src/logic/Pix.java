package logic;
//Interface PIX espera algum objeto que interaja com alguma conta
public interface Pix {
    void cadastrarChave(String chave);
    void pagarComPix(double valor, Conta contaDestino, Object bancoDestino) throws Exception;  
    String mostrarChave();
    
}