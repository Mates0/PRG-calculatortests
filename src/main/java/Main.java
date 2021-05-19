import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logic logic = new Logic();
        System.out.println("-----------------");
        System.out.println("Zvolte jednu z možností");
        System.out.println("1) Sčítání");
        System.out.println("2) Odečítání");
        System.out.println("3) Násobení");
        System.out.println("4) Dělení");
        System.out.println("5) Vypočítat mocniny");
        System.out.println("6) Faktoriál");
        System.out.println("-----------------");
        int chooseoption = sc.nextInt();
        if (chooseoption == 1) {
            System.out.println("-----------------");
            System.out.println("Zvolil si sčítání");
            System.out.println("-----------------");
            System.out.println("Zadej první číslo:");
            int input = sc.nextInt();
            System.out.println("Zadej druhé číslo:");
            int input2 = sc.nextInt();
            System.out.println("Výsledek je:" + " " + logic.sum(input, input2));
        }
        if (chooseoption == 2) {
            System.out.println("-----------------");
            System.out.println("Zvolil si odečítání");
            System.out.println("-----------------");
            System.out.println("Zadej první číslo:");
            int input = sc.nextInt();
            System.out.println("Zadej druhé číslo:");
            int input2 = sc.nextInt();
            System.out.println("Výsledek je:" + " " + logic.subtract(input, input2));
        }
        if (chooseoption == 3) {
            System.out.println("-----------------");
            System.out.println("Zvolil si násobení");
            System.out.println("-----------------");
            System.out.println("Zadej první číslo:");
            int input = sc.nextInt();
            System.out.println("Zadej druhé číslo:");
            int input2 = sc.nextInt();
            System.out.println("Výsledek je:" + " " + logic.multiply(input, input2));
        }
        if (chooseoption == 4) {
            System.out.println("-----------------");
            System.out.println("Zvolil si dělení");
            System.out.println("-----------------");
            System.out.println("Zadej první číslo:");
            int input = sc.nextInt();
            System.out.println("Zadej druhé číslo:");
            int input2 = sc.nextInt();
            System.out.println("Výsledek je:" + " " + logic.divide(input, input2));
        }
        if (chooseoption == 5) {
            System.out.println("-----------------");
            System.out.println("Zvolil si mocnění");
            System.out.println("-----------------");
            System.out.println("Zadej číslo které chceš umocnit:");
            int input = sc.nextInt();
            System.out.println("Výsledek je:" + " " + logic.square(input));
        }
        if (chooseoption == 6) {
            System.out.println("-----------------");
            System.out.println("Zvolil si faktoriál");
            System.out.println("-----------------");
            System.out.println("Zadej číslo ze kterého chceš vytvořit faktoriál:");
            int input = sc.nextInt();
            System.out.println("Výsledek je:" + " " + logic.factorial(input));
        }
    }
}
