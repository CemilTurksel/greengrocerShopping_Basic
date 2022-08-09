import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        double pear = 2.14 , apple = 3.67 , tomato = 1.11 , banana = 0.95 , eggplant = 5.00;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many kg pear ? : ");
        double pearKg = scanner.nextDouble();

        System.out.println("How many kg apple ? : ");
        double appleKg = scanner.nextDouble();

        System.out.println("How many kg tomato ? : ");
        double tomatoKg = scanner.nextDouble();

        System.out.println("How many kg banana ? : ");
        double bananaKg = scanner.nextDouble();

        System.out.println("How many kg eggplant ? : ");
        double eggplantKg = scanner.nextDouble();

        double total = (pear * pearKg) + (apple * appleKg) + (tomato * tomatoKg) + (banana * bananaKg) + (eggplant * eggplantKg);

        System.out.println("Total amount: " + total);
    }
}
