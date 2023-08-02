package logic;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

public class Cartao {
    private String numeroCartao;
    private String titularCartao;
    private String CVV;
    private String dataValidade;
    private double limiteCartao;


    public Cartao(String numeroCartao, String titularCartao) {
        dataValidade = pegarDataValidade();
        CVV = GeracaoRandom.gerarCVV();
        this.numeroCartao = numeroCartao;
        this.titularCartao = titularCartao.toUpperCase();
    }

    public void setLimite(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }
    public double getLimite() {
        return limiteCartao;
    }

    public String getTitular() {
        return titularCartao;
    }
    
    public String getCVV() {
        return CVV;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String geValidade() {
        return dataValidade;
    }
    
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    
    private String pegarDataValidade() {
        DateTimeFormatter dataFormato = DateTimeFormatter.ofPattern("MM/yy");  
        LocalDateTime dataAtual = LocalDateTime.now().plusYears(5);  

        return dataFormato.format(dataAtual);
    }
}

