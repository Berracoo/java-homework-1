public class Main {
    public static void main(String[] args) {
       char grade = 'C';
           // grade koşulumuzun öznesi.
       switch(grade){
           case 'A':
                 System.out.println("Mükemmel : Geçtiniz");
                break;
           case 'B':
           case 'C':
               System.out.println("iyi : Geçtiniz");
               break;
           case 'D':
               System.out.println("Fena Değil : Geçtiniz");
               break;
           case 'F':
               System.out.println("Maalesef : Kaldınız");
               break;
           default:
        // yukarıda tanımlı olan notlardan girilmemişse kullanılır.
               System.out.println("Geçersiz not girdiniz");
               // ctrl+shift+alt+l ile dağınık olan kod dizisi düzenli hale getirilebilir.
               //(her IDE için farklılık gösterebilir.)
        }

    }
}