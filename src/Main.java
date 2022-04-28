public class Main {
    public static void main(String[] args) {
        int ticketPrice = 10_000;
        int rate = 20;
        int bonus = ticketPrice / rate;
        System.out.println("Бонусные мили:" + bonus);
    }
}