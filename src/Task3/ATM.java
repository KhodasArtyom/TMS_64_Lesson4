package Task3;

import java.util.Scanner;

public class ATM {
    public int denomination20=20 ;
    public int denomination50=50;
    public int denomination100=100;
    User user;
    public float balance;
    public boolean statusOperation;
    public int amount;
    int moneyValue;

    public static void main(String[] args) {
        ATM atm = new ATM(5,5,10);
        atm.addMoneytoATM();
        atm.takeMoneyFromATM(350);
        System.out.println();
        //Эксперементировал, попробовал добавить что-то от себя
        //PIN:1111
        atm.run(new User());

    }

    public ATM() {
    }

    public ATM(int billX20, int billX50, int billX100) {
        System.out.println("Приветствуем в банкомате нашего банка!");
        System.out.println("Купюр номиналом " + denomination20 + " в банкомате составляет: " + billX20 + " купюр. \n"
                +"Купюр номиналом " + denomination50 + " в банкомате составляет: " + billX50 + " купюр. \n"
                + "Купюр номиналом " + denomination100 + " в банкомате составляет: " + billX100 + " купюр. \n");
        amount = (denomination20 * billX20) + (denomination50 * billX50) + (denomination100 * billX100);
    }
    public int addMoneytoATM() {
        System.out.println("Сумма денег в банкомате составляет: " + amount);
        return amount;
    }

    public boolean takeMoneyFromATM(int moneyValue) {
        this.moneyValue=moneyValue;
        int[] noteValues= {100,50,20};
        if(moneyValue>amount)
        {
            System.out.println("Ошибка.Недостаточно средств в банкомате.");
        }
        else
        {
            for(int i=0;i<noteValues.length && moneyValue!=0;i++)
            {
                if(moneyValue>=noteValues[i])
                    System.out.println("Выдать купюрами:"+noteValues[i]+"X"+""+moneyValue/noteValues[i]);
                moneyValue=moneyValue%noteValues[i];

            }
            statusOperation=true;
            System.out.println("Операция удалась " + statusOperation);

        }
        return statusOperation;
    }

    public void run(User user) {
        this.user = user;
        user.enterPIN();
        user.chooseOperation();

    }



    public void chooseOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую операцию вы хотите совершить?");
        System.out.println("Пополнить баланс.Нажмите 1" + "\n" +
                "Снять деньги с баланса.Нажмите 2" + "\n" +
                "Проверить баланс. Нажмите 3" + "\n" +
                "Завершить все операции и вернуть кредитную карту. Нажмите 4");

        while (scanner.hasNextInt()) {
            switch (scanner.nextInt()) {
                case 1:
                    addMoney();
                    break;
                case 2:
                    takeMonFromATM();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Спасибо, что воспользовались услугами нашего банкомата.До свидания!");
                    System.exit(0);
            }
        }
    }


    public void addMoney() {
        int coinX20=20;
        int coinX50 = 50;
        int coinX100 = 100;
        //кол-во купюр номиналом 20
        int countCoinsX20=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вставьте деньги в разъём для приема наличных номиналом 20, 50, 100 ");
        while(scanner.hasNextInt()) {
            System.out.println("Вставьте купюру или нажмите 0 для отмены:");
            int addCoins = scanner.nextInt();
            if(addCoins == 20) {
                denomination20 += addCoins;
                countCoinsX20++;
                System.out.println("Количество купюр номиналом 20: " + countCoinsX20);
            }else if(addCoins == 50) {
                denomination50+=addCoins;
            } else if(addCoins==100) {
                denomination100 += addCoins;
            } else if (addCoins == 0) {
                chooseOperation();
                break;
            } else if(addCoins != coinX20 || addCoins != coinX50 || addCoins != coinX100) {
                System.out.println("Неверный номинал купюры. Попробуй еще раз");
                break;
            }
            balance += addCoins;
            System.out.print("На счет зачислено " + balance + " руб.");
        }
    }
    public void checkBalance() {
        System.out.print("Ваш баланс составляет: " + balance);
    }

    public void takeMonFromATM() {
        System.out.println("Введите сумму, которую вы хотите снять:");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        if (sum % 10 != 0 || balance <= sum || sum < 0 || sum > amount) {
            statusOperation = false;
            System.out.println("Извините. Неверная сумма денег. Операция неудалась" + statusOperation);
        } else {
            balance=balance -sum;
            statusOperation = true;
            System.out.print("Операция прошла успешно " + statusOperation +
                    " .Остаток на счету: " + balance) ;
        }



    }


//        if(money != denomination20 || money != denomination50 || money != denomination100) {
//            System.out.println("Неизвестный номинал купюры. Пожалуйста попробуйте еще раз.Напоминаем:" +
//                    "Номинал купюр, которые можно исползовать в этом банкомате: " +
//                     denomination20 + "\t"+ denomination50 + "\t"+denomination100 + "\t");
}