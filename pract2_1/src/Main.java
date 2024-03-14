import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите возраст Васи");
        int vasyAge = scan.nextInt();
        System.out.println("Введите возраст Кати");
        int katyAge = scan.nextInt();
        System.out.println("Введите возраст Миши");
        int mishaAge = scan.nextInt();

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyAge <= katyAge && vasyAge <= mishaAge) {

            min = vasyAge;

            if (mishaAge >= katyAge) {

                max = mishaAge;

                middle = katyAge;

            } else {

                max = katyAge;

                middle = mishaAge;

            }

        } else if(katyAge <= vasyAge && katyAge <= mishaAge){
            min = katyAge;

            if (vasyAge <= mishaAge){
                max= mishaAge;

                middle= vasyAge;
            }
            else {

                max= vasyAge;

                middle= mishaAge;
            }





        }



        System.out.println("минимальный возраст: " + min);
        System.out.println("средний возраст: " + middle);
        System.out.println("максимальный возраст: " + max);
    }
}