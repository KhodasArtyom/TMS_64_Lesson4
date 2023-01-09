package Task2;

public class RAM {
    String name;
    int memorySize;

    public RAM() {
    }

    public RAM(String name, int memorySize) {
        this.name = name;
        this.memorySize = memorySize;
    }
    public void getInfo() {
        System.out.print("Название RAM: " + name + "\n"
                + "Размер RAM: " + memorySize + "\n" );
    }
}
