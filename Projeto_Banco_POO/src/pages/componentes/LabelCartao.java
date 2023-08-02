package pages.componentes;
import javax.swing.*;

public class LabelCartao extends JPanel {

   
    public LabelCartao(String titulo, String valorDinamico) {
        initComponents(titulo,valorDinamico);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String titulo, String valorDinamico) {

        ComponenteCartao = new JPanel();
        jLabel2 = new JLabel();
        jLabel1 = new JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        ComponenteCartao.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(34, 180, 167));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText(titulo+":");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText(valorDinamico);

        GroupLayout ComponenteCartaoLayout = new GroupLayout(ComponenteCartao);
        ComponenteCartao.setLayout(ComponenteCartaoLayout);
        ComponenteCartaoLayout.setHorizontalGroup(
            ComponenteCartaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(ComponenteCartaoLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ComponenteCartaoLayout.setVerticalGroup(
            ComponenteCartaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, ComponenteCartaoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ComponenteCartao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(ComponenteCartao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel ComponenteCartao;
    private JLabel jLabel1;
    private JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
