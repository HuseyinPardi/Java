
import java.util.Scanner;


public class Login {
    public boolean login(Hesap hesap)
    {
        Scanner scanner =new Scanner(System.in);
        String kullanıcı_adi;
        String parola;
        
        System.out.print("Kullanıcı Adı: ");
        kullanıcı_adi=scanner.nextLine();
        System.out.print("Parola: ");
        parola=scanner.nextLine();
        if(hesap.getKullanıcıadı().equals(kullanıcı_adi)&&hesap.getParola().equals(parola))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
