
public class Main {
    public static void main(String [] args)
    {
        
        //IMuhendis mühendis1 = new IMuhendis();  interfacelerde nesne oluşturamazsın
        
//        PcMuhendisi mühendis1 = new PcMuhendisi(false,false);
//        IMuhendis mühendis2 = new PcMuhendisi(false,false); //Şekil A
        
        
        /*Interfacelerden herhangi bir nesne oluşturamazsın ama bir class'ın 
          referansı olarak oluşturabilirsin... Şekil A'da oluduğu gibi...*/
        
        
//        mühendis1.askerlik_durumu_sorgula();
//        mühendis1.adli_sicil_sorgula();
//        mühendis1.mezuniyet_ortalaması(3.07);
//        String [] tecrübe={"Arçelik","MIT","ItowenClass"};
//        mühendis1.is_tecrubesi(tecrübe);
        
        
        MakineMuhendisi makinemühendisi = new MakineMuhendisi(true,false);
        String [] tecrube={};
        String [] referanslar={"Mustafa Murat Coşkun","Ahmet Yazıcı"};  
        makinemühendisi.adli_sicil_sorgula();
        makinemühendisi.askerlik_durumu_sorgula();
        System.out.println(makinemühendisi.mezuniyet_ortalaması(2.31));
        makinemühendisi.is_tecrubesi(tecrube);
        makinemühendisi.referans_getir(referanslar);
        makinemühendisi.calis();
    }
    
    
}
