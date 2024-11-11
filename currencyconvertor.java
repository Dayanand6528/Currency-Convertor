
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


     class Currencyconvert extends JFrame{
        public Currencyconvert()
        {
       JFrame frame=new JFrame("Currency Convertor");
       frame.setSize(500,200);
       frame.setBackground(Color.darkGray);
       frame.setForeground(Color.white);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(new GridLayout(5,2));
     

       JLabel fromlabel=new JLabel("     From");
       JLabel tolabel=new JLabel("     To");
       JLabel Amountlabel=new JLabel("     Amount");
       JLabel Resultlabel=new JLabel("     Result");
       String currency[]={"USD","INR", "EUR", "GBP","CAD","CNY","EGP","JOD","PKR","QAR","TWD"};
       JComboBox<String> Fromcurrency= new JComboBox<>(currency);
       JComboBox<String> Tocurrency= new JComboBox<>(currency);

       JTextField amountfield =new JTextField(20);
       JTextField resultfield =new JTextField(20);
      
       JButton Convert=new JButton("Convert"); 
       Convert.addActionListener(new ActionListener(){
        
          @Override
          public void actionPerformed(ActionEvent e) { 
            if(e.getSource()==Convert)
               Convert.setBackground(Color.lightGray);
               Convert.setForeground(Color.WHITE);
            
          String from= (String) Fromcurrency.getSelectedItem();
          String to= (String) Tocurrency.getSelectedItem();
          double amount=Double.parseDouble(amountfield.getText());
          double result=amount*getConvertRate(from,to);
          resultfield.setText(String.valueOf(result));


        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("KUCH TOH GADBAD HUI HAI BHAI");
    }

    private double getConvertRate(String from, String to) {
       
        if (from.equals("USD") && to.equals("EUR")) return 0.92; 
        if (from.equals("USD") && to.equals("INR")) return 84.07; 
        if (from.equals("USD") && to.equals("GBP")) return 0.76; 
        if (from.equals("USD") && to.equals("CAD")) return 1.39; 
        if (from.equals("USD") && to.equals("CNY")) return 7.11; 
        if (from.equals("USD") && to.equals("EGP")) return 48.98; 
        if (from.equals("USD") && to.equals("JOD")) return 0.709; 
        if (from.equals("USD") && to.equals("PKR")) return 277.65; 
        if (from.equals("USD") && to.equals("QAR")) return 3.64; 
        if (from.equals("USD") && to.equals("TWD")) return 31.96;

        if (from.equals("INR") && to.equals("USD")) return 0.011;
        if (from.equals("INR") && to.equals("EUR")) return 0.01; 
        if (from.equals("INR") && to.equals("GBP")) return 0.009; 
        if (from.equals("INR") && to.equals("CAD")) return 0.016; 
        if (from.equals("INR") && to.equals("CNY")) return 0.084; 
        if (from.equals("INR") && to.equals("EGP")) return 0.58; 
        if (from.equals("INR") && to.equals("JOD")) return 0.008; 
        if (from.equals("INR") && to.equals("PKR")) return 3.30; 
        if (from.equals("INR") && to.equals("QAR")) return 0.04; 
        if (from.equals("INR") && to.equals("TWD")) return 0.38;

        if (from.equals("EUR") && to.equals("USD")) return 1.08; 
        if (from.equals("EUR") && to.equals("INR")) return 91.34; 
        if (from.equals("EUR") && to.equals("GBP")) return 0.83; 
        if (from.equals("EUR") && to.equals("CAD")) return 1.51; 
        if (from.equals("EUR") && to.equals("CNY")) return 7.73; 
        if (from.equals("EUR") && to.equals("EGP")) return 53.18; 
        if (from.equals("EUR") && to.equals("JOD")) return 0.77; 
        if (from.equals("EUR") && to.equals("PKR")) return 301.59; 
        if (from.equals("EUR") && to.equals("QAR")) return 3.95; 
        if (from.equals("EUR") && to.equals("TWD")) return 34.71; 

        if (from.equals("GBP") && to.equals("USD")) return 1.29; 
        if (from.equals("GBP") && to.equals("EUR")) return 1.19; 
        if (from.equals("GBP") && to.equals("INR")) return 109.10; 
        if (from.equals("GBP") && to.equals("CAD")) return 1.80; 
        if (from.equals("GBP") && to.equals("CNY")) return 9.23; 
        if (from.equals("GBP") && to.equals("EGP")) return 63.52; 
        if (from.equals("GBP") && to.equals("JOD")) return 0.92; 
        if (from.equals("GBP") && to.equals("PKR")) return 360.34; 
        if (from.equals("GBP") && to.equals("QAR")) return 4.72; 
        if (from.equals("GBP") && to.equals("TWD")) return 41.46;

        if (from.equals("CAD") && to.equals("USD")) return 0.71; 
        if (from.equals("CAD") && to.equals("EUR")) return 0.66; 
        if (from.equals("CAD") && to.equals("INR")) return 60.40; 
        if (from.equals("CAD") && to.equals("GBP")) return 0.55; 
        if (from.equals("CAD") && to.equals("CNY")) return 5.11; 
        if (from.equals("CAD") && to.equals("EGP")) return 35.18; 
        if (from.equals("CAD") && to.equals("JOD")) return 0.509; 
        if (from.equals("CAD") && to.equals("PKR")) return 199.49; 
        if (from.equals("CAD") && to.equals("QAR")) return 2.60; 
        if (from.equals("CAD") && to.equals("TWD")) return 22.95;

        if (from.equals("CNY") && to.equals("USD")) return 0.41; 
        if (from.equals("CNY") && to.equals("EUR")) return 0.12; 
        if (from.equals("CNY") && to.equals("INR")) return 11.80; 
        if (from.equals("CNY") && to.equals("GBP")) return 0.10; 
        if (from.equals("CNY") && to.equals("CAD")) return 0.19; 
        if (from.equals("CNY") && to.equals("EGP")) return 6.87; 
        if (from.equals("CNY") && to.equals("JOD")) return 0.099; 
        if (from.equals("CNY") && to.equals("PKR")) return 38.98; 
        if (from.equals("CNY") && to.equals("QAR")) return 0.51; 
        if (from.equals("CNY") && to.equals("TWD")) return 4.48;

        if (from.equals("EGP") && to.equals("USD")) return 0.02; 
        if (from.equals("EGP") && to.equals("EUR")) return 0.018; 
        if (from.equals("EGP") && to.equals("INR")) return 1.71; 
        if (from.equals("EGP") && to.equals("GBP")) return 0.01; 
        if (from.equals("EGP") && to.equals("CAD")) return 0.02; 
        if (from.equals("EGP") && to.equals("CNY")) return 0.14; 
        if (from.equals("EGP") && to.equals("JOD")) return 0.014; 
        if (from.equals("EGP") && to.equals("PKR")) return 5.66; 
        if (from.equals("EGP") && to.equals("QAR")) return 0.07; 
        if (from.equals("EGP") && to.equals("TWD")) return 0.65;



        // Add more conversions as needed 
        return 1;
        
    }
});

 frame.add(fromlabel);
 frame.add(Fromcurrency);
 frame.add(tolabel);
 frame.add(Tocurrency); 
 frame.add(Amountlabel); 
 frame.add(amountfield);
 frame.add(Resultlabel); 
 frame.add(resultfield);
 
  frame.add(new JLabel());
  frame.add(Convert);
  // Empty cell frame.add(Convert);
  frame.setVisible(true);
        }
    }
 class currencyconvertor{
    
    public static void main(String[] args) {
        new Currencyconvert();
    }
 }