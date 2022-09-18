public class Main {
    public static void main(String[] args) {

        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";  // 0 indeks değeri 1. elemana eşit
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Ahmet";

        for (int i = 0; i < ogrenciler.length; i++) {
            // ogrenciler.length = eleman sayısı
            System.out.println(ogrenciler[i]);
            // 0 1 2 diye i nin değeri artacak.
            // i yi indeksleri okuyabilmek için kullanıyoruz.
        }

        System.out.println("------------------");


        for (String ogrenci : ogrenciler) {
            //bu öğrenciler dizisindeki her bir elemanı gez demek.
            // genelde bu yöntem kullanılır.
            System.out.println(ogrenci);

        }
    }
}



