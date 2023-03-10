
import java.util.Scanner;


public class Test {
    private static Şarkıcılar sarkici=new Şarkıcılar();
    private static Scanner scanner = new Scanner(System.in);
    public static void islemleri_bastir()
    {
        System.out.println("\t 0-Islemleri Görüntüle");
        System.out.println("\t 1-Sarkicilari Görüntüle");
        System.out.println("\t 2-Sarkici Ekle");
        System.out.println("\t 3-Sarkici Güncelle");
        System.out.println("\t 4-Sarkici Sil");
        System.out.println("\t 5-Sarkici Ara");
        System.out.println("\t 6-Uygulamadan Cik");
    }
    public static void goruntule()
    {
      sarkici.Sarkicilari_Bastir();
    }
    public static void sarkici_ekle()
    {
        System.out.println("Eklemek istediginiz sarkici ismi:");
        String singer_name = scanner.nextLine();
        sarkici.Sarkici_Ekle(singer_name);
    }
    public static void sarkici_guncelle()
    {
        System.out.println("Guncellemek istediginiz pozisyon:");
        int pz = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Guncellemek istediginiz isim:");
        String singer=scanner.nextLine();
        sarkici.Sarkici_Guncelle(singer, pz-1);
    }
    public static void sil()
    {
        System.out.println("Silmek istediginiz pozisyonu giriniz:");
        int pz=scanner.nextInt();
        sarkici.Sarkici_Sil(pz);
    }
    public static void ara()
    {
        System.out.println("Bulmak istediginiz sarkicinin ismi:");
        String singer = scanner.nextLine();
        sarkici.Sarkici_Ara(singer);
    }
    public static void main(String [] args)
    {
        System.out.println("\t Sarkici Uygulamasina Hosgeldiniz...");
        
        islemleri_bastir();
        boolean cikis=false;
        int islem;
        while(!cikis)
        {
            System.out.println("Bir islem seciniz:");
            islem = scanner.nextInt();
            scanner.nextLine();
            switch(islem)
            {
                case 0:
                  islemleri_bastir();
                  break;
                case 1:
                  goruntule();
                  break;
                case 2:
                  sarkici_ekle();
                  break;
                case 3:
                  sarkici_guncelle();
                  break;
                case 4:
                  sil();
                  break;
                case 5:
                  ara();
                  break;
                case 6:
                  cikis=true;
                  System.out.println("Uygulamadan Cikiliyor...");
                  break;
            }
            
            
        }
        
        
    }
    
    
    
}
