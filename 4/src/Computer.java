
enum ComputerBrand {
    HP,
    Dell,
    Lenovo,
    Apple
}

// Класс Processor для описания процессора компьютера
class Processor {
    private String model;

    public Processor(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

}

// Класс Memory для описания памяти компьютера
class Memory {
    private int size;
    private String type;

    // Конструктор
    public Memory(int size, String type) {
        this.size = size;
        this.type = type;
    }

    // Геттеры и сеттеры
    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}

// Класс Monitor для описания монитора компьютера
class Monitor {
    private String brand;
    private double screenSize;

    // Конструктор
    public Monitor(String brand, double screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    // Геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public double getScreenSize() {
        return screenSize;
    }
}

// Класс Computer для описания компьютера
class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    // Конструктор
    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    // Геттеры и сеттеры
    public ComputerBrand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
