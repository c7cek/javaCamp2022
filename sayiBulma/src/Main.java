public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varMi=false;
        for (int sayi : sayilar){
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if (varMi){
            System.out.println("Sayı mevcuttur");
        }else {
            System.out.println("Sayı mevcut değildir");
        }

/*
        for (int i = 0; i < sayilar.length; i++) {
            if (aranacak == sayilar[i]) {
                System.out.println("Bu sayı dizide var");

            } else {
                System.out.println("Sayı dizide yok");
                break;
            }

        }*/


    }
}