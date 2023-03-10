
public class MakineMuhendisi implements IMuhendis,ICalisma {

    @Override
    public void calis() 
    {
        System.out.println("Makine Mühendisi Çalışıyor..");
    }

    private boolean askerlik;
    private boolean adli_sicil;

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    
    @Override
    public void askerlik_durumu_sorgula() {
        if(askerlik)
        {
            System.out.println("Askerliğimi Yaptım.");
        }
        else
        {
            System.out.println("Askerliğimi Henüz Yapmadım.");
        }
    }

    @Override
    public String mezuniyet_ortalaması(double derece) {
         return "Ortalamam: "+derece;
    }

    @Override
    public void adli_sicil_sorgula() {
         if(adli_sicil)
       {
           System.out.println("Adli Sicil Kaydım Bulunuyor.");
       }
       else
       {
           System.out.println("Herhangi Bir Adli Sicil Kaydım Bulunmuyor.");
       }
    }

    @Override
    public void is_tecrubesi(String[] array) {
         if(array.length==0)
         {
             System.out.println("Herhangi Bir İş Tecrübem Bulunmuyor..");
         }
         else
         {
             System.out.println("Makine Mühendisi Olarak Şu Şirketlerde Çalıştım: ");
             for (int i = 0; i < array.length; i++) {
                 System.out.println(array[i]);
             }
         }
    }
    public void referans_getir(String[] array)
    {
        if(array.length==0)
        {
             System.out.println("Herhangi Bir Referansım Bulunmuyor...");
        }
        else
        {
            System.out.println("Referanslarım: ");
            for (int i = 0; i < array.length; i++) {
                 System.out.println(array[i]);
             }
        }
    }
}
