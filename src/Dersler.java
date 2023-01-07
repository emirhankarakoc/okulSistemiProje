public class Dersler {
Ogretmen ogretmen;
    String dersinAdi;
    String dersinKisaAdi;
    String dersinKodu;
    int dersinNotu;
    int dersinSozluNotu;

    public Dersler(String dersinAdi,String dersinKisaAdi, String prefix){
        this.dersinAdi  = dersinAdi;
        this.dersinKisaAdi = dersinKisaAdi;
        this.dersinKodu = prefix;

    }
    public void ogretmenEkle(Ogretmen ogretmen){
        if(ogretmen.brans.equals(this.dersinKisaAdi))
        this.ogretmen = ogretmen;
        else System.out.println("Bu hocayi, bu derse ekleyemezsiniz.\n+++++++++++++++++++++++++++++++++++++++++++");

    }
    public void printOgretmen(Ogretmen ogretmen){
        if(ogretmen.brans.equals(dersinKisaAdi))
        ogretmen.ogretmenBilgiYazdir();
        else System.out.println("Bu dersten, bu hoca bulunamamistir.");
    }













}
