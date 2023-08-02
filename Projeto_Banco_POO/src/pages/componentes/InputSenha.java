
package pages.componentes;
import javax.swing.*;

public class InputSenha extends JPanel {


    public InputSenha() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeTexto = new JLabel();
        linhaNumConta = new JSeparator();
        inputNumConta = new JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        nomeTexto.setBackground(new java.awt.Color(255, 255, 255));
        nomeTexto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomeTexto.setIcon(new ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        nomeTexto.setText("Senha");

        linhaNumConta.setForeground(new java.awt.Color(0, 0, 0));

        inputNumConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inputNumConta.setBorder(null);
      
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(linhaNumConta)
                    .addComponent(inputNumConta)
                    .addComponent(nomeTexto, GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nomeTexto)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNumConta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(linhaNumConta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField inputNumConta;
    private JSeparator linhaNumConta;
    private JLabel nomeTexto;
    // End of variables declaration//GEN-END:variables
}
