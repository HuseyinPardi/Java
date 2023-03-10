
public class Main {
    public static void main(String [] args) throws InterruptedException
    {
        System.out.println("Sabiha Gökçen Hava Limanına Hoşgeldiniz...");
        String şartlar = "Yurtdışı Çıkış Kuralları.\n"
        +"Herhangi Bir Siyasi Yasağınızın Bulunmaması Gerekiyor.\n"
                +"15 Tl Harç Bedelini Yatırmanız Gerekiyor.\n"
                +"Gideceğiniz Ülkeye Vizeniz Bulunması Gerekiyor.";
        String message="Yurtdışı Şartlarından Hepsini Sağlamanız Gerekiyor.";
        
        while(true)
        {
            System.out.println("*********************************");            
            System.out.println(şartlar);
            System.out.println("*********************************");
            Yolcu yolcu = new Yolcu();
            System.out.println("Harç Bedeli Kontrol Ediliyor.");
            
            Thread.sleep(3000);  //3sn bkle
            if(yolcu.yurtdisiHarciKontrol()==false)
            {
                System.out.println(message);
                continue;
            }
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);
            if(yolcu.siyasiYasakKontrol()==false)
            {
                System.out.println(message);
                continue;
            }
            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000);
            if(yolcu.vizeDurumuKontrol()==false)
            {
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz Tamam Yurtdışına Çıkabilirsiniz..");
            break;
            
        }
        
        
        
        
    }
}
