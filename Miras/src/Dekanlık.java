
import java.util.Scanner;


public class Dekanlık {
    
    public static void main(String[] args)
    {
        System.out.print("İsminiz: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
         System.out.print("Soyisminiz: ");
        String Surname = scanner.nextLine();
         System.out.print("Yaşınız: ");
        int age = scanner.nextInt();
        scanner.nextLine();
         System.out.print("Cinsiyetiniz: ");
        String gender=scanner.nextLine();
         System.out.print("Unvanınız: ");
        String departman=scanner.nextLine();

        
        Öğretim_Görevlisi grv = new Öğretim_Görevlisi(name,Surname,age,gender,departman);
        grv.print_f();
        grv.zam_yap(8000);
        grv.print_f();
        grv.zam_yap(200);
        grv.print_f();
        
    }
}
