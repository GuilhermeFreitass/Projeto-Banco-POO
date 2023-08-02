package pages;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import logic.*;
import pages.componentes.*;

public class Ted extends javax.swing.JFrame {

   
    public Ted() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

       
        telaTotal = new javax.swing.JPanel();
        JPanel voltar = new Voltar("voltarV.png", 255,255, 255,"ted");
        JPanel menuEsq = new MenuLateral();
        valor = new InputFuncao("Valor","Insira o valor da transferência");
        agenciaInput = new InputFuncao("Agencia","Insira a agencia");
        numeroContaInput = new InputFuncao("Numero da conta","Insira o numero da conta");
        JPanel tituloTed = new TituloFuncao("Ted", "ted.png");
        JPanel botaoTransferir = new BotaoFuncao("Transferir");
     

        botaoTransferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
             try {
                ted(evt);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

      

        telaTotal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout telaTotalLayout = new javax.swing.GroupLayout(telaTotal);
        telaTotal.setLayout(telaTotalLayout);
        telaTotalLayout.setHorizontalGroup(
            telaTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaTotalLayout.createSequentialGroup()
                .addGroup(telaTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaTotalLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(voltar)
                        .addGap(18, 18, 18)
                        .addComponent(tituloTed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaTotalLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(botaoTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaTotalLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(telaTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numeroContaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agenciaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        telaTotalLayout.setVerticalGroup(
            telaTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voltar)
                    .addComponent(tituloTed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numeroContaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agenciaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(botaoTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(menuEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(telaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuEsq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(telaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(926, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        new Ted().setVisible(true);
    }

    private void ted(java.awt.event.MouseEvent evt) throws Exception {
        String agenciaValor = agenciaInput.getValue();
        String numeroContaValor = numeroContaInput.getValue();
        Double valorValor = Double.parseDouble(valor.getValue()); 
        Conta contaDestino = SistemaBancos.encontrarConta(agenciaValor, numeroContaValor);
       
        SistemaBancos.LoggedInUser.getConta().transferenciaTed(contaDestino, valorValor);
        JOptionPane.showMessageDialog(this,"Ted realizado com sucesso" , "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        Home home = new Home();
        home.setVisible(true);
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
   
    private javax.swing.JPanel telaTotal;
    private InputFuncao valor;
    private InputFuncao agenciaInput;
    private InputFuncao numeroContaInput;
    // End of variables declaration//GEN-END:variables
}
