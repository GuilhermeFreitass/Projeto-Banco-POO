package pages.componentes;

import javax.swing.SwingUtilities;

import pages.*;
import pages.SelecaoPix;


public class FuncaoHome extends javax.swing.JPanel {

   
    public FuncaoHome(String nome, String nomeIcone) {
        initComponents(nome, nomeIcone);
    }

  // <editor-fold defaultstate="collapsed" desc="Generapainel Code">//GEN-BEGIN:initComponents

    private void initComponents(String nome, String nomeIcone) {

        painel = new javax.swing.JPanel();
        iconeFuncao = new javax.swing.JLabel();
        textoFuncao = new javax.swing.JLabel();

        painel.setBackground(new java.awt.Color(255, 255, 255));
        painel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(173, 188, 187), 2, true));
        painel.setPreferredSize(new java.awt.Dimension(150, 150));

        iconeFuncao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconeFuncao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages/icons/"+nomeIcone))); // NOI18N
     
        iconeFuncao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoFuncao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoFuncao.setText(nome);

        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setTela(evt,nome);
            }
            
        });
       

        this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoFuncao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(iconeFuncao, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(iconeFuncao,javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoFuncao)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }

    private void setTela(java.awt.event.MouseEvent evt, String nome) {
       switch(nome){
        case "Ted":
            Ted painel = new Ted();
            SwingUtilities.getWindowAncestor(this).dispose();
            painel.setVisible(true);
           break;
        case "Pix":
            SelecaoPix pix = new SelecaoPix();
            SwingUtilities.getWindowAncestor(this).dispose();
            pix.setVisible(true);
            break;
        case "Extrato":
            Extrato extrato = new Extrato();
            SwingUtilities.getWindowAncestor(this).dispose();
            extrato.setVisible(true);
            break;
        case "Saque":
            Saque saque = new Saque();
            SwingUtilities.getWindowAncestor(this).dispose();
            saque.setVisible(true);
            break;
        
        case "Depósito":
            Deposito deposito = new Deposito();
            SwingUtilities.getWindowAncestor(this).dispose();
            deposito.setVisible(true);
            break;
        case "Cartão":
            Cartao cartao = new Cartao();
            SwingUtilities.getWindowAncestor(this).dispose();
            cartao.setVisible(true);
            break;
        
        default:
            Home k = new Home();
            SwingUtilities.getWindowAncestor(this).dispose();
            k.setVisible(true);
            break;

       }
    
    }

  // </editor-fold>//GEN-END:initComponents
 
  // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconeFuncao;
    private javax.swing.JLabel textoFuncao;
    private javax.swing.JPanel painel;
// End of variables declaration//GEN-END:variables
}
