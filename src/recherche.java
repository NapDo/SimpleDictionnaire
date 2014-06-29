
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.*;

public class recherche extends JFrame implements ActionListener {

    private JButton b1, b2, b3, b4;
    private JTextField t1;
    private Choice c1;

    /**
     *
     */
    public recherche() {

        super("Gestion des etudiants");
        setSize(700, 480);
        setLocationRelativeTo(null);
        Container c = getContentPane();
        c.setLayout(null);
        Font police = new Font("arial", Font.BOLD, 18);
        Image icon = Toolkit.getDefaultToolkit().getImage("esto.jpg");
        this.setIconImage(icon);
        JLabel image = new JLabel(new ImageIcon("esto.jpg"));
        JPanel pan = new JPanel();
        c.add(image);

        //***********************************
        JLabel lab1 = new JLabel("Le Mot a rechercher");
        lab1.setFont(police);
        lab1.setBounds(50, 150, 200, 50);
        c.add(lab1);
        //***********************************
        t1 = new JTextField();
        t1.setFont(police);
        t1.setBounds(250, 150, 220, 40);
        t1.setEditable(true);
        c.add(t1);
        //******************** rechercher *********************	
        b2 = new JButton("Rechercher");
        b2.setBounds(270, 240, 200, 50);
        b2.setFont(police);
        b2.addActionListener(this);

        c.add(b2);
        //******************** Suppression *********************
        Choice c1 = new Choice();
        c1.addItem("Arabe");
        c1.addItem("Francais");
        c1.addItem("Anglais");
        c1.setBounds(450, 100, 200, 50);
        c1.setFont(police);

        c.add(c1);

        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) {
            String s = JOptionPane.showInputDialog(this, "Veuillez entrer NapDo");
         
            try {
                DBConnect db = new DBConnect();

              MotR m = db.rechercher("select * from traductionfr where Mot ='" + s + "'");
           
                        if (!m.getMot().equals("")) 
                        {
                            hide();
                            
                            
                            new Explication(m.getMot(), m.getSynonyme(), m.getDescrip(), m.getTraductionAnglais()).setVisible(true);
                            System.out.println("Marche");
          	}
		}
             catch (Exception ee) 
                    {
                System.out.println("Marche pas");
                JOptionPane.showMessageDialog(this, "pas trouve");
                ee.printStackTrace();

            }
        
}
    }

}
