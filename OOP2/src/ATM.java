
import java.util.Scanner;


public class ATM {
    public void calis(Hesap hesap)
    {
        Login login = new Login();
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz.......");
        System.out.println("****************************");
        System.out.println("Kullanıcı Adınızı Girin: ");
        System.out.println("****************************");
        int giris_hakkı=3;
        while(true)
        {
            if(login.login(hesap))
            {
                System.out.println("Giriş Başarılı.....");
                break;
            }
            else
            {
                System.out.println("Girişi Başarısız!!!");
                --giris_hakkı;
                System.out.println("Kalan Giris Hakkı: " + giris_hakkı);
            }
            if(giris_hakkı==0)
            {
                System.out.println("Giriş Hakkınız Bitti...");
                return;
            }
        }
        System.out.println("****************************");
        String islemler="1. Bakiye Görüntüle\n"+
                        "2. Para Yatırma\n"+
                        "3. Para Çekme\n"+
                        "4. Çıkış için q'ya basın";
        System.out.println(islemler);
        System.out.println("****************************");
        while(true)
        {
            System.out.println("İşlemi Seçiniz: ");
            String islem = scanner.nextLine();
            if(islem.equals("q"))
            {
                System.out.println("Sistem Sonlandırılıyor...");
                break;
            }
            else if(islem.equals("1"))
            {              
                System.out.println("Bakiyeniz: "+hesap.getBakiye());
            }
            else if(islem.equals("2"))
            {
                System.out.println("Yatırmak İstedğiniz Tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);               
            }
            else if(islem.equals("3"))
            {
                System.out.println("Çekmek İstedğiniz Tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraÇek(tutar);               
            }
            else
            {
                System.out.println("Geçersiz İşlem...");
            }
        }
    }
    
}
