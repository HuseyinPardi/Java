
public class Öğretim_Görevlisi extends Personel{
    private String bölüm;
    private int maas;
    
    public void zam_yap(int miktar)
    {
      if(this.bölüm!="Yok")
      {
       boolean truth = (this.maas*(0.25)>miktar);
       if(truth)
       {
           System.out.println("Tüm Çalışanlara "+miktar+" Lira Zam Yapıldı ");
           this.maas+=miktar;
       }
       else
       {
           System.out.println("Bu Kadar Zam Yaparsak Batarız Patron....");
       }
      }
    }
    
    public void print_f()
    {        
      if(this.bölüm!="Yok")
      {
          System.out.println(getİsim()+" "+getSoyisim()+" "
        +getYaş()+" "+getCinsiyet()+" "+this.bölüm+" "+this.maas);
      }
    }
    public Öğretim_Görevlisi(String İsim, String Soyisim, int Yaş, String Cinsiyet,String bölüm)
    {
        super(İsim,Soyisim,Yaş,Cinsiyet);
        if(bölüm.equals("Prof"))
        {
            this.bölüm=bölüm;
            this.maas=15000;
        }
        else if(bölüm.equals("Doc"))
        {
            this.bölüm=bölüm;
            this.maas=12000;
        }
        else if(bölüm.equals("Meydanci"))
        {
            this.bölüm=bölüm;
            this.maas=5500;
        }
        else
        {
            System.out.println("Üniversitede Böyle Bir Çalışan Olamaz.....");
            this.bölüm="Yok";
            this.maas=0;
        }
    }
    public void set_bölüm(String bölüm)
    {
        this.bölüm=bölüm;
    }
    public String get_bölüm()
    {
        return this.bölüm;
    }
    public void set_maas(int maas)
    {
        this.maas=maas;
    }
    public int get_maas()
    {
        return this.maas;
    }
    
}
