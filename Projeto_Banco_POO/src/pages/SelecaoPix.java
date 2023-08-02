package pages;
import javax.swing.*;

import pages.componentes.*;


public class SelecaoPix extends JFrame {

   
    public SelecaoPix() {
        initComponents();
    }


    private void initComponents() {
        JPanel menuEsq = new MenuLateral();
        JPanel transferir = new ComponentePix("Transferir","sendMoney.png");
        JPanel cadastroChave = new ComponentePix("Chave Pix","chavePix.png");
        JPanel pixTitulo = new TituloFuncao("PIX", "pixFuncao.png");
        JPanel voltar = new Voltar("voltarV.png", 255,255, 255,"selecaoPix");
        telaTotal = new JPanel();
        telaTotal.setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
    
         
        transferir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferirClicked(evt);
            }
        });

        cadastroChave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastroChave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroChaveClicked(evt);
            }
        });

           
    

        GroupLayout telaTotalLayout = new GroupLayout(telaTotal);
        telaTotal.setLayout(telaTotalLayout);
        telaTotalLayout.setHorizontalGroup(
            telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(telaTotalLayout.createSequentialGroup()
                .addGroup(telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(telaTotalLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(telaTotalLayout.createSequentialGroup()
                                .addComponent(transferir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(10,10, 10)
                                .addComponent(cadastroChave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addComponent(pixTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(telaTotalLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(voltar)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        telaTotalLayout.setVerticalGroup(
            telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, telaTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltar)
                .addGap(4, 4, 4)
                .addComponent(pixTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(transferir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroChave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(menuEsq, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(telaTotal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(menuEsq, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(telaTotal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            )
        );

        setSize(new java.awt.Dimension(926, 570));
        setLocationRelativeTo(null);
    }
    public static void main(String args[]) {
                new SelecaoPix().setVisible(true);
    }

    private void transferirClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarContaMouseClicked
        TransPix transPix = new TransPix();
        this.dispose();
        transPix.setVisible(true);
            }

    private void cadastroChaveClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarContaMouseClicked
        CadastroChavePix cadastroChavePix = new CadastroChavePix();
        this.dispose();
        cadastroChavePix.setVisible(true);
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel telaTotal;
    // End of variables declaration//GEN-END:variables
}
