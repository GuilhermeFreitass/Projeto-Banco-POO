
package pages.componentes;

import javax.swing.*;


public class BotaoFuncao extends JPanel {

   
    public BotaoFuncao(String nome) {
        initComponents(nome);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String nome) {

        jLabel1 = new JLabel();

        setBackground(new java.awt.Color(34, 180, 167));
        setForeground(new java.awt.Color(34, 180, 167));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText(nome);

        this.setCursor( new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
