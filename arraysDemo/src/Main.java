public class Main {
    public static void main(String[] args) {
        String students1="İsmail";
        String students2="Ali";
        String students3="Mustafa";
        String students4="Ahmet";

        System.out.println(students1);
        System.out.println(students2);
        System.out.println(students3);
        System.out.println(students4);
        System.out.println("------------------------");

        String [] students =new String[4];
        students[0]="İsmail";
        students[1]="Ali";
        students[2]="Mustafa";
        students[3]="Ahmet";


        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("-------------------");
        for (String student:students){
            System.out.println(student);
        }


    }
}