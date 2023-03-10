
public class Daire extends Sekil{

    private int yarıcap;
    
    @Override
    void alan_hesapla() {
        System.out.println(getIsim()+" alanı "+ (Math.PI*yarıcap*yarıcap));
    }

    public Daire(String isim,int yarıcap) {
        super(isim);
        this.yarıcap=yarıcap;
    }
    
}
