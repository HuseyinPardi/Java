
import java.util.Scanner;


public class Yolcu implements YurtDisiKurallari{

    public Yolcu()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yatırdığınız Harc Bedeli: ");
        this.harc=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Siyasi Yasağınız Bulunuyor mu? ");
        String cevap = scanner.nextLine();
        if(cevap.equals("evet"))
        {
            this.siyasiYasak=true;
        }
        else
        {
            this.siyasiYasak=false;
        }
        System.out.println("Vizeniz Bulunuyor mu? ");
        cevap = scanner.nextLine();
        if(cevap.equals("evet"))
        {
            this.vizeDurumu=true;
        }
        else
        {
            this.vizeDurumu=false;
        }
    }
    
    @Override
    public boolean yurtdisiHarciKontrol() {
        if(this.harc<15)
        {
            System.out.println("Lütfen Yurtdışı Harcını Tam Yatırın..");
            return false;
        }
        else
        {
            System.out.println("Yurt Dışı Harcı işlemi tamam..");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if(this.siyasiYasak==true)
        {
            System.out.println("Siyasi Yasağınız Bulunuyor Dışarı Çıkamazsınız.");
            return false;
        }
        else
        {
            System.out.println("Siyasi Yasağınız Bulunmuyor...");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if(this.vizeDurumu==true)
        {
            System.out.println("Vize İşlemleri Tamam.");
            return true;
        }
        else
        {
            System.out.println("Vizeniz Eksik..");
            return false;
        }
    }
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
    
}
