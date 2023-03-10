
public class Dragon extends Beyblade {
    
    
    private String kutsalCanavar;
    private String gizliYetenek;
    
    
    public Dragon(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar,String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.gizliYetenek=gizliYetenek;
        this.kutsalCanavar=kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adi: "+kutsalCanavar);
        System.out.println("Gizli Yetenek: "+gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+" "+kutsalCanavar+" ı ortaya cikariyor..");
        System.out.println(getBeybladeci()+" ın saldırısı: hayalet kasırga!!");
    }
    
    
    
}
