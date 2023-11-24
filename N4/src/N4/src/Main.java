public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7");
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("HP", 24.0);

        Computer computer = new Computer(ComputerBrand.HP, processor, memory, monitor);

        System.out.println("Марка компьютера: " + computer.getBrand());
        System.out.println("Модель процессора: " + computer.getProcessor().getModel());
        System.out.println("Объем памяти: " + computer.getMemory().getSize() + " ГБ");
        System.out.println("Тип памяти: " + computer.getMemory().getType());
        System.out.println("Марка монитора: " + computer.getMonitor().getBrand());
        System.out.println("Размер монитора: " + computer.getMonitor().getScreenSize() + " дюймов");
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
