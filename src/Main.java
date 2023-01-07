





public class Main {
    public static void main(String[] args) {
        //methodlar
        //ogretmenBilgiYazdir() -- sectiginiz ogretmen hakkinda bilgi verir.
        //ogretmenEkle(Ogretmen objesinden bir ogretmen nesnesi ister.) -- istediginiz bir derse ogretmen ekleyin, branslari uyusmaz ise ekleme yapamazsiniz.
        //printOgretmen(Ogretmen objesinden bir ogretmen nesnesi ister.) -- dersler uzerinden ogretmen sorgusu yapar, eger bransi ile sorguladiginiz ders uyusur ise ogretmenBilgiYazdir()in yaptigini yapar.
        //printOgretmen() -- uyusmaz ise hata donderir.
        //ogrenciBilgiYazdir() -- sectiginiz ogrenci hakkinda bilgi verir.
        //topluNotYaz(int matematikNotu, int fizikNotu, int KimyaNotu) -- bir ogrenci icin toplu not girebilirsiniz.sirasiyla matematik, fizik ve kimya notunu 0-100 arasinda girebilirsiniz
        //notYazdir(Ogrenci objesinden bir ogrenci nesnesi ister.) -- ogrencinin notlarini yazdirir.
        //calculateAverage(Ogrenci objesinden bir ogrenci nesnesi ister.) -- ortalama hesaplar.
        //isPassed(Ogrenci objesinden bir ogrenci nesnesi ister.) -- calculateAverage() fonksiyonunu kullanarak ortalama hesaplar ve dersi gecip gecmedigini soyler.









        Dersler fizik = new Dersler("Fizik","FIZIK","102");
        Dersler matematik = new Dersler("Matematik","MAT","101");
        Dersler kimya = new Dersler("Kimya","KMY","103");


        //dersler bitti
        //ogretmen olusturucu

        Ogretmen matematikci_tufan = new Ogretmen("Tufan Hoca", "39","MAT","12345");
        Ogretmen fizikci_baris = new Ogretmen("Baris Fizik","31","FIZIK","05331");
        Ogretmen kimyaci_kemal = new Ogretmen("Kemal","26","KMY","05123");
        //ogretmenler bitti
        //ogrenci olusturucu

        Ogrenci ogrenci_emirhan = new Ogrenci("Emirhan","19","Bilgisayar Muhendisligi","0001",matematik,fizik,kimya);
matematik.printOgretmen(matematikci_tufan);
ogrenci_emirhan.topluNotYaz(100,50,12);
ogrenci_emirhan.topluSozluNotYaz(85,90,100);

ogrenci_emirhan.notYazdir(ogrenci_emirhan);
ogrenci_emirhan.isPassed(ogrenci_emirhan);







    }
}