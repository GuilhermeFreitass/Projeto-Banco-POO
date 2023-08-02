package logic;

public class ContaPF extends Conta {
    String cpf;
    String dataNasc;
    

    public ContaPF(String nome,String cpf, String senha, String email,String dataNasc ) {
        super(nome,senha,email);
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        cartao.setLimite(1500);
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getCPF(){
        return cpf;
    }

    
    
    
        
}
