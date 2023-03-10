
public class Main 

{
    public static void main(String[] args)
    {
        
        Abone abone = new Abone();
        abone.isim="Huseyin Pardi";
        abone.sehir="Mersin";
        abone.bakiye=200;
        abone.dogalgaz_kullan(200);
        
        AdvancedAbone aa = new AdvancedAbone("Huseyin Pardi",200,"Mersin");
        aa.bakiye_ogren();
    }
    
    
}
