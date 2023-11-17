public class Main {
    public static void main(String[] args) {

        Season myFavoriteSeason = Season.Лето;

        // Выводим всю информацию о нем
        System.out.println("Мое любимое время года: " + myFavoriteSeason);
        System.out.println("Средняя температура: " + myFavoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + myFavoriteSeason.getDescription());

        // 2) Метод, который выводит сообщение в зависимости от времени года
        printSeasonDescription(Season.Лето);

        // 6) Распечатываем все времена года, среднюю температуру и описание
        for (Season season : Season.values()) {
            System.out.println(season + ", средняя температура: " + season.getAverageTemperature() + ", " + season.getDescription());
        }
    }

    // Метод для вывода сообщения в зависимости от времени года
    public static void printSeasonDescription(Season season) {
        switch (season) {
            case Лето:
                System.out.println("Я люблю лето");
                break;
            case Весна:
                System.out.println("Я люблю весну");
                break;
            case Осень:
                System.out.println("Я люблю осень");
                break;
            case Зима:
                System.out.println("Я люблю зиму");
                break;
        }
    }
}