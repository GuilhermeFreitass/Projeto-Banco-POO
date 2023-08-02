package tests.logic;

import static org.junit.Assert.*;

import org.junit.*;

import logic.Banco;
import logic.ContaPF;
import logic.LoggedInUser;
import logic.SistemaBancos;



public class SistemaBancosTest {
    @Test
    public void logInSemExistir() throws Exception {
        Exception exception = assertThrows(
            Exception.class,
            () ->  SistemaBancos.logIn("naoexiste@nao.com", "0101"));;

            assertEquals("Usuario nao existe", exception.getMessage());
    }

    @Test
    public void logInSucesso() throws Exception {
        Banco banco1 = new Banco("bancoTeste", "00", 20);
        ContaPF usuarioTest = new ContaPF("Luffy","12384281241","123","luffy@banco.com","28/11/2002");
        SistemaBancos.register(usuarioTest, banco1);
        LoggedInUser logado = SistemaBancos.logIn(usuarioTest.getEmail(), usuarioTest.getSenha());
        assertEquals(usuarioTest.getEmail(), logado.getConta().getEmail());
    }

    @Test
    public void bancoExiste() throws Exception {
        Banco banco = new Banco("bancoTeste", "00", 10);
        SistemaBancos.add(banco);
        boolean achou = SistemaBancos.checkBanco(banco.getAgencia());
        assertEquals(true, achou);
    }

    @Test
    public void bancoNaoExiste() throws Exception {
        Banco banco = new Banco("bancoTeste", "00", 10);
        boolean achou = SistemaBancos.checkBanco(banco.getAgencia());
        assertEquals(false, achou);
    }

}