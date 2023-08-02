package logic;
import java.util.*;

public class Banco{
    private String bankName;
    private String agencia;
    private double taxaPIXPJ;
    private ArrayList<Conta> clientes = new ArrayList<Conta>();
    
    public Banco(String bankName, String agencia, double taxaPIXPJ){
        this.bankName = bankName;
        this.agencia = agencia;
        this.taxaPIXPJ = taxaPIXPJ;

    }

    public String getAgencia() {
        return agencia;
    }

    public String getNome() {
        return bankName;
    }

    public double getTaxaPIXPJ() {
        return taxaPIXPJ;
    }

    
    public void addInBank(Conta conta) throws Exception {
        if (clientes.contains(conta)) {
                throw new Exception("Conta já existe");
        }
        clientes.add(conta); }

    public void RemoveInBank(Conta cliente) {
        clientes.remove(cliente);  
    }


    public Conta encontrarConta(String numeroContaouChave) throws Exception{
        Iterator<Conta> clientesIterator = clientes.iterator();
        while(clientesIterator.hasNext()) {
            Conta cliente = clientesIterator.next();
            if ( (cliente.getNumeroConta().equals(numeroContaouChave)) || (cliente.mostrarChave().equals(numeroContaouChave))) {
                return cliente;
            }
        }
        throw new Exception("Conta não encontrada");
         
    }



    }
    
 
