package pages;

import java.text.DecimalFormat;
import javax.swing.JPanel;
import logic.SistemaBancos;
import pages.componentes.*;


public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    private void initComponents() {
        JPanel menuEsq = new MenuLateral();
        JPanel ted = new FuncaoHome("Ted","cash-back.png");
        JPanel pix = new FuncaoHome("Pix","pix.png");
        JPanel extrato = new FuncaoHome("Extrato","extrato.png");
        JPanel cartao = new FuncaoHome("Cartão", "cartao.png");
        JPanel saque = new FuncaoHome("Saque", "saque.png");
        JPanel deposito = new FuncaoHome("Depósito", "real.png");
    
        fechar = new javax.swing.JLabel();
        telaTotal = new javax.swing.JPanel();
        carteiraIcone = new javax.swing.JLabel();
        saldo = new javax.swing.JLabel();
        nomeBanco = new javax.swing.JLabel();
        funcoes = new javax.swing.JPanel();


        fechar.setFont(new java.awt.Font("Segoe UI", 0, 36));
        fechar.setForeground(new java.awt.Color(34, 180, 167));
        fechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechar.setText("x");
        fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        telaTotal.setBackground(new java.awt.Color(255, 255, 255));

        carteiraIcone.setFont(new java.awt.Font("Segoe UI", 0, 32));
        carteiraIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/carteira (1) 1.png")));
        carteiraIcone.setText("R$");

        saldo.setFont(new java.awt.Font("Segoe UI", 1, 32));
        String saldoValor =new DecimalFormat("###,##0.00").format(SistemaBancos.LoggedInUser.getConta().getSaldo());
        saldo.setText(saldoValor);

        nomeBanco.setFont(new java.awt.Font("Segoe UI", 1, 32));
        nomeBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/bank (2) 1.png")));
        nomeBanco.setText(SistemaBancos.LoggedInUser.getBanco().getNome());

        funcoes.setBackground(new java.awt.Color(255, 255, 255));
        funcoes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(173, 188, 187), 2, true));
        funcoes.setForeground(new java.awt.Color(255, 255, 255));

       
        javax.swing.GroupLayout funcoesLayout = new javax.swing.GroupLayout(funcoes);
        funcoes.setLayout(funcoesLayout);
        funcoesLayout.setHorizontalGroup(
            funcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(funcoesLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(funcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ted, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(funcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(funcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        funcoesLayout.setVerticalGroup(
            funcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(funcoesLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(funcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(extrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ted, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(funcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saque, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(cartao, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(deposito, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout telaTotalLayout = new javax.swing.GroupLayout(telaTotal);
        telaTotal.setLayout(telaTotalLayout);
        telaTotalLayout.setHorizontalGroup(
            telaTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaTotalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(nomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60-10*(saldoValor.length()-7), 60-10*(saldoValor.length()-7), 60-10*(saldoValor.length()-7))
                .addComponent(carteiraIcone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saldo)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaTotalLayout.createSequentialGroup()
                .addContainerGap(2,2)
                .addComponent(funcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(6,6))
        );
        telaTotalLayout.setVerticalGroup(
            telaTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaTotalLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(telaTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carteiraIcone)
                    .addComponent(nomeBanco)
                    .addComponent(saldo))
                .addGap(18, 18, 18)
                .addComponent(funcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(menuEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(telaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuEsq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(telaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               )
        );

        setSize(new java.awt.Dimension(926, 570));
        setLocationRelativeTo(null);
    }
   
    public static void main(String args[]) {
        new Home().setVisible(true);
    }

   
    private javax.swing.JPanel funcoes;
    private javax.swing.JLabel carteiraIcone;
    private javax.swing.JLabel saldo;
    private javax.swing.JLabel nomeBanco;
    private javax.swing.JLabel fechar;
    private javax.swing.JPanel telaTotal;
    // End of variables declaration//GEN-END:variables
}
