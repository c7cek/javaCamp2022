public class Main {
    public static void main(String[] args) {
        int sayi1 = 25;
        int sayi2 = 26;
        int sayi3 = 27;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("En büyük ="+enBuyuk);

// benim örneğim
//        int empty=0;
//
//        if(sayi1>sayi2){
//            empty=sayi1;
//            if (empty>sayi3){
//                System.out.println("sayı 1 en büyüktür");
//            }
//        }
//        if(sayi2>sayi1){
//            empty=sayi2;
//            if (empty>sayi3){
//                System.out.println("sayı 2 en büyüktür");
//            }
//        }if (sayi3>empty){
//            System.out.println("sayı 3 en büyüktür");
//        }




    }
}