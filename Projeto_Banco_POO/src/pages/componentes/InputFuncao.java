package pages.componentes;

import javax.swing.BorderFactory;

public class InputFuncao extends javax.swing.JPanel {

   
    public InputFuncao(String texto,String placeholder) {
        initComponents(texto,placeholder);
    }

    public String getValue(){
        return inputComponente.getText();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String texto, String placeholder) {
        inputComponente = new javax.swing.JTextField();
        titulodoInput = new javax.swing.JLabel();


        inputComponente.setFont(new java.awt.Font("Segoe UI", 0, 18));
        inputComponente.setForeground(new java.awt.Color(137, 135, 135));
        setBackground(new java.awt.Color(255, 255, 255));
        inputComponente.setText(placeholder);
       
      
        
        inputComponente.setBorder(BorderFactory.createCompoundBorder(
            inputComponente.getBorder(), 
            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        
       
        inputComponente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputComponenteFocusGained(evt,placeholder);
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                inputComponenteFocusLost(evt,placeholder);
            }
        });
       

        titulodoInput.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulodoInput.setText(texto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titulodoInput))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titulodoInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

  

    private void inputComponenteFocusGained(java.awt.event.FocusEvent evt,String placeholder) {//GEN-FIRST:event_inputComponenteActionPerformed
        if (inputComponente.getText().equals(placeholder)){
            inputComponente.setText("");
            inputComponente.setForeground(new java.awt.Color(0, 0, 0));
            inputComponente.setFont(new java.awt.Font("Segoe UI", 1, 30));
            
        }
    }//GEN-LAST:event_inputComponenteActionPerformed

    private void inputComponenteFocusLost(java.awt.event.FocusEvent evt,String placeholder) {//GEN-FIRST:event_inputComponenteActionPerformed
        if (inputComponente.getText().equals("")){
            inputComponente.setText(placeholder);
            inputComponente.setFont(new java.awt.Font("Segoe UI", 0, 18));
            inputComponente.setForeground(new java.awt.Color(137, 135, 135));
        }
    }//GEN-LAST:event_inputComponenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel titulodoInput;
    private javax.swing.JTextField inputComponente;
    // End of variables declaration//GEN-END:variables
}