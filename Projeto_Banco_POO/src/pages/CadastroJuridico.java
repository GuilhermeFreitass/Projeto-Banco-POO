package pages;
import javax.swing.*;

import logic.Banco;
import logic.ContaPJ;
import logic.SistemaBancos;
import pages.componentes.*;

public class CadastroJuridico extends JFrame {


    public CadastroJuridico() {
        initComponents();
    }


  
    private void initComponents() {
        JPanel sair = new Fechar(255, 255, 255, 34, 180, 167);
        JPanel voltar = new Voltar("voltarV.png", 255,255, 255,"juridico");
        nome = new Input("Nome","nome.png");
        email = new Input("Email","email.png");
        cnpj = new Input("CNPJ","user.png");
        senha =  new Input("Senha","lock.png");
        bancoSeletor = new Seletor();

        formLogin = new JPanel();
        Entrar = new JLabel();
        criarConta = new JButton();
    
        telaImagem = new JPanel();
        imagemGrande = new JLabel();
        textoCrieCadastro = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

    
      
        formLogin.setBackground(new java.awt.Color(255, 255, 255));
        Entrar.setBackground(new java.awt.Color(34, 180, 167));
        Entrar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Entrar.setForeground(new java.awt.Color(34, 180, 167));
        Entrar.setHorizontalAlignment(SwingConstants.CENTER);
        Entrar.setText("Cadastro");
        Entrar.setVerticalAlignment(SwingConstants.TOP);

       
        criarConta.setBackground(new java.awt.Color(34, 180, 167));
        criarConta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        criarConta.setForeground(new java.awt.Color(255, 255, 255));
        criarConta.setText("Criar");
        criarConta.setBorderPainted(false);
        criarConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        criarConta.setFocusPainted(false);
        criarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarContaPJ(evt);
            }
        });


        GroupLayout formLoginLayout = new GroupLayout(formLogin);
        formLogin.setLayout(formLoginLayout);
        formLoginLayout.setHorizontalGroup(
            formLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(formLoginLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(formLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(nome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpj, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(senha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(criarConta, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(formLoginLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(formLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(formLoginLayout.createSequentialGroup()
                        .addComponent(voltar)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(formLoginLayout.createSequentialGroup()
                        .addComponent(Entrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bancoSeletor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        formLoginLayout.setVerticalGroup(
            formLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(formLoginLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(voltar)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(Entrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bancoSeletor))
                .addGap(36, 36, 36)
                .addComponent(nome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cnpj, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(senha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(criarConta)
                .addGap(114, 114, 114))
        );

        telaImagem.setBackground(new java.awt.Color(34, 180, 167));

        imagemGrande.setBackground(new java.awt.Color(23, 159, 211));
        imagemGrande.setForeground(new java.awt.Color(255, 255, 255));
        imagemGrande.setHorizontalAlignment(SwingConstants.CENTER);
        imagemGrande.setIcon(new ImageIcon(getClass().getResource("icons/money-transfer.png"))); // NOI18N

        textoCrieCadastro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textoCrieCadastro.setForeground(new java.awt.Color(255, 255, 255));
        textoCrieCadastro.setHorizontalAlignment(SwingConstants.CENTER);
        textoCrieCadastro.setText("Crie seu cadastro");

        GroupLayout telaImagemLayout = new GroupLayout(telaImagem);
        telaImagem.setLayout(telaImagemLayout);
        telaImagemLayout.setHorizontalGroup(
            telaImagemLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, telaImagemLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(telaImagemLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(telaImagemLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(imagemGrande, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE))
                    .addComponent(textoCrieCadastro, GroupLayout.PREFERRED_SIZE, 403, GroupLayout.PREFERRED_SIZE))
                .addGap(332, 332, 332))
                .addGroup(telaImagemLayout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(sair)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        telaImagemLayout.setVerticalGroup(
            telaImagemLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(telaImagemLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(sair)
                .addGap(16, 16, 16)
                .addComponent(textoCrieCadastro, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(imagemGrande, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(telaImagem, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
             )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(formLogin, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(telaImagem, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(926, 570));
        setLocationRelativeTo(null);
    }

   
     
    private void criarContaPJ(java.awt.event.ActionEvent evt) {
        String nomeValor = nome.getValue();
        String cnpjValor = cnpj.getValue();
        String emailValor = email.getValue();
        String senhaValor =senha.getValue();
        String bancoNome = bancoSeletor.getValueSelector();

        Login login = new Login();
        ContaPJ conta = new ContaPJ(nomeValor,cnpjValor, senhaValor, emailValor);
        try {
            Banco banco = SistemaBancos.encontrarBanco(bancoNome);
            SistemaBancos.register(conta,banco);
            this.dispose();
            login.setVisible(true);
            JOptionPane.showMessageDialog(this,"Cadastro Jurídica realizado com sucesso" , "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

        }
  
    }
    public static void main(String args[]) {
   
        new CadastroJuridico().setVisible(true);
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Input nome;
    private Seletor bancoSeletor;
    private Input email;
    private Input cnpj;
    private Input senha;
    private JLabel Entrar;
    private JButton criarConta;
    private JLabel imagemGrande;
    private JLabel textoCrieCadastro;
    private JPanel formLogin;
    private JPanel telaImagem;
    // End of variables declaration//GEN-END:variables
}
