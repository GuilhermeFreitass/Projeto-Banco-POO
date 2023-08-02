
package pages.componentes;

import javax.swing.*;

import pages.*;

public class Voltar extends JPanel {

  
    public Voltar(String icone,int r, int g, int b, String tela) {
        initComponents(icone,r,g,b,tela);
    }

   


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String icone,int r, int g, int b, String tela) {

        sair = new JLabel();
        setBackground(new java.awt.Color(r,g,b));
        sair.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        sair.setForeground(new java.awt.Color(34, 180, 167));
        sair.setHorizontalAlignment(SwingConstants.CENTER);
        sair.setIcon(new ImageIcon(getClass().getResource("/pages/icons/"+icone))); // NOI18N
        
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltar(evt,tela);
            }
        });

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(sair)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(sair, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        );

        sair.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents


    
    private void voltar(java.awt.event.MouseEvent evt,String tela) {//GEN-FIRST:event_criarContaMouseClicked
        switch(tela){
            case "TransPix":
            case "cadastroPix":
                SelecaoPix pix = new SelecaoPix();
                SwingUtilities.getWindowAncestor(this).dispose();
                pix.setVisible(true);
                break;
            case "cadastro":
            case "juridico":
                TipoPessoa tipoPessoa = new TipoPessoa();
                SwingUtilities.getWindowAncestor(this).dispose();
                tipoPessoa.setVisible(true);
                break;
            case "tipoPessoa":
                Login login = new Login();
                SwingUtilities.getWindowAncestor(this).dispose();
                login.setVisible(true);
                break;
            default:
                Home home = new Home();
                SwingUtilities.getWindowAncestor(this).dispose();
                home.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel sair;
    // End of variables declaration//GEN-END:variables
}
