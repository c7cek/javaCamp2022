public class Main {
    public static void main(String[] args) {
        sayiBulmaca();

    }
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;

        boolean varMi = false;

        for (int sayi = 0; sayi < sayilar.length; sayi++) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            mesajVer("sayı mevcut :"+aranacak);
        } else {
            mesajVer("sayı mevcut değil: "+aranacak);
        }

    }
    public static void mesajVer (String mesaj){
        System.out.println(mesaj);

    }

}