public class Main {
    public static void main(String[] args) {
        //For
        for (int i = 2; i < 10; i += 2) {
            // i++ = i+1
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti.");

        //üstteki default şekilde tanımladığımız i o bloğa ait yeni açtığımızda geçerli değil.
        //While
        int i = 2;
        while (i < 10) {
            System.out.println(i);
            i+=2;
            // i+=2 sayesinde infinite loop tan kurtulduk

        }
        //infinite loop => burada i yi nasıl arttıracağımızı belirtmedik o yüzden her zaman 1 olacak ve döngü devam edecek.
        System.out.println("While Döngüsü Bitti.");

        //Do-While
        int j = 1;
        do {
            System.out.println(j);
            j+=2;
            }
            while (j < 10);
        System.out.println("Do While Döngüsü Bitti.");
        // do while ın while dan farkı şart sağlanmasa bile do da tanımlı kısım  bir kere
        // çalışır.
        {

            }


        }
    }

