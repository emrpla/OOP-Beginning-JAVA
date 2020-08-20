
import java.util.Scanner;

// Calışan clası = süperclas veya baseclass denir. Çünkü bu calsın özelliklerini kullanacak diğer claslar
public class Calisan {
    private String isim;
    private String departman;
    private int maas;
    
    public Calisan(String isim,String departman,int maas){
        this.isim = isim;
        this.departman = departman;
        this.maas = maas;
            
    }
    
    public void calis(){
        System.out.println("Çalışan Çalışıyor...");
             
    }
    
    public void bilgiler(){
        
        System.out.println("İsim : "+isim);
        System.out.println("Departman : "+departman);
        System.out.println("Maaş : "+maas+" TL");
    }
    
    public void departman_değişimi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mevcut departman : "+departman);
        System.out.print("Geçiş yapılacak departman adı : ");
        String x = scanner.nextLine();
        departman = x;
        System.out.println("Yeni departman adı : "+x);
        
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the departman
     */
    public String getDepartman() {
        return departman;
    }

    /**
     * @param departman the departman to set
     */
    public void setDepartman(String departman) {
        this.departman = departman;
    }

    /**
     * @return the maas
     */
    public int getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(int maas) {
        this.maas = maas;
    }
   
    
}
