
public abstract class Sekil {
    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }
    public void ismi_söle()
    {
        System.out.println("Bu obje "+this.isim+" objesidir...");
    }
    abstract void alan_hesapla();

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }
            
}
