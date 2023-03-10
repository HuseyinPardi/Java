
public class Hesap {
    private String kullanıcıadı;
    private String parola;
    private int bakiye;

    public Hesap(String kullanıcıadı, String parola, int bakiye) {
        this.kullanıcıadı = kullanıcıadı;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public void paraYatir(int tutar)
    {       
        this.bakiye+=tutar;
        System.out.println("Yeni bakiyeniz: "+this.bakiye);
    }
    public void paraÇek(int tutar)
    {
        if(this.bakiye-tutar<0)
        {
            System.out.println("Yeterli Miktar Yok...");
        }
        else
        {
            this.bakiye-=tutar;
            System.out.println("Yeni bakiyeniz: "+this.bakiye);
        }
    }
    
    
    public String getKullanıcıadı() {
        return kullanıcıadı;
    }

    public void setKullanıcıadı(String kullanıcıadı) {
        this.kullanıcıadı = kullanıcıadı;
    }

    
    public String getParola() {
        return parola;
    }

   
    public void setParola(String parola) {
        this.parola = parola;
    }

    
    public int getBakiye() {
        return bakiye;
    }

   
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
}
