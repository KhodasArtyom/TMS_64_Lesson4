package Task2;
public class Computer {
    public Computer computer;
    public double price;
    public String model;
    public RAM ram;
    public HDD hdd;

    public Computer() {
    }

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer(double price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;

        getInfo();
        ram.getInfo();
        hdd.getInfo();

    }



    public void getInfo() {
        System.out.println("Информация о компьютере: ");
        System.out.println("Цена: " + price +" $" +"\n" +
                "Модель: "+ model );

    }

    public static class Main {
        public static void main(String[] args) {
            Computer computer1 = new Computer(700,"Intel i5");
            computer1.getInfo();
            System.out.println();
            Computer computer2 = new Computer(1800,"Intel i9",new RAM("DDR5",16),
                    new HDD("Kingston",1024,"Внутренний"));


        }
    }
}
