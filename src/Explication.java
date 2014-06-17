import java.awt.*;
import java.awt.event.*;


import javax.swing.*;
public class Explication extends JFrame 
{

    Explication(String mot, String synonyme, String descrip, String traductionAnglais) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	public enum Sport {
	    TENNIS,
	    FOOTBALL,
	    NATATION,
	    RIEN;
	}
	public Explication() {
        super();
 
        setTitle("JTable basique dans un JScrollPane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        Object[][] donnees = {
                {"Johnathan", "Sykes", Color.red, true, Sport.TENNIS},
                {"Nicolas", "Van de Kampf", Color.black, true, Sport.FOOTBALL},
                {"Damien", "Cuthbert", Color.cyan, true, Sport.RIEN},
                {"Corinne", "Valance", Color.blue, false, Sport.NATATION},
                {"Emilie", "Schr�dinger", Color.magenta, false, Sport.FOOTBALL},
                {"Delphine", "Duke", Color.yellow, false, Sport.TENNIS},
                {"Eric", "Trump", Color.pink, true, Sport.FOOTBALL},
        };
 
        String[] entetes = {"Pr�nom", "Nom", "Couleur favorite", "Homme", "Sport"};
 
        JTable tableau = new JTable(donnees, entetes);
 
        getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
 
        pack();
    }
 
   
}