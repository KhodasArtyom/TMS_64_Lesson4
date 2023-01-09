package Task2;

public class HDD {
    public String name;
    public int memorySize;
    public  String type;

    public HDD() {
    }

    public HDD(String name, int memorySize, String type) {
        this.name = name;
        this.memorySize = memorySize;
        this.type = type;
    }
    public void getInfo() {
        System.out.print("Название HDD: " + name + "\n"
                + "Размер HDD: " + memorySize + "\n"
                + "Тип HDD: " + type + "\n");
    }

}
