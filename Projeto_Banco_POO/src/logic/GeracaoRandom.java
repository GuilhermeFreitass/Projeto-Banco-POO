package logic;
import java.util.Random;

public class GeracaoRandom {
    
    public static String gerarNumeroCartao()   {
        Random value = new Random();
    String start = "";
    int count = 0;
    int n;
    for(int i =0; i < 16;i++)
    {
        if(count == 4)
        {
            start += " ";
            count =0;
        }
            n = value.nextInt(10);
            start += Integer.toString(n);
            count++;            

    }
    return start;
}


    public static String gerarNumeroConta() {
        String conta = "";
        Random value = new Random();
        for(int i =0; i < 8; i++) {
            conta += Integer.toString(value.nextInt(10));
        }
        conta += "-"+Integer.toString(value.nextInt(10));
        return conta;
    }

    public static String gerarCVV() {
        String cvv="";
        Random value = new Random();
        for(int i=0; i<3;i++) {
            cvv+= Integer.toString(value.nextInt(10));
        }
        return cvv;
    }
}