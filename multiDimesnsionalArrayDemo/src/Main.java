public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3]; // üç bölge üç şehir
        // hem satır hem de sütundan oluşmasını istiyorsak dizimizin iki tane köşeli parantez kullanırız
        // bir tane kullanmak sadece satırdan oluşmasını sağlar.

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        for (int i = 0; i <= 2; i++) { // bu bize satırları gezicem diyor 0-1-2 sırasıyla.
            System.out.println("--------------");
            for (int j = 0; j <= 2; j++) { // bu da satırları gezerken satırda bulunan elemanları yazdırmamızı sağlayacak.
                System.out.println(sehirler[i][j]);
            }

        }

    }

}



