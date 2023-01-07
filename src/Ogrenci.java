public class Ogrenci {

    String isim, yas, bolum, ogrenciNumarasi;
    Dersler ders1, ders2, ders3;


    boolean isPass;
   private double average;


    public Ogrenci(String isim, String yas, String bolum, String ogrenciNumarasi, Dersler dersinAdi, Dersler dersinAdi2, Dersler dersinAdi3) {
        this.isim = isim;
        this.yas = yas;
        this.bolum = bolum;
        this.ogrenciNumarasi = ogrenciNumarasi;
        this.ders1 = dersinAdi;
        this.ders2 = dersinAdi2;
        this.ders3 = dersinAdi3;
        this.average = 0.0;
        this.isPass = false;
    }

    public void ogrenciBilgiYazdir() {
        System.out.println("Ogrencinin adi : " + isim);
        System.out.println("Ogrencinin yasi : " + yas);
        System.out.println("Ogrencinin bolumu : " + bolum);
        System.out.println("Ogrencinin ogrenci numarasi : " + ogrenciNumarasi);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void topluNotYaz(int matematikNotu, int fizikNotu, int KimyaNotu) {
        if (matematikNotu >= 0 && matematikNotu <= 100) ders1.dersinNotu = matematikNotu;
        if (fizikNotu >= 0 && fizikNotu <= 100) ders2.dersinNotu = fizikNotu;
        if (KimyaNotu >= 0 && KimyaNotu <= 100) ders3.dersinNotu = KimyaNotu;
    }

    public void topluSozluNotYaz(int matematikSozluNotu, int fizikSozluNotu, int KimyaSozluNotu) {
        if (matematikSozluNotu >= 0 && matematikSozluNotu <= 100) this.ders1.dersinSozluNotu = matematikSozluNotu;
        if (fizikSozluNotu >= 0 && fizikSozluNotu <= 100) this.ders2.dersinSozluNotu = fizikSozluNotu;
        if (KimyaSozluNotu >= 0 && KimyaSozluNotu <= 100) this.ders3.dersinSozluNotu = KimyaSozluNotu;
    }


    public void notYazdir(Ogrenci ogrenci) {
        System.out.println("Ogrencinin " + ders1.dersinAdi + " dersindeki notu : " + ders1.dersinNotu);
        System.out.println("Ogrencinin " + ders2.dersinAdi + " dersindeki notu : " + ders2.dersinNotu);
        System.out.println("Ogrencinin " + ders3.dersinAdi + " dersindeki notu : " + ders3.dersinNotu);

    }

    public void isPassed(Ogrenci ogrenci) {
        if (this.ders1.dersinNotu == 0 || this.ders2.dersinNotu == 0 || this.ders3.dersinNotu == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        }
        else{
            this.isPass = isCheckPass(ogrenci);
            if(isPass==true){
                System.out.println("Ogrenci sinifi "+ ogrenci.average +" not ortalamasi ile basariyla gecmistir.");

            }
            else{
                System.out.println("ogrenci yarragi yemistir, not ortalamasi : "+ogrenci.average);
            }
        }
    }
    public boolean isCheckPass(Ogrenci ogrenci){
        if(calculateAverage(ogrenci)>=50){
            return true;
        }
        else {
            return false;
        }



    }
    public double calculateAverage(Ogrenci ogrenci){
average = ((ders1.dersinNotu *0.8 + ders1.dersinSozluNotu*0.2)+(ders2.dersinNotu *0.8 + ders2.dersinSozluNotu*0.2)+(ders3.dersinNotu *0.8 + ders3.dersinSozluNotu*0.2))/3;
return average;
    }



























}//classin sonu







