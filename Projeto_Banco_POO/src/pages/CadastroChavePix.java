package pages;

import javax.swing.*;

import logic.SistemaBancos;
import pages.componentes.*;

public class CadastroChavePix extends JFrame {

    public CadastroChavePix() {
        initComponents();
    }

   
                  
    private void initComponents() {

        JPanel menuEsq = new MenuLateral();
       
        telaTotal = new JPanel();
        JPanel tituloPix = new TituloFuncao("Pix", "pix.png");
        JPanel voltar = new Voltar("voltarV.png", 255,255, 255,"cadastroPix");
        textoMinhaChave = new JLabel();
        inputValor = new JTextField();
        chave = new JLabel();
        textoCadastreChave = new JLabel();
        JPanel botao = new BotaoFuncao("Cadastrar");
        botao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setChave(evt);
            }
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        inputValor.setBorder(BorderFactory.createCompoundBorder(
        inputValor.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        inputValor.setFont(new java.awt.Font("Segoe UI", 1, 30));
       
        telaTotal.setBackground(new java.awt.Color(255, 255, 255));
        textoMinhaChave.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        textoMinhaChave.setText("Minha chave:");

        chave.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        chave.setText(SistemaBancos.LoggedInUser.getConta().mostrarChave());

        
        textoCadastreChave.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        textoCadastreChave.setText("Cadastre sua chave");

        

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
                            .addGroup(telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(tituloPix, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputValor, GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                                .addGroup(telaTotalLayout.createSequentialGroup()
                                    .addComponent(textoMinhaChave)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(chave, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE))
                                .addComponent(textoCadastreChave, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(botao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        telaTotalLayout.setVerticalGroup(
            telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(telaTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltar)
                .addGap(4, 4, 4)
                .addComponent(tituloPix, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaTotalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(textoMinhaChave)
                    .addComponent(chave, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(textoCadastreChave)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputValor, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
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
            .addComponent(menuEsq, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(telaTotal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            )
        );

        setSize(new java.awt.Dimension(926, 570));
        setLocationRelativeTo(null);
    }                    

    public static void main(String args[]) {

        new CadastroChavePix().setVisible(true);
    }
 
    private void setChave(java.awt.event.MouseEvent evt) {
        String chaveValor = inputValor.getText();
        SistemaBancos.LoggedInUser.getConta().cadastrarChave(chaveValor);
        this.dispose();
        CadastroChavePix reload = new CadastroChavePix();
        reload.setVisible(true);

     }
 

    private JLabel chave;
    private JTextField inputValor;
    private JPanel telaTotal;
    private JLabel textoCadastreChave;
    private JLabel textoMinhaChave;
    // End of variables declaration                   
}
