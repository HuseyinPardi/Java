
import java.util.Scanner;

class Main {
     private static Kart[][] kartlar = new Kart[4][4];
//    public static void arrayibastir(int[] C)
//    {
//         for(int i=0;i<C.length;i++)
//        {
//            System.out.println("Current Value: "+C[i]);      
//        }
//    }
//    public static void sortla(int [] ARRAY)
//    {
//        int temp;
//        int min;
//        for(int i=0;i<ARRAY.length-1;i++)
//        {
//            min=ARRAY[i];
//            for(int j=i;j<ARRAY.length;j++)
//            {
//               if(ARRAY[j]<min)
//               {
//                   min=ARRAY[j];
//                   temp=ARRAY[i];
//                   ARRAY[i]=min;
//                   ARRAY[j]=temp;
//               }               
//            }
//        }
//    }
  
     
    public static void F_E()
    {
        String[] array = new String[3];
        array[0]="Ali";
        array[1]="Mehmet";
        array[2]="Hasan";
        int [] array2={1,2,3,4,5};
        for(int i:array2)
        {
            System.out.println(i);
        }
        for(String a: array)
        {
            System.out.println(a);
        }
        
    }
    
    public static void main(String[] args)
    {
       
        kartlar[0][0]=new Kart('E');
        kartlar[0][1]=new Kart('A');
        kartlar[0][2]=new Kart('B');
        kartlar[0][3]=new Kart('F');
        kartlar[1][0]=new Kart('G');
        kartlar[1][1]=new Kart('A');
        kartlar[1][2]=new Kart('D');
        kartlar[1][3]=new Kart('H');
        kartlar[2][0]=new Kart('F');
        kartlar[2][1]=new Kart('C');
        kartlar[2][2]=new Kart('D');
        kartlar[2][3]=new Kart('H');
        kartlar[3][0]=new Kart('E');
        kartlar[3][1]=new Kart('G');
        kartlar[3][2]=new Kart('B');
        kartlar[3][3]=new Kart('C');
        
        //oyunTahtasi();
        while(oyunBittimi()==false)
        {
            oyunTahtasi();
            tahminEt();
        }
    }
    public static void tahminEt()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Birinci Tahmin (i ve j değerlerini bir boşluklu girin......");
        int i1=scanner.nextInt();
        int j1=scanner.nextInt();
        kartlar[i1][j1].setTahmin(true);
        oyunTahtasi();
        System.out.print("ikinci Tahmin (i ve j değerlerini bir boşluklu girin......");
        int i2=scanner.nextInt();
        int j2=scanner.nextInt();
        if(kartlar[i1][j1].getDeger()==kartlar[i2][j2].getDeger())
        {
        
            System.out.println("Doğru Tahmin...");
            kartlar[i2][j2].setTahmin(true);
        }
        else
        {
            System.out.println("Yanlis Tahmin...");
            kartlar[i1][j1].setTahmin(false);
        }
    }
    public static boolean oyunBittimi()
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(kartlar[i][j].isTahmin()==false)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void oyunTahtasi()
    {
        System.out.println("--------------------------");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(kartlar[i][j].isTahmin())
                {
                    System.out.print(" |"+kartlar[i][j].getDeger()+"| ");
                }
                else
                {
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
            System.out.println("--------------------------");
            
        }
    }
}
