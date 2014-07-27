import java.awt.*;
import java.awt.event.*;


import javax.swing.*;
public class Explication extends JFrame 
{

    Explication(String mot, String synonyme, String descrip, String traductionAnglais) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	public enum Dictionnaire {
	    Nom,
	    Explications,
	    Image,
	    Traduction;
	}
	public Explication() {
        super();
 
        setTitle("Dictionnaire TABLE TEST");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        Object[][] donnees = {
                {"test", "", Color.red, true, Dictionnaire.Nom},
                {"tets", "", Color.black, true, Dictionnaire.Explications},
                {"tesd", "", Color.cyan, true, Dictionnaire.Image},
                {"", "", Color.blue, false, Dictionnaire.Image},
                {"", "", Color.magenta, false, Dictionnaire.Nom},
                {"e", "", Color.yellow, false, Dictionnaire.Explications},
                {"", "", Color.pink, true, Dictionnaire.Nom},
        };
 
        String[] entetes = {"Nom", "Image", "Explications", "TraductionAr", "TraductionEn"};
 
        JTable tableau = new JTable(donnees, entetes);
 
        getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
 
        pack();
    }
 
   
}