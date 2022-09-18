public class Main {
    public static void main(String[] args) {
        int number = -2;
        int remainder = number % 2; // 25 in 2 ye bölümünden kalan değer
        //System.out.println(remainder);
        boolean isPrime = true; // ilk başta asal kabul ettik

        if(number==1){
            System.out.println("Sayı asal değildir.");
            return; // bunu kullanarak diğer koşula geçmesini engellemiş olduk
            // burdan aldığı sonucu döndürür ve döngüye devam eder.
        }

        if(number<1){
            System.out.println("Geçersiz sayı");
        }


     for(int i=2; i<number;i++){ // sonra 2-24 arası herhangi bir i değeri bölerse asal olmadığını bize döndürecek.
         if(number%i ==0){
             isPrime = false;
         }

        }
     if(isPrime){ // isPrime == true dememize gerek olmadan kullandık ikisi aynı şey
          System.out.println("Sayı asaldır.");

     }else{
         System.out.println("Sayi asal değildir.");
     }


    }
}