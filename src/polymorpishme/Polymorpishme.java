
package polymorpishme;


public class Polymorpishme {

    public static void main(String[] args) {
       
        Hewan hw = new Hewan();
        
        Ayam ay = new Ayam();
        Bebek bb = new Bebek();
        Kucing kc = new Kucing();
        Kuda kd = new Kuda();
        
        hw.tampilSuara();
        ay.tampilSuara();
        bb.tampilSuara();
        kc.tampilSuara(); 
        kd.tampilSuara();
    }
}
