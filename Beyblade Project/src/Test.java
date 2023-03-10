
import java.util.Scanner;


public class Test {
    public static void main(String[] args)
    {
        System.out.println("Beyblade Programına Hosgeldiniz.....");
        System.out.println("Cikis icin q'ya basın...");
        
        Scanner scanner=new Scanner(System.in);
        while(true)
        {
            System.out.println("Hangi Beyblade'i Üretmek istiyorsunuz? ");
            String islem =scanner.nextLine();
            if(islem.equals("q"))
            {
                System.out.println("Programdan Cikiliyor....");
                break;
            }
            else
            {
                BeybladeFabrikasi fabric = new BeybladeFabrikasi();
                Beyblade beyblade = fabric.beybladeUret(islem);
                if(beyblade== null)
                {
                    System.out.println("Lütfen Geçerli Bir Beyblade İsmi Girin...");
                }
                else
                {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
            
        }
    }
    
}
