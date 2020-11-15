package Covid;

public class Manusia implements Cloneable {
    private int imun;
    private String status_covid;
    private Covid19 corona;
    public void setImun(int imun) {
        this.imun = imun;
    }
    public void setStatusCovid19() {
        if(this.corona.getActive()){
        if (imun > 100) {
        this.corona.setStatus("Negatif");
    } else {
        this.corona.setStatus("Positif");
    }
    }else{
        this.corona.setStatus("Negatif");
    }
    }
    @Override
    protected Manusia clone() {
        try {
            Manusia cloned = (Manusia) super.clone();
            cloned.corona = (Covid19) corona.clone();
            return cloned;
        }catch (CloneNotSupportedException ex) {
            return null;
        }
    }
    public void setCovid19(Covid19 corona) {
        this.corona = corona;
    }
    public Covid19 getCovid19() {
        return corona;
    }

    public int getImun(){
        return imun;
    }

    public String getStatus_covid() {
        return status_covid;
    }

    public void setStatus_covid(String status_covid) {
        this.status_covid = status_covid;
    }
   }
   
