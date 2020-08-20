
public class Account {
    
    private String hesapNo;
    private String isim;
    private double bakiye;
    private String email;
    private String telefonNo;

    
    // Constructor methods ****************************
    
    public Account(){    // Cons. method adı ile classın adı aynı olmalı !!!
    
        System.out.println("Yeni bir obje yarattığımda ilk burası çalışır.");
    
}
    public Account(String hesapNo,String isim, String email,String telefonNo,double bakiye){
        
        this.hesapNo = hesapNo;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
        this.bakiye = bakiye;
        
    }
    
    // İki tane cuns. method yazdım(Overloading örneği)
    
    
    
    //************************************************
    
    public void paraYatir(double miktar){
        
        bakiye += miktar;
        System.out.println("Yatırdığınız para miktarı :"+miktar);
        System.out.println("Mevcut yeni bakiyeniz :"+bakiye);
        
    }
    
    public void paraCek(double miktar){
        
        if (miktar>bakiye){
            System.out.println("Hesabınızda bu kadar para bulunmamaktadır.");
        }else{
            if (miktar>1500) {
                System.out.println("Atm kullanarak 24 saat içinde para çekme sınırı 1500 tl dir. Lütfen daha yüksek para miktarını şubelerimizden çekiniz.");
            }else{
                bakiye -= miktar;
                System.out.println("Çekilen para tutarı : "+miktar);
                System.out.println("Mevcut bakiyeniz : "+bakiye);
            }
        
        }
    }
    
    
    
    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
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
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    
    
    
    
    
    
    
}
