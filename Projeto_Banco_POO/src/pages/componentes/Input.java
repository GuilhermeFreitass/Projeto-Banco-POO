package pages.componentes;

import javax.swing.*;
import javax.swing.text.*;

import java.text.ParseException;

public class Input extends JPanel {

   
    public Input(String nome, String icone) {
        initComponents(nome,icone);
        formatar(nome);
    }

    public String getValue(){
        return inputNumConta.getText();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String nome,String icone) {

        nomeTexto = new JLabel();
        linhaNumConta = new JSeparator();
        inputNumConta = new JFormattedTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        nomeTexto.setBackground(new java.awt.Color(255, 255, 255));
        nomeTexto.setFont(new java.awt.Font("Segoe UI", 0, 18));
        nomeTexto.setIcon(new ImageIcon(getClass().getResource("/pages/icons/"+icone))); // NOI18N
        nomeTexto.setText(nome);


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
                .addGap(0, 12, Short.MAX_VALUE))
        );
    }

    private void formatar(String campo) {
        try {
        MaskFormatter mask = new MaskFormatter("##/##/####");
        if(campo == "Data de nascimento"){
        mask.install(inputNumConta);}
        }
        catch(ParseException e) {

        }
    }

    
    
   
      // </editor-fold>//GEN-END:initComponents
      // Variables declaration - do not modify//GEN-BEGIN:variables
    private JFormattedTextField inputNumConta;
    private JSeparator linhaNumConta;
    private JLabel nomeTexto;
    // End of variables declaration//GEN-END:variables
}


