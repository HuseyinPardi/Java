
public class Personel {
    private String İsim;
    private String Soyisim;
    private int Yaş;
    private String Cinsiyet;

    
    public Personel()
    {
        this("Sultan","Pardı",45,"Kadın");       
    }
    
    public Personel(String İsim, String Soyisim, int Yaş, String Cinsiyet) {
        this.İsim = İsim;
        this.Soyisim = Soyisim;
        this.Yaş = Yaş;
        this.Cinsiyet = Cinsiyet;
    }
    
    
    
    public String getİsim() {
        return İsim;
    }

    public void setİsim(String İsim) {
        this.İsim = İsim;
    }

    public String getSoyisim() {
        return Soyisim;
    }

    public void setSoyisim(String Soyisim) {
        this.Soyisim = Soyisim;
    }

    public int getYaş() {
        return Yaş;
    }

    public void setYaş(int Yaş) {
        this.Yaş = Yaş;
    }

    public String getCinsiyet() {
        return Cinsiyet;
    }

    public void setCinsiyet(String Cinsiyet) {
        this.Cinsiyet = Cinsiyet;
    }
    
    
}
