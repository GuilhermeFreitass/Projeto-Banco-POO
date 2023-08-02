package pages;

import pages.componentes.Fechar;
import pages.componentes.Voltar;

import javax.swing.*;

public class TipoPessoa extends JFrame {

 
    public TipoPessoa() {
        initComponents();
    }

    private void initComponents() {

        container = new JPanel();
        JPanel voltar = new Voltar("voltarB.png",34, 180, 167, "tipoPessoa");
        porcoIcone = new JLabel();
        titulo = new JLabel();
        jPanel2 = new JPanel();
        jLabel4 = new JLabel();
        jLabel10 = new JLabel();
        jPanel4 = new JPanel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        JPanel sair = new Fechar(255, 255, 255, 34, 180, 167);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        container.setBackground(new java.awt.Color(34, 180, 167));
        porcoIcone.setIcon(new ImageIcon(getClass().getResource("icons/piggy-bank.png"))); // NOI18N

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Escolha seu tipo de conta");

        jPanel2.setBackground(new java.awt.Color(34, 180, 167));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.setForeground(new java.awt.Color(34, 180, 167));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setIcon(new ImageIcon(getClass().getResource("icons/balance.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel10.setText("Pessoa Jurídica");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(199, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(14, 14, 14)))
        );

        jPanel4.setBackground(new java.awt.Color(34, 180, 167));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel4.setForeground(new java.awt.Color(34, 180, 167));
        jPanel4.setToolTipText("");
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel11.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel11.setIcon(new ImageIcon(getClass().getResource("icons/user (1) 3.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel12.setText("Pessoa Física");

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(213, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(14, 14, 14)))
        );


        GroupLayout containerLayout = new GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(voltar, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(145, Short.MAX_VALUE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(porcoIcone, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
                        .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(containerLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(titulo, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sair)
                                .addGap(35, 35, 35))))))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(containerLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(voltar))
                            .addGroup(containerLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(sair, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addComponent(titulo, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(porcoIcone, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(container, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(container, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        setSize(new java.awt.Dimension(926, 570));
        setLocationRelativeTo(null);
    }
    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {
              CadastroJuridico cadastroPJ = new CadastroJuridico();   
              cadastroPJ.setVisible(true);}

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {
          Cadastro cadastroPF = new Cadastro();
          this.dispose();
          cadastroPF.setVisible(true);
    }

    public static void main(String args[]) {
                new TipoPessoa().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel container;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel4;
    private JPanel jPanel2;
    private JPanel jPanel4;
    private JLabel porcoIcone;
    private JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
