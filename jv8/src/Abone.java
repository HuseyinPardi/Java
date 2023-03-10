
public class Abone {
    public String isim;
    public int bakiye;
    public String sehir;
    
    
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
