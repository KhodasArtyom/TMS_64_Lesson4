package Task3;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(5, 5, 10);
        atm.addMoneytoATM();
        atm.takeMoneyFromATM(350);
        System.out.println();
        //Эксперементировал, попробовал добавить что-то от себя
        //PIN:1111
        atm.run(new User());

    }
}