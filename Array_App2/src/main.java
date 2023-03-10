
import java.util.ArrayList;



public class main {
    public static void yazdir(ArrayList<String> array)
    {
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Element: "+(i+1)+" = "+array.get(i));
        }
    }
    
    public static void main(String[] args)
    {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Metallica");
        arrayList.add("Guns and Roses");
        arrayList.add("Black Support");
        arrayList.add("Iron Maiden");
        arrayList.add("Metallica");
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(3));
        
        System.out.println(arrayList.size()); //arraylistin uzunluğu
        
        for(String a:arrayList)
        {
            System.out.println(a);
        }
        System.out.println("");
        for(int i=0;i<arrayList.size();i++)
        {
            System.out.println(arrayList.get(i));
        }
        //arrayList.remove(1);
//         System.out.println("");
//        for(int i=0;i<arrayList.size();i++)
//        {
//            System.out.println(arrayList.get(i));
//        }
        System.out.println("");
        System.out.println(arrayList.indexOf("Metallica"));
        System.out.println(arrayList.lastIndexOf("Metallica"));
        System.out.println(arrayList.indexOf("dRAM"));
        System.out.println("");
        
        
        arrayList.set(4, "Megadead");
        System.out.println(arrayList.get(4));
        System.out.println("");
        
        
        yazdir(arrayList);
        
        
    }
}
