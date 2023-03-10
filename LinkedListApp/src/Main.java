
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {
    public static void main(String [] args)
    {
        
        LinkedList<String> şehirler = new LinkedList<String>();
        
        şehirler.add("Ankara");
        şehirler.add("Eskişehir");
        şehirler.add("Afyon");
        
        şehirleri_turla(şehirler);
    }
    public static void şehirleri_turla(LinkedList<String> şehirler)
    {
        ListIterator<String> iterator = şehirler.listIterator();
        int işlem;
        işlemleri_bastir();
        Scanner scanner = new Scanner(System.in);
        if(!iterator.hasNext())
        {
            System.out.println("Herhangi Bir Şehir Bulunmuyor.");
        }
        boolean çıkış=false;
        boolean ileri= true;
        while(!çıkış)
        {
            System.out.println("Bir İşlem Seçiniz.");
            işlem=scanner.nextInt();
            switch(işlem)
            {
                case 0:
                    işlemleri_bastir();
                    break;
                case 1:
                    if(!ileri)
                    {
                        if(iterator.hasNext())
                        {
                            iterator.next();
                            ileri=true;
                        }
                        
                    }
                    if(iterator.hasNext())
                    {
                        System.out.println("Şehre Gidiliyor. "+iterator.next());
                    }
                    else
                    {
                        System.out.println("Gidilecek Şehir Kalmadı.");
                        ileri=true;
                    }
                    break;
                case 2:
                    if(ileri)
                    {
                        if(iterator.hasPrevious())
                        {
                            iterator.previous();
                            ileri=false;
                        }
                        
                    }
                    if(iterator.hasPrevious())
                    {
                        System.out.println("Şehre Gidiliyor. "+iterator.previous());
                    }
                    else
                    {
                        System.out.println("Şehir Turu Başlıyor.");
                    }
                    break;
                case 3:
                    çıkış=true;
                    System.out.println("Uygulamadan Çıkılıyor...");
                    break;
            }
        }
    }
    public static void işlemleri_bastir()
    {
        System.out.println("0 - İşlemleri Görüntüle.");
        System.out.println("1 - Bir Sonraki Şehre Git.");
        System.out.println("2 - Bir Önceki Şehre Git.");
        System.out.println("3 - Uygulamadan Çık.");
    }
}