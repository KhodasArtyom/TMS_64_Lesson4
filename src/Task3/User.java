package Task3;

import java.util.Scanner;

public class User extends ATM {
    public int pin;
    public float balance;


    public User() {
    }

    public User(int pin) {
        this.pin = pin;
    }

    public void enterPIN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите PIN: ");
        int pin = scanner.nextInt();
        if(pin != 1111) {
            System.err.println("Ошибка. Ваша карта заблокирована. Обратитесь в службу поддержки вашего банка.");
            System.exit(1);
        }


    }


}
