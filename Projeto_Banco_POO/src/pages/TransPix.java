package pages;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import logic.Banco;
import logic.Conta;
import logic.Par;
import logic.SistemaBancos;
import pages.componentes.*;

public class TransPix extends javax.swing.JFrame {

    public TransPix() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaTotal = new javax.swing.JPanel();
        JPanel voltar = new Voltar("voltarV.png", 255,255, 255,"TransPix");
        JPanel menuEsq = new MenuLateral();
        chave = new InputFuncao("Chave do destinatário","Insira a chave");
        valor = new InputFuncao("Valor","Insira o valor");
        JPanel tituloTransPix = new TituloFuncao("Pix", "pix.png");
        JPanel botaoTransferir = new BotaoFuncao("Transferir");
     
        botaoTransferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    pixPagar(evt);
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
                        .addComponent(tituloTransPix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaTotalLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(botaoTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaTotalLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(telaTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        telaTotalLayout.setVerticalGroup(
            telaTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voltar)
                    .addComponent(tituloTransPix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
        new TransPix().setVisible(true);
    }


    private void pixPagar(java.awt.event.MouseEvent evt) throws Exception {//GEN-FIRST:event_jPanel2MouseClicked
       String chaveValor = chave.getValue();
       
       Double valorValor = Double.parseDouble(valor.getValue());
       Par infosDestino = SistemaBancos.encontrarChavePix(chaveValor);
       Conta destino = infosDestino.conta;
       Banco bancoDestino = infosDestino.banco;
      
       SistemaBancos.LoggedInUser.getConta().pagarComPix(valorValor,destino, bancoDestino);
       JOptionPane.showMessageDialog(this,"Pix realizado com sucesso" , "Sucesso", JOptionPane.INFORMATION_MESSAGE);
       this.dispose();
       Home home = new Home();
       home.setVisible(true);
 

}
    
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel telaTotal;
    private InputFuncao chave;
    private InputFuncao valor;
    // End of variables declaration//GEN-END:variables
}
