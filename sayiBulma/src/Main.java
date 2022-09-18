public class Main {
    public static void main(String[] args) {
       int[] sayilar = new int[]{1,2,5,7,9,0};
       int aranacak = 6;
       boolean varMi = false; // ilk başta sayı yok gibi aldık.

        for (int sayi:sayilar){
            if(sayi==aranacak){
              varMi = true;
              break; // aramasına gerek yoksa döngü biter.
            }
        }
        if(varMi){
            System.out.println("Sayı mevcuttur.");
        }else{
            System.out.println("Sayı mevcut değildir.");
        }








    }
}
