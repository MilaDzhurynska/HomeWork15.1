public class Main implements Advise {
    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY:
                System.out.println("Робочий день. Плануйте свій графік");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("Вихідні! Рекомендується відвідати кінотеатр та випробувати нову канатну дорогу");
                break;
        }
    }

    public static void main(String[] args) {
        Main advisor = new Main();

        advisor.advise(Day.MONDAY);
        advisor.advise(Day.FRIDAY);
        advisor.advise(Day.SUNDAY);
    }
}

