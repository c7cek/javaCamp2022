public class Main {
    public static void main(String[] args) {
        char grade='F';

        switch (grade){
            case 'A':
                System.out.println("Mükemmel !");
                break;
            case 'B':
                System.out.println("Çok iyi !");
                break;
            case 'C':
                System.out.println("İyi");
                break;
            case 'D':
                System.out.println("Fena değil");
                break;
            case 'F':
                System.out.println("Maalesef Kaldın");
                break;
            default:
                System.out.println("Geçersiz not");
        }
    }
}