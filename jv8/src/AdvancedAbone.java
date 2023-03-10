
public class AdvancedAbone {
    private  String isim;
    private int bakiye=120; //Eğer Bakiye Değeri Vermezsen 120 Default olur.
    private String sehir;
    
    public AdvancedAbone(String isim,int bakiye,String sehir)
    {
        this.isim=isim;
        this.sehir=sehir;
        
        if(bakiye>0 && bakiye<=120)
        {
           this.bakiye=bakiye; 
        }
      
    }
      
    public void dogalgaz_kullan(int miktar)
    {
        if(this.bakiye-miktar<0)
        {
            System.out.println("Yeterli Bakiye Yok");           
        }
        else
        {
            this.bakiye-=miktar;
            if(this.bakiye<=0)
            {
                System.out.println("Bakiyeniz Bitmiştir Lütfen En Yakın Abone"
                 +" Merkezine Gidip Kredi Yükleyin"+'\n'+"Kredi Limiti 120TL");
            }
            else
            {
                System.out.println("Yeni Bakiye: "+this.bakiye);
            }
        }
    }
    
    public void bakiye_ogren()
    {
        System.out.println("Bakiyeniz: "+this.bakiye);      
    }
    
    
    
}
