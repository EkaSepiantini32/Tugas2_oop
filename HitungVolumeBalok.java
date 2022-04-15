package tugas2_oop;

/**
 *
 * @author Ni Putu Eka Sepiantini
 */
public class HitungVolumeBalok {
    private double Panjang;
    private double Lebar;
    private double Tinggi;
    double Volume;
    
    public HitungVolumeBalok (double nPj, double nLb, double nTg){
        this.setPANJANG(nPj);
        this.setLEBAR(nLb);
        this.setTINGGI(nTg);
    }
    
    public void setPANJANG(double nPj){
        this.Panjang = nPj;
    }   
 
    public void setLEBAR (double nLb){
        this.Lebar = nLb;
    }
 
    public void setTINGGI (double nTg){
        this.Tinggi = nTg;
    }
  
    private double HitungVolume(){
        this.Volume = this.Panjang * this.Lebar * this.Tinggi;
        return this.Volume;
    }

    public void PrintHasil(){
        this.HitungVolume();
    
    System.out.println("Hitung Volume Balok");
      System.out.println("~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("Nilai Panjang  : "+this.Panjang+" cm");
      System.out.println("Nilai Lebar  : "+this.Lebar+" cm");
      System.out.println("Nilai Tinggi  : "+this.Tinggi+" cm");
        System.out.println("Nilai Volume Balok : "+this.Volume+" cm");
    }
}
