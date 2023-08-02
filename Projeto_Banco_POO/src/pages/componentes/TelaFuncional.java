package pages.componentes;


import javax.swing.*;

import logic.SistemaBancos;
import pages.Home;


// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
public class TelaFuncional extends JPanel {

    public TelaFuncional(String nome, String icone, String nomeBotao,String descricao) {
        initComponents(nome,icone,nomeBotao,descricao);
    }

  
 
    private void initComponents(String nome, String icone, String nomeBotao,String descricao) {

        telaTotal = new JPanel();
        JPanel tituloFuncao = new TituloFuncao(nome, icone);
        

        JPanel voltar = new Voltar("voltarV.png", 255,255, 255,"tela"+nome);
        textoTransferencia = new JLabel();
        inputValor = new JTextField();
        JPanel botaoTransferencia = new BotaoFuncao(nomeBotao);


        voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
   
        telaTotal.setBackground(new java.awt.Color(255, 255, 255));

        inputValor.setBorder(BorderFactory.createCompoundBorder(
        inputValor.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        inputValor.setFont(new java.awt.Font("Segoe UI", 1, 30));

     
        textoTransferencia.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        textoTransferencia.setHorizontalAlignment(SwingConstants.CENTER);
        textoTransferencia.setText(descricao);       

        botaoTransferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
             try {
                operacao(evt, nome);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            }
        });

        GroupLayout telaTotalLayout = new GroupLayout(telaTotal);
        telaTotal.setLayout(telaTotalLayout);
        telaTotalLayout.setHorizontalGroup(
            telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(telaTotalLayout.createSequentialGroup()
                .addGroup(telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(telaTotalLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(voltar))
                    .addGroup(telaTotalLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(botaoTransferencia, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                            .addGroup(telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(textoTransferencia, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tituloFuncao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputValor)))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        telaTotalLayout.setVerticalGroup(
            telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, telaTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltar)
                .addGap(4, 4, 4)
                .addComponent(tituloFuncao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoTransferencia)
                .addGap(44, 44, 44)
                .addComponent(inputValor, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(botaoTransferencia, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(telaTotal, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(telaTotal, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void operacao(java.awt.event.MouseEvent evt, String tela) throws Exception {
        Double valor = Double.parseDouble(inputValor.getText()); 
        Home home;
        switch(tela){
            case "Depósito":
                SistemaBancos.LoggedInUser.getConta().deposito(valor);
                JOptionPane.showMessageDialog(this,"Depósito realizado com sucesso" , "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                home = new Home();
                SwingUtilities.getWindowAncestor(this).dispose();
                home.setVisible(true);
               
    
                break;
            case "Saque":
                SistemaBancos.LoggedInUser.getConta().saque(valor);
                JOptionPane.showMessageDialog(this,"Saque realizado com sucesso" , "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                home = new Home();
                SwingUtilities.getWindowAncestor(this).dispose();
                home.setVisible(true);
             
                break;
                }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField inputValor;
    private JPanel telaTotal;
    private JLabel textoTransferencia;
    // End of variables declaration//GEN-END:variables
}
