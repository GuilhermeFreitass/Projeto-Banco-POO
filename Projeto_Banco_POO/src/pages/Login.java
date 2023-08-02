package pages;

import pages.componentes.*;
import javax.swing.*;

import logic.LoggedInUser;
import logic.SistemaBancos;


public class Login extends JFrame {

    public Login() {
        initComponents();

    }
  
    private void initComponents() {
        email = new Input("Email", "email.png");
        senha =  new Input("Senha","lock.png");
        JPanel sair = new Fechar( 34, 180, 167,255, 255, 255);

        telaBoasVindas = new JPanel();
        iconeBanco = new JLabel();
        textoBanco = new JLabel();
        textoBemvindoBanco = new JLabel();
        painelLogin = new JPanel();
       
        tituloLogin = new JLabel();
        textoBoasvindasLogin = new JLabel();
        naoConta = new JLabel();
        entrar = new JButton();
        criarConta = new JLabel();
    

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        telaBoasVindas.setBackground(new java.awt.Color(34, 180, 167));

        iconeBanco.setBackground(new java.awt.Color(23, 159, 211));
        iconeBanco.setForeground(new java.awt.Color(255, 255, 255));
        iconeBanco.setHorizontalAlignment(SwingConstants.CENTER);
        iconeBanco.setIcon(new ImageIcon(getClass().getResource("icons/bank.png"))); // NOI18N

        textoBanco.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textoBanco.setForeground(new java.awt.Color(255, 255, 255));
        textoBanco.setHorizontalAlignment(SwingConstants.CENTER);
        textoBanco.setText("Sistema Bancário");

        textoBemvindoBanco.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textoBemvindoBanco.setForeground(new java.awt.Color(255, 255, 255));
        textoBemvindoBanco.setHorizontalAlignment(SwingConstants.CENTER);
        textoBemvindoBanco.setText("Seja bem vindo!");

        GroupLayout telaBoasVindasLayout = new GroupLayout(telaBoasVindas);
        telaBoasVindas.setLayout(telaBoasVindasLayout);
        telaBoasVindasLayout.setHorizontalGroup(
            telaBoasVindasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(telaBoasVindasLayout.createSequentialGroup()
                .addGroup(telaBoasVindasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(telaBoasVindasLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(textoBanco, GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, telaBoasVindasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iconeBanco, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(telaBoasVindasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(telaBoasVindasLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(textoBemvindoBanco, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
        );
        telaBoasVindasLayout.setVerticalGroup(
            telaBoasVindasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, telaBoasVindasLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoBanco, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iconeBanco, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(telaBoasVindasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(telaBoasVindasLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(textoBemvindoBanco, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(463, Short.MAX_VALUE)))
        );

        painelLogin.setBackground(new java.awt.Color(255, 255, 255));
        tituloLogin.setBackground(new java.awt.Color(34, 180, 167));
        tituloLogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloLogin.setForeground(new java.awt.Color(34, 180, 167));
        tituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
        tituloLogin.setText("Login");
        tituloLogin.setVerticalAlignment(SwingConstants.TOP);

        textoBoasvindasLogin.setBackground(new java.awt.Color(34, 180, 167));
        textoBoasvindasLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoBoasvindasLogin.setHorizontalAlignment(SwingConstants.CENTER);
        textoBoasvindasLogin.setText("Bem vindo ao sistema");
        textoBoasvindasLogin.setVerticalAlignment(SwingConstants.TOP);

        naoConta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        naoConta.setHorizontalAlignment(SwingConstants.RIGHT);
        naoConta.setText("Nao tem uma conta?");

        entrar.setBackground(new java.awt.Color(34, 180, 167));
        entrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        entrar.setForeground(new java.awt.Color(255, 255, 255));
        entrar.setText("Entrar");
        entrar.setBorderPainted(false);
        entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrar.setFocusPainted(false);
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });

        criarConta.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        criarConta.setText("Crie aqui");
        criarConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        criarConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logar(evt);
            }
        });

    

        GroupLayout painelLoginLayout = new GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(tituloLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGroup(painelLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textoBoasvindasLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sair, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addContainerGap())
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(naoConta, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(criarConta, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(painelLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(senha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(entrar, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sair, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(tituloLogin)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoBoasvindasLogin)
                .addGap(26, 26, 26)
                .addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(senha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(entrar)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLoginLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(naoConta, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(criarConta, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(telaBoasVindas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(painelLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(telaBoasVindas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelLogin, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(926, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {
        String emailValor = email.getValue();
        String senhaValor = senha.getValue();
        try{
        LoggedInUser logon = SistemaBancos.logIn(emailValor, senhaValor);
        System.out.println(logon);
        Home home = new Home();
        this.dispose();
        home.setVisible(true);}

        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
     
    }


    private void logar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarContaMouseClicked
        TipoPessoa tipoPessoa = new TipoPessoa();
        this.dispose();
        tipoPessoa.setVisible(true);
    }
    public static void main(String args[]) {
        new Login().setVisible(true);
    }

    private Input email;
    private Input senha;
    private JLabel criarConta;
    private JButton entrar;
    private JLabel iconeBanco;
    private JLabel naoConta;
    private JPanel painelLogin;
    private JPanel telaBoasVindas;
    private JLabel textoBanco;
    private JLabel textoBemvindoBanco;
    private JLabel textoBoasvindasLogin;
    private JLabel tituloLogin;

}
