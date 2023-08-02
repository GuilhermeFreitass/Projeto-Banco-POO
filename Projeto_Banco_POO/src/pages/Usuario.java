package pages;
import javax.swing.*;

import pages.componentes.*;

public class Usuario extends JFrame {

    public Usuario() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel menuEsq = new MenuLateral();
        telaTotal = new JPanel();
        JPanel voltar = new Voltar("voltarV.png", 255,255, 255,"usuario");
        tituloUsuario = new TituloFuncao("Usuário", "usuarioLogo.png");
        TituloInfoUsuario = new JLabel();
        JPanel UsuarioInfo = new UsuarioInfo();
    

        TituloInfoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        TituloInfoUsuario.setText("Informacões do usuário");

       
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        telaTotal.setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        
       
        GroupLayout telaTotalLayout = new GroupLayout(telaTotal);
        telaTotal.setLayout(telaTotalLayout);
        telaTotalLayout.setHorizontalGroup(
            telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(telaTotalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(TituloInfoUsuario, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
                    .addGroup(telaTotalLayout.createSequentialGroup()
                        .addComponent(voltar)
                        .addGap(18, 18, 18)
                        .addComponent(tituloUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(262, Short.MAX_VALUE))
            .addGroup(telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, telaTotalLayout.createSequentialGroup()
                    .addContainerGap(19, Short.MAX_VALUE)
                    .addComponent(UsuarioInfo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        telaTotalLayout.setVerticalGroup(
            telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, telaTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(voltar)
                    .addComponent(tituloUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TituloInfoUsuario, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, telaTotalLayout.createSequentialGroup()
                    .addContainerGap(212, Short.MAX_VALUE)
                    .addComponent(UsuarioInfo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(menuEsq, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(telaTotal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(telaTotal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(menuEsq, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(926, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
       
        new Usuario().setVisible(true);
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private JLabel TituloInfoUsuario;
    private JPanel telaTotal;
    private JPanel tituloUsuario;
    // End of variables declaration//GEN-END:variables
}
