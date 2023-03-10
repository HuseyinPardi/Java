
import java.util.Scanner;


public class Deneme{
    public static void main(String[] args){
   /*    System.out.println("Hello");
        int a=50;
        System.out.println(a+" Merabalar");
        int murat1 =5;
        //This planet's sucks
        short j=1000;
        int i=(j/2);
        System.out.println(i);
        byte aa=100;
        byte bb=(byte)(aa/2);
        System.out.println(bb);
          System.out.println(Toplayıcı(5,6));
          System.out.println(Çarpma(7,9));
          System.out.println(Bölme(350,45));
          System.out.println(Çıkarma(88654,61231));
          char c = 9711;
          System.out.println(c);
          
        String a = "Hello World";
        System.out.println(a+" MALLAR");
        
     Scanner scanner = new Scanner(System.in);
       System.out.println("Lütfen Kilonuzu Girin: ");
       int kilo=scanner.nextInt();
       System.out.println("Lütfen Boyunuzu Girin: ");
       double boy = scanner.nextDouble();
       double bki=kilo/(boy*boy);
       System.out.println("Beden Kitle İndeksiniz: "+bki);
        System.out.println("Dik Kenar1 Girin: ");
        int a=scanner.nextInt();
        System.out.println("Dik Kenar2 Girin: ");
        int b=scanner.nextInt();
        double hipo=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs: "+hipo);
        System.out.println(3!=4);
        System.out.println("Sultan"=="Sultan");
         
     
        
       Scanner scanner =new Scanner(System.in);
        int temp=scanner.nextInt();
        long top=1;
        for(int i = 1;i<=temp;i++)
        {             
            top=i*top;                                         
        }
        if(temp<0)
        {
            top=-1;
        }
         
       
        System.out.println(top);
    
     
      Factorial();
      char [] A={'A','B','C'};
      List(A);
      FactorialWh();
     All_Numbers_Adder();
      Armstrong();
     OddFinder();
   EBOB();
   EBOB2();*/
   
     
    

    }
    public static void EBOB2()
    {
        System.out.println("Birinci Sayıyı Giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println("İkinci Sayıyı Gİriniz");
        int b=scanner.nextInt();
        int ebo=1;
        for (int i = 1; i < a && i < b; i++) 
        {
            if(a%i==0&&b%i==0)
            {
                ebo=i;
            }
        }
        System.out.println(ebo);
    }
    
    public static void EBOB()
    {
        System.out.println("Birinci Sayıyı Giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println("İkinci Sayıyı Gİriniz");
        int b=scanner.nextInt();
        int mul=1;
        int i=2;
        while(true)
        {
            if(a==1&&b==1)             
            {
               break;             
            }
            if((a%i==0)&&(b%i==0))  //Eğer i sayısı 2 sayıya da bölünürse bu bloğa giriyor...
            {
                while((a%i==0)&&(b%i==0))   
                {
                     mul*=i;
                     a/=i;
                      b/=i;
                }
                 
            }
            if((a%i==0)&&(b%i!=0))  
            {
                while((a%i==0)&&(b%i!=0))
                {
                     a/=i;
                }
                
                
            }
            if((a%i!=0)&&(b%i==0))
            {
                while((a%i!=0)&&(b%i==0))
                {
                     b/=i;
                }
                
                
            } 
            i++;  
            
        }
              
        System.out.println(mul);
            
        
    }
    public static void OddFinder()
    {
        int i=2;
        while(true)
        {
            if(i==1000)
            {
                break;
            }
            if(i==2)
            {
                System.out.println(i);
                
            }
            else if(i==3)
            {
                System.out.println(i);
            }
            else if(i==5)
            {
                System.out.println(i);
            }
            else if(i==7)
            {
                System.out.println(i);
            }
            else
            {
                if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0)
                {
                    System.out.println(i);
                }
               
            }
            i++;
            
        }
        
        
    }
    public static void Armstrong()
    {
        System.out.println("Armstrong Kontrolü İçin Bir Sayı Gİriniz: ");
        Scanner scanner =new Scanner(System.in);
        String number = scanner.nextLine();
        int count =number.length();
        int num=Integer. parseInt(number);
        int temporary = num;
        int sum=0;
        while(num>0)
        {
            sum+=Math.pow(num%10, count);
            num/=10;                              
        }
        if(temporary==sum)
        {
            System.out.println("Girdiğiniz Sayı Armstrong Bir Sayıdır...");
        }
        else
        {
            System.out.println("Girdiğiniz Sayı Armstrong Bir Sayıdır Değildir!!...");
        }
    }
    
    public static void All_Numbers_Adder()
    {
        System.out.println("Rakamları Toplamını İstediğiniz Sayıyı Giriniz");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int top=0;
        do
        {
            top=top+a%10;
            a/=10;            
        }while(a!=0);
        System.out.println(top);
                           
        
        
        
        
        
    }
    public static void Factorial()
    {
        System.out.println("Hangi Sayının Faktöriyelini İstersin: ");
        Scanner scanner =new Scanner(System.in);
        int temp=scanner.nextInt();
        long top=1;
        for(int i = 1;i<=temp;i++)
        {             
            top=i*top;                                         
        }
        if(temp<0)
        {
            top=-1;
        }
         
        
        System.out.println(top);
    }
    public static void FactorialWh()
    {
        System.out.println("Hangi Sayının Faktöriyelini İstersin: ");
        Scanner scanner =new Scanner(System.in);
        int temp=scanner.nextInt();
        long top=1;
        int i=1;
        while(i<=temp)
        {
            top*=i;
            i++;          
        }
        if(temp<0)
        {
            top=-1;
        }
        System.out.println(top);
        
    }
    public static void List(char[] Students)
    {
        int i=0;
        while(i!=Students.length)
        {           
            System.out.println(Students[i]);
            i++;       
        }
        
    }
    public static int Toplayıcı(int a,int b)
    {
        int c = a + b;
        
        return c;
    }
    public static int Çarpma(int a,int b)
    {
        int c = a * b;
        return c;
    }
    public static double Bölme(int a,int b)
    {
        double c = (double)a/b;
        return c;
    }
    private static int Çıkarma(int a,int b)
    {
        int c = (a-b);
        return c;
    }
    
    
}
