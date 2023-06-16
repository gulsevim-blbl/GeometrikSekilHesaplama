
public abstract class Sekil {
    private  String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }
    
    abstract void alan_Hesaplama(); //abstract method tanımlama böyle

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
        
        
    
}
