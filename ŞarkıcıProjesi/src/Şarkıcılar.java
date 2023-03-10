
import java.util.ArrayList;


public class Şarkıcılar {
    private ArrayList<String> sarkici_listesi =new ArrayList<String>();
    public void Sarkicilari_Bastir()
    {
        System.out.println("Sarkici Listesinde "+ sarkici_listesi.size()+" kadar sarkici var.");
        for (int i = 0; i < sarkici_listesi.size(); i++) {
            System.out.println((i+1)+".Sarkici :"+sarkici_listesi.get(i));
        }
    }
    public void Sarkici_Ekle(String isim)
    {
        sarkici_listesi.add(isim);
        System.out.println("Sarkici Listesi Güncellendi...");
    }
    public void Sarkici_Guncelle(String yeni_isim,int pozisyon)
    {
        sarkici_listesi.set(pozisyon,yeni_isim);
        System.out.println("Sarkici Listesi Güncellendi...");
    }
    public void Sarkici_Sil(int deletedS1)
    {
        String Deleted_Singer = sarkici_listesi.get(deletedS1);
        sarkici_listesi.remove(deletedS1);
        System.out.println(Deleted_Singer+" isimli sarkici listeden silindi...");
    }
    public void Sarkici_Ara(String Singer_Name)
    {
        int pozisyon = sarkici_listesi.indexOf(Singer_Name);
        if(pozisyon>=0)
        {
            System.out.println("Sarkici Bulundu.");
            System.out.println(Singer_Name+" isimli sarkici "+(pozisyon+1)+". pozisyonda...");
        }
        else
        {
            System.out.println("Sarkici Bulunamadı....");
        }
    }
}
