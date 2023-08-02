package logic;

public class LoggedInUser
{
    private  Conta loggedAcount;
    private  Banco loggedBank;
    
    public Conta getConta() {
        return loggedAcount;
    }
    

    public  Banco getBanco() {
        return loggedBank;
    }

    LoggedInUser(Banco banco, Conta account)
    {
        loggedAcount = account;
        loggedBank = banco;

    }

    public void deslogar() {
        loggedAcount = null;
    }
   
}

