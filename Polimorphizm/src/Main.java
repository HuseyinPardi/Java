class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }
  
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus()
    {
        return "Hayvan Konusuyor......";
    }
}

class Kedi extends Hayvan
{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" Miyavlıyor.....";
    }
    
}
class Köpek extends Hayvan
{

    public Köpek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" Havlıyor.....";
    }
    
}
class At extends Hayvan
{

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
       return this.getIsim()+" Kisniyor....."; 
    }
    
    
}
class Kus extends Hayvan
{

    public Kus(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" Kus cikliyor...";
    }
    
}


public class Main {
    public static void konustur(Object object)
    {
        //System.out.println(object.konus());
       if(object instanceof Köpek)
       {
           Köpek köpek = (Köpek)object;
           System.out.println(köpek.konus());
       }
       else if(object instanceof Kedi)
       {
           Kedi kedi=(Kedi)object;
           System.out.println(kedi.konus());
       }
       else if(object instanceof At)
       {
           At at=(At)object;
           System.out.println(at.konus());
       }
       else if(object instanceof Hayvan)
       {
           Hayvan hayvan=(Hayvan)object;
           System.out.println(hayvan.konus());
       }
       else if(object instanceof Kus)
       {
           Kus kus=(Kus)object;
           System.out.println(kus.konus());
       }
    }
    public static void main(String[] args)
    {
//        Hayvan hayvan = new Hayvan("Limon");
//        Hayvan hayvan2 = new Kedi("Tekir");
//        Hayvan hayvan3 = new Köpek("Karabas");
//        Hayvan hayvan4 = new Köpek("Sahbatur");
//        System.out.println(hayvan.konus());
        
//        konustur(new Kedi("Tekir"));
//        konustur(new Köpek("Karabas"));
//        konustur(new At("Sahbatur"));
        
//        Köpek köpek =new Köpek("Karabas");
//        if ( köpek instanceof Köpek)
//        {
//            System.out.println("Evet köpek nesnesi Köpek Sınıfına aittir..");
//        }
//        if ( köpek instanceof Hayvan)//Miras yüzünden yine doğru olur ve if'e girer
//        {
//            System.out.println("Evet köpek nesnesi Köpek Sınıfına aittir..");
//        }
        /*if ( köpek instanceof Kedi) //Olmaz
        {
            System.out.println("Evet köpek nesnesi Köpek Sınıfına aittir..");
        }*/
        
        
        Köpek köpek = new Köpek("Karabas");
        Kedi kedi =new Kedi("Tekir");
        At at = new At("Sahbatur");
        Hayvan hayvan=new Hayvan("Limon");
        Kus kus =new Kus("Zeytin");
        konustur(köpek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);
        konustur(kus);
    }
}
