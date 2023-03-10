
public class kare extends Sekil{

    private int kenar;
    
    @Override
    void alan_hesapla() {
        System.out.println(getIsim()+" alanı "+(this.kenar*this.kenar));
    }

    public kare(String isim,int kenar) {
        super(isim);
        this.kenar=kenar;
    }
    
    public void cevre_hesapla()
    {
        System.out.println(getIsim()+"'in çevresi "+(4*this.kenar));
    }
    
}
