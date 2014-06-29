import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnect 
{
	private Connection con;
	private ResultSet resul;
	private Statement st; 
	public DBConnect()
	{		
	//declarer le driver utiliser
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	//se connecter au serveur avec  la base de données
	String url="jdbc:mysql://127.0.0.1:3306/etudiant";
	String user="root";
	String pass="";
	try {
		con=DriverManager.getConnection(url,user,pass);
	} catch (SQLException e) 
	{
	e.printStackTrace();
	}
	//l'objet qui permet d'executer les requete sql
	try 
	{
	st=con.createStatement();
	} 
	catch (SQLException e) 
	{
	e.printStackTrace();
	}		
	}	
	//********************* requete ************************
	
	public MotR rechercher(String requete)
	{		
		
		try {
			resul=st.executeQuery(requete);
			while(resul.next()){
				MotR m=new MotR();
		
				m.setMot(resul.getString(1));
				m.setSynonyme(resul.getString(2));
				m.setDescrip(resul.getString(3));
				m.setTraductionAnglais(resul.getString(4));
				return m;
			}
			
		} catch (SQLException e) 
		{
		e.printStackTrace();
		}
		return null;
		
	}
	
}
