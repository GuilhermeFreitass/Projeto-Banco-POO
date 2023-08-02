
package pages.componentes;

import javax.swing.*;

public class Fechar extends JPanel {

  
    public Fechar(int r,int g,int b, int r1, int g1, int b1) {
        initComponents(r,g,b,r1,g1,b1);
    }


    private void initComponents(int r,int g,int b, int r1, int g1, int b1) {

        sair = new JLabel();
        sair.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        sair.setForeground(new java.awt.Color(r,g,b));
        setBackground(new java.awt.Color(r1,g1,b1));
        sair.setHorizontalAlignment(SwingConstants.CENTER);
        sair.setText("x");
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
       
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechar(evt);
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
    }// </editor-fold>//GEN-END:initComponents

    private void fechar(java.awt.event.MouseEvent evt) {
        SwingUtilities.getWindowAncestor(this).dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel sair;
    // End of variables declaration//GEN-END:variables
}
