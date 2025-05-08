package pertemuan701;

/**
 *
 * @author Ni Made Pramesti Dewi
 * TGL: 8 Mei 2025
 * CONTOH CLASS OVERLOADING
 */
public class salam {
    String tx = "Menggunakan Method tulisSalam tanpa parameter";
    
    public void tulisSalam(){
        System.out.println(this.tx);
    }
    public void tulisSalam(String txt){
        System.out.println(txt);
    }
    public void tulisSalam(String nim, String nama){
        System.out.println("Mahasiswa dengan NIM: "+nim+" bernama "+nama);
    }
}
