package logic;

import java.util.*;


public class SistemaBancos{
    public static LoggedInUser LoggedInUser;
    public static HashMap<String,Par> contasRegistradas = new HashMap<String,Par>();
    public static ArrayList<Banco> bancos = new ArrayList<Banco>();

    public static boolean checkBanco(String agencia) {
        Iterator<Banco> bancosIterator = bancos.iterator();
        while(bancosIterator.hasNext()) {
            Banco bancoAchado = bancosIterator.next();
            if (bancoAchado.getAgencia().equals(agencia)) {
                return true;
            }
        }
        return false;
    }
   

    public static void add(Banco banco) {
        if (checkBanco(banco.getAgencia())) {
            System.out.println("Essa agencia ja esta cadastrada");
        }
        else {
            bancos.add(banco);
        }
    }

   

    public static void register(Conta conta,Banco banco) throws Exception{
        if(contasRegistradas.containsKey(conta.getEmail())) {
            throw new Exception("Conta já existe"); 
        }
        else {
            banco.addInBank(conta);
            Par par = new Par(banco, conta);
            contasRegistradas.put(conta.getEmail(),par);
    
        }
    }

    
    public static LoggedInUser logIn(String name, String password) throws Exception 
    {
        if(!contasRegistradas.containsKey(name)) {
            throw new Exception("Usuario nao existe");
        }
        if(contasRegistradas.get(name).conta.verificar(name, password))
        {
            System.out.println("User " + name + " logged in succesfully");
            LoggedInUser = new LoggedInUser((contasRegistradas.get(name).banco),(contasRegistradas.get(name).conta));
            return LoggedInUser;
            
        }
            throw new Exception("Crendeciais erradas");
    }

    
    public static Conta encontrarConta(String agencia, String numeroConta_chave ) throws Exception {
        Banco bancoAchado = encontrarBanco(agencia);  
        return bancoAchado.encontrarConta(numeroConta_chave);
    }

    public static Par encontrarChavePix(String chave) throws Exception{
        for (Par value : contasRegistradas.values()) {
            if (value.conta.mostrarChave().equals(chave)) {

                Par pair = new Par(value.banco, value.conta);
                return pair;
            }
        } 
         throw new Exception("Chave Pix nao corresponde");
    }


  

    public static Banco encontrarBanco(String agencia_nome) throws Exception{
        Iterator<Banco> bancosIterator = bancos.iterator();
        while(bancosIterator.hasNext()) {
            Banco bancoAchado = bancosIterator.next();
            if (bancoAchado.getAgencia().equals(agencia_nome) || bancoAchado.getNome().equals(agencia_nome)) {
                return bancoAchado;
            }
        }
       throw new Exception("Banco nao existe");
    }    

}