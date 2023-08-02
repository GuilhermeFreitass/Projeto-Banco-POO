package pages.componentes;
import javax.swing.*;
public class ComponentePix extends JPanel {

    public ComponentePix(String nome, String icone) {
        initComponents(nome,icone);
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String nome, String icone) {

        componentePix1 = new JLabel();
        componentePix2 = new JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(173, 188, 187), 2, true));
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        componentePix1.setHorizontalAlignment(SwingConstants.CENTER);
        componentePix1.setIcon(new ImageIcon(getClass().getResource("/pages/icons/"+icone))); // NOI18N

        componentePix2.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        componentePix2.setHorizontalAlignment(SwingConstants.CENTER);
        componentePix2.setText(nome);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(componentePix1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(componentePix2, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(componentePix1)
                .addGap(18, 18, 18)
                .addComponent(componentePix2)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel componentePix1;
    private JLabel componentePix2;
    // End of variables declaration//GEN-END:variables
}
