

import logic.Banco;
import logic.ContaPF;
import logic.ContaPJ;
import logic.SistemaBancos;
import pages.Login;

public class Main{
    public static void main(String[] args) throws Exception {
            
                new Login().setVisible(true);
    
        Banco banese = new Banco("Banco 0", "033", 3);
        Banco brad = new Banco("Banco 1", "237", 3);
        Banco itau = new Banco("Banco 2", "0500", 3);
        SistemaBancos.add(banese);
        SistemaBancos.add(brad);
        SistemaBancos.add(itau);

        ContaPF victor = new ContaPF("Victor Chagas","01234567891","123","victor@banco0.com","28/11/2002");
        ContaPF gui = new ContaPF("Guilherme Argolo","01234564391","0101","gui@banco1.com","24/02/2002");
        ContaPJ comicBook = new ContaPJ("Comic Store Book", "03.778.130/0001-48", "gibi12", "comic@banco2.com");
       
        System.out.println(victor.getNumeroConta());
        System.out.println(gui.getNumeroConta());
        System.out.println(comicBook.getNumeroConta());
      
        SistemaBancos.register(victor, banese);
        SistemaBancos.register(gui, itau);
        SistemaBancos.register(comicBook, brad);
            
    }
}
    

       
        