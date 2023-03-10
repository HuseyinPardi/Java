
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;


public class Main {
   public static void main(String [] args)
   {/*
       ArrayList<String> diller = new ArrayList<String>();
       diller.add("Java");
       diller.add("Php");
       diller.add("Python");
       diller.add("Kotlin");
       diller.add("Csharp");
       for (int i = 0; i < diller.size(); i++) {
          System.out.println(diller.get(i));
      }
     
       for(String a: diller)
       {
           System.out.println(a);   //foreach
       }
       
       System.out.println("---------------------");
       
       diller.add(1,"C++");
       
       for(String a: diller)
       {
           System.out.println(a);   //foreach
       }
       */
       
       LinkedList<String> gidilecek_yerler = new LinkedList<String>();
       
//       gidilecek_yerler.add("Market");
//       gidilecek_yerler.add("Okul");
//       gidilecek_yerler.add("Kütüphane");
//       gidilecek_yerler.add("Spor Salonu");
//       gidilecek_yerler.add("Ev");
 //      listeyi_bastir(gidilecek_yerler);
       
//       System.out.println("----------------------------");
//       
//       gidilecek_yerler.add(4,"Mall");
//       listeyi_bastir(gidilecek_yerler);
//       System.out.println("----------------------------");
//       gidilecek_yerler.remove(5);
//       listeyi_bastir(gidilecek_yerler);
       sirali_ekle(gidilecek_yerler,"Sinema");
       sirali_ekle(gidilecek_yerler,"Ev");
       sirali_ekle(gidilecek_yerler,"Okul");
       sirali_ekle(gidilecek_yerler,"Astral Mabed");
       System.out.println("----------------------------");
       listeyi_bastir(gidilecek_yerler);
   }
   public static void listeyi_bastir(LinkedList<String> gidilecek_yerler)
   {
       /*for(String a: gidilecek_yerler)
       {
           System.out.println(a);   //foreach
       }*/
       ListIterator<String> iterator = gidilecek_yerler.listIterator();
       while(iterator.hasNext())
       {
           System.out.println(iterator.next());
       }
       
   }
   public static void sirali_ekle(LinkedList<String> gidilecek_yerler,String yeni)
   {
       ListIterator<String> iterator = gidilecek_yerler.listIterator();
       while(iterator.hasNext())
       {
           
           
               int karsilastir = iterator.next().compareTo(yeni);
               if(karsilastir==0)
               {                  
                   System.out.println("Listemizde bu eleman zaten mevcut");
                   return;
               }
               else if(karsilastir<0)
               {
                   System.out.println("Yeni deger nextten daha büyük");
               }
               else if(karsilastir>0)
               {
                   iterator.previous();
                   iterator.add(yeni);
                   System.out.println("Yeni deger eklendi");
                   return;
               }
               
           
       }
       iterator.add(yeni);
       
   }
}
