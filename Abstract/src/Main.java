
public class Main {
    
    public static void main(String [] args)
    {
        //Sekil sekil = new Sekil("Sekil");   abstract sınıflardan direkt obje oluşmaz..
        kare k1 = new kare("kare1",5);
        Daire daire1 = new Daire("daire1",3);
        k1.alan_hesapla();
        daire1.alan_hesapla();
        
        
        
        Sekil sekil = new Daire("ali",5);
        Sekil sekil2 = new kare("mehmet",5);
        
        
        sekil.alan_hesapla();
        sekil2.alan_hesapla();
     //   sekil2.cevre_hesapla(); //override edilmemiş method olduğu için abstract class referansı bulamaz.
        k1.cevre_hesapla(); //doğrudan kare sınıfı nesnesi olduğu için implement eder.
    }
}
