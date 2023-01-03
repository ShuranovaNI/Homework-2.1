public class Main {
    public static void main(String[] args) {
        System.out.println("Формула расчета бонусных миль за перелет");

        int ticketPrice = 305; // цена билета
        int milesPrice = 20; // рублей за 1 милю
        int bonusMiles = ticketPrice / milesPrice; // формула расчетав количества миль

        System.out.println(bonusMiles);

    }
}

