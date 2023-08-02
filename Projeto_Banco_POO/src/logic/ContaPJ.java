package logic;

public class ContaPJ extends Conta {
    String cnpj;

    public ContaPJ(String nome,String cnpj, String senha,String email ) {
        super(nome,senha,email);
        this.cnpj = cnpj;
        cartao.setLimite(6000);
    }

    public String getCNPJ() {
        return cnpj;
    }

    @Override
    public void pagarComPix(double valor, Conta contaDestino, Object banco) throws Exception {
        checarOperacao(valor);
        checarOperacaoTransferencia(contaDestino, valor);
        Banco bancoDestino = (Banco) banco; 
        this.setSaldo(this.getSaldo() - valor - (valor* bancoDestino.getTaxaPIXPJ()/100));
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        criarTransacao(valor,"PIX",true,contaDestino.getNome());
        contaDestino.criarTransacao(valor,"PIX",false,this.getNome());
    }
        
    
}

