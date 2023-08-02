package pages.componentes;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

import logic.Transacao;


public class PainelTransferencias extends JPanel {
   private static final int PREF_W = 600;
   private static final int PREF_H = 400;
   private JPanel listContainer;
   

   public PainelTransferencias(ArrayList<Transacao> transacoes) {

    
      JPanel outerWrapperPanel = new JPanel(new BorderLayout());
   

      listContainer = new JPanel();
      listContainer.setLayout(new BoxLayout(listContainer, BoxLayout.Y_AXIS));
      outerWrapperPanel.add(listContainer, BorderLayout.PAGE_START);
      outerWrapperPanel.setBackground(new java.awt.Color(255, 255, 255));
    

    Iterator<Transacao> countriesIterator = transacoes.iterator();
   

    while(countriesIterator.hasNext()) {
      Transacao transcao = countriesIterator.next();
      listContainer.add(new TransferenciaComponente(transcao));
   }
     
   

      setLayout(new BorderLayout());
      add(new JScrollPane(outerWrapperPanel), BorderLayout.CENTER);
     
      
    
   }

   @Override
   public Dimension getPreferredSize() {
      if (isPreferredSizeSet()) {
         return super.getPreferredSize();
      }
      return new Dimension(PREF_W, PREF_H);
   }

   
   }

   



 
