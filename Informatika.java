package fakultas;
public class Informatika extends Fakultas{
    private String Lab;
    private String Keminatan;
    private String Kaprodi;
    private String Dosen;
    public Informatika(String nf, String nu, String nr) {
        super(nf, nu, nr);
    }
    public void setInformatika(String l, String ke, String ka, String d){
        Lab = l;
        Keminatan = ke;
        Kaprodi = ka;
        Dosen = d;
    }
    public String getLab(){
        return Lab;
    }
    public String getKeminatan(){
        return Keminatan;
    }
    public String getKaprodi(){
        return Kaprodi;
    }
    public String getDosen(){
        return Dosen;
    }
    public void display(){
        System.out.println("Laboratorium        : "+Lab);
        System.out.println("Keminatan           : "+Keminatan);
        System.out.println("Ketua Program Studi : "+Kaprodi);
        System.out.println("Dosen               : "+Dosen);
    }
}