
public class test2 {
    public static void main(String[] args) {
        Araba2 araba1 = new Araba2();  //araba1 isimli bir obje oluşturdum.
        
        //araba1.kapilar=-4;      // Clasın içindeki özellikler public olduğu için kolayca erişebildim ve saçma bir değer verebildim.
        //araba1.model="toyota";
        // Clas içindeki değerleri private yapacağım ve böylece bu özelliklere erişim için methodları kullanacağım(Encapsulation)
        
        araba1.setModel("BMW");
        System.out.println("Arabanın modeli : "+araba1.getModel());  // Private olan değişkenlere erişebildik.
        
        
        
    }
    
    
}
