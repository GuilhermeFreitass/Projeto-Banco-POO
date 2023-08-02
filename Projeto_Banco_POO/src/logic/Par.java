package logic;

public class Par {
    public  Banco banco;
    public Conta conta;

    public Par(Banco banco, Conta conta) { 
        this.banco = banco;
        this.conta = conta;
    }

    public Banco getBanco() {
        return banco;
    }

    public Conta getConta() {
        return conta;
    }

    
}