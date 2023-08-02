
package pages.componentes;

import javax.swing.*;


public class TituloFuncao extends JPanel {

    public TituloFuncao(String nome, String icone) {
        initComponents(nome,icone);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String nome, String icone) {

        iconeFucao = new JLabel();
        texto = new JLabel();
        setBackground(new java.awt.Color(255, 255, 255));
        iconeFucao.setIcon(new ImageIcon(getClass().getResource("/pages/icons/"+icone))); // NOI18N
        texto.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        texto.setForeground(new java.awt.Color(34, 180, 167));
        texto.setText(nome);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconeFucao, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(texto)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(texto, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(iconeFucao, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel iconeFucao;
    private JLabel texto;
    // End of variables declaration//GEN-END:variables
}
