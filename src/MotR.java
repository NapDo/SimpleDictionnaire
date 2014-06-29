
public class MotR {

    static Object getMot;
    private String Mot = "";
    private String Synonyme = "";
    private String Descrip = "";
    private String TraductionAnglais = "";

    public MotR() {
        super();
        // TODO Auto-generated constructor stub
    }

    public MotR(String Mot, String Synonyme, String Descrip, String date) {
        super();
        Mot = Mot;
        this.Synonyme = Synonyme;
        this.Descrip = Descrip;
        this.TraductionAnglais = TraductionAnglais;
    }

    public String getMot() {
        return Mot;
    }

    public void setMot(String Mot) {
        Mot = Mot;
    }

    public String getSynonyme() {
        return Synonyme;
    }

    public void setSynonyme(String Synonyme) {
        this.Synonyme = Synonyme;
    }

    public String getDescrip() {
        return Descrip;
    }

    public void setDescrip(String Descrip) {
        this.Descrip = Descrip;
    }

    public String getTraductionAnglais() {
        return TraductionAnglais;
    }

    public void setTraductionAnglais(String TraductionAnglais) {
        this.TraductionAnglais = TraductionAnglais;
    }

}
