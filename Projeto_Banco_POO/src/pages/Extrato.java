package pages;

import pages.componentes.*;
import javax.swing.*;
import logic.SistemaBancos;


public class Extrato extends javax.swing.JFrame {

    public Extrato() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuLateral menuEsq = new MenuLateral();
        telaTotal = new javax.swing.JPanel();
        tituloFuncao = new TituloFuncao("Extrato", "extrato.png");
        voltar = new Voltar("voltarV.png",255, 255, 255,"Extrato");
        jPanel1 = new PainelTransferencias(SistemaBancos.LoggedInUser.getConta().getTransacoes());
       
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
                        .addGap(37, 37, 37)
                        .addComponent(tituloFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaTotalLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(telaTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(voltar))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        telaTotalLayout.setVerticalGroup(
            telaTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltar)
                .addGap(4, 4, 4)
                .addComponent(tituloFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(telaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               )
        );

        setSize(new java.awt.Dimension(926, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        new Extrato().setVisible(true);
    }


  
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel voltar;
    PainelTransferencias jPanel1;
    private javax.swing.JPanel tituloFuncao;
    private javax.swing.JPanel telaTotal;
    // End of variables declaration//GEN-END:variables
}
