
public class Main {
    public static void main(String[] args)
    {
        String a = "Mustafa";
        String b = new String("Mustafa"); //String diye bir class olduğu için böyle tanımlanabilir.
        System.out.println(b);      
        boolean flag = b.isEmpty();
        System.out.println(flag);
        System.out.println(b.length()+"\n");
        //char h = b[0];  Stringlere javada böyle erişmezsin...
        char h= b.charAt(0); // Bu şekilde erişilir...
    //  System.out.println(h);
        
        for (int i = 0; i < b.length(); i++) {
            System.out.println(b.charAt(i));
        }
        System.out.print("\n");
        System.out.println(b.startsWith("M")); //b string'i M ile başlıyorsa true
        System.out.println(b.endsWith("a")); //b string'i a ile bitiyorsa true
        
        System.out.println(b.indexOf("s")); //İstenilen harfin indexini döndürür.
        System.out.println(b.indexOf("k")); //Eğer aradığı harfi bulamazsa -1
        System.out.println(b.lastIndexOf("a")); // sondan arama yapar
        
        System.out.print("\n");
        
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());
        
        System.out.print("\n");
        
        String deph = "1923";
        int z = Integer.parseInt(deph);  //String'i int'e çevirir.
        System.out.println(z);
        int b2 = 1923;
        String a1 = String.valueOf(b2);  //int'i String'e çevirir.
        System.out.println(a1);
        
        System.out.print("\n-----------------------------------\n");
        
        String a3="Mustafa";
        String b3="Mustafa";
        
        if(a3==b3)
        {
            System.out.println("Eşitler");
        }
        
        String a4=new String("Ali");
        String b4 = new String("Ali");
        
//        if(a4==b4)
//        {
//            System.out.println("Eşitler");
//        }
        
        if(a4.equals(b4))
        {
            System.out.println("Eşitler");
        }
    }
}
