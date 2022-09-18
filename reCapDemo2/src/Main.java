public class Main {
    public static void main(String[] args) {

        double[] myList = {1.2, 6.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];  // burada myList in en büyük elemanı o. indekse sahip olan dedik.
        // new double demekle direk elemanları eklemenin hiçbir farkı yok, biz eklemesekte arka planda bir new oluyor.
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }

        System.out.println("Toplam = " + total);
        System.out.println("En Büyük = " + max);
    }
}



