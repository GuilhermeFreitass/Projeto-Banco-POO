package logic;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  


public class Transacao {
    private String destino;
    private String tipoTransacao;
    private boolean envio_Recebe; //ENVIO true, RECEBE false
    String data; 
    private double valor;

    public Transacao(double valor, String tipoTransacao, boolean envio_Recebe) {
        this.valor = valor;
        this.tipoTransacao = tipoTransacao;
        this.envio_Recebe = envio_Recebe;
        data = criarData();
    }
    public Transacao(String destino, double valor, String tipoTransacao, boolean envio_Recebe) {
        this.destino = destino;
        this.valor = valor;
        this.tipoTransacao = tipoTransacao;
        this.envio_Recebe = envio_Recebe;
        data = criarData();
    }

    

    public String getDestino() {
        return destino;
    }
    public double getValor() {
        return valor;
    }
    public String getData() {
        return data;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public boolean getEnvio_Recebe() {
        return envio_Recebe;
    }

    private String criarData() {
        DateTimeFormatter dataFormato = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");  
        LocalDateTime dataAtual = LocalDateTime.now();  
        return dataFormato.format(dataAtual);
    }

   


}
