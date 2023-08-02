package tests.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import logic.*;

public class BancoTest {
    @Test
    public void contaAchadaSucesso() throws Exception {
        Banco banco1 = new Banco("bancoTeste", "00", 20);
        ContaPF usuarioTest = new ContaPF("Luffy","12384281241","123","luffy@banco.com","28/11/2002");
        banco1.addInBank(usuarioTest);
        Conta contaAchada = banco1.encontrarConta("luffy@banco.com");

        assertEquals(usuarioTest,contaAchada);
    }

    @Test
    public void contaNaoEncontrada() throws Exception {
        Banco banco1 = new Banco("bancoTeste", "00", 20);
        ContaPF usuarioTest = new ContaPF("Luffy","12384281241","123","luffy@banco.com","28/11/2002");
        banco1.addInBank(usuarioTest);
    
        Exception exception = assertThrows(
            Exception.class,
            () ->  banco1.encontrarConta("dfideliz"));

    assertEquals("Conta não encontrada", exception.getMessage());
    }

    @Test
    public void adicionandoContaDuasVezes() throws Exception {
        Banco banco1 = new Banco("bancoTeste", "00", 20);
        ContaPF usuarioTest = new ContaPF("Luffy","12384281241","123","luffy@banco.com","28/11/2002");
        banco1.addInBank(usuarioTest);
    
        Exception exception = assertThrows(
            Exception.class,
            () ->  
            banco1.addInBank(usuarioTest));

    assertEquals("Conta já existe", exception.getMessage());
    }

    @Test
    public void adicionadoComSucesso() throws Exception {
        Banco banco1 = new Banco("bancoTeste", "00", 20);
        ContaPF usuarioTest = new ContaPF("Luffy","12384281241","123","luffy@banco.com","28/11/2002");
        try {
        banco1.addInBank(usuarioTest);
        }
        catch(Exception e) {
            fail("Falhou");
        }
        
}
}