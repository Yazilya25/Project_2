import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int amount = 20_000;
        int percent = 20;
        int bonus = amount / percent;
        System.out.println("Бонусные мили:" + bonus);
    }
}