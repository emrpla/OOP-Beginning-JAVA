
public class deneme {
    
    public static void main(String[] args) {
       
        /* Account hesap1 = new Account();
        hesap1.setBakiye(100000.00);
        hesap1.setEmail("emrpla12@gmail.com");
        hesap1.setHesapNo("1234");
        hesap1.setIsim("Emre PALA");
        hesap1.setTelefonNo("0507 414 1903");
        System.out.println("mevcut bakiyem = "+hesap1.getBakiye());*/
        // Yukarıdaki kod bloğunu her seferde tek tek yazmak angarya olabileceği için constructor methodları(Pythondaki init methodu!) kullanırız.
        
        Account hesap2 = new Account("12","emre@gmail.com","Emre Polat","2342342",100.00);
        
        hesap2.paraYatir(1000);
        
        
    }
    
    
}
