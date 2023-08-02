package tests.logic;

import static org.junit.Assert.*;

import org.junit.*;

import logic.Banco;
import logic.ContaPJ;



public class ContaPJTest {


    @Test
    public void depositoSucesso() throws Exception {
        ContaPJ usuarioTest = new ContaPJ("Luffy","12384281241","123","luffy@banco.com");
        usuarioTest.setSaldo(100);
        usuarioTest.deposito(200);
        assertEquals(300,usuarioTest.getSaldo(),0.2);
    }

    @Test
    public void pixComTaxa() throws Exception {
        ContaPJ usuarioTest = new ContaPJ("Luffy","12384281241","123","luffy@banco.com");
        ContaPJ destino = new ContaPJ("Zoro","91384281241","1234","zoro@banco.com");
        usuarioTest.setSaldo(30);
        destino.setSaldo(0);
        Banco banco1 = new Banco("banco1", "00", 10);
        banco1.addInBank(usuarioTest);
        Banco banco2 = new Banco("banco2", "25", 2);
        banco2.addInBank(destino);
        usuarioTest.pagarComPix(20, destino, banco2);
        assertEquals(9.6, usuarioTest.getSaldo(),0.2);
        assertEquals(20, destino.getSaldo(),0.2);
    }


    @Test
    public void saqueExcedido() throws Exception {
        ContaPJ usuarioTest = new ContaPJ("Luffy","12384281241","123","luffy@banco.com");
        usuarioTest.setSaldo(900);
        Exception exception = assertThrows(
                Exception.class,
                () -> usuarioTest.saque(1500));

        assertEquals("Você não tem dinheiro suficiente", exception.getMessage());
    }

    @Test
    public void saqueSucesso() throws Exception {
        ContaPJ usuarioTest = new ContaPJ("Luffy","12384281241","123","luffy@banco.com");
        usuarioTest.setSaldo(900);
        usuarioTest.saque(500);
        assertEquals(400, usuarioTest.getSaldo(),0.2);
}
    @Test
    public void transferenciaSucesso() throws Exception {
        ContaPJ usuarioTest = new ContaPJ("Luffy","12384281241","123","luffy@banco.com");
        ContaPJ destino = new ContaPJ("Zoro","91384281241","1234","zoro@banco.com");
        usuarioTest.setSaldo(30);
        destino.setSaldo(0);
        Banco banco1 = new Banco("banco1", "00", 2);
        banco1.addInBank(usuarioTest);
        Banco banco2 = new Banco("banco2", "25", 2);
        banco2.addInBank(destino);
        usuarioTest.transferenciaTed(destino, 20);
        assertEquals(10, usuarioTest.getSaldo(),0.2);
        assertEquals(20, destino.getSaldo(),0.2);

    }




}