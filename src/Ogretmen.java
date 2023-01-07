public class Ogretmen {
    String isim,yas,brans,telNumarasi;
    public Ogretmen(String isim, String yas, String brans, String telNumarasi){
        this.isim = isim;
        this.yas = yas;
        this.brans = brans;
        this.telNumarasi = telNumarasi;
    }


    public void ogretmenBilgiYazdir(){
        System.out.println("Ogretmenin adi : "+ isim);
        System.out.println("Ogretmenin yasi : "+yas);
        System.out.println("Ogretmenin bransi : " + brans);
        System.out.println("Ogretmenin telefon numarasi : "+ telNumarasi);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }







}
