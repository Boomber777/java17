import java.util.Scanner;

/*
класс для запуска калькулятора, поддерживает ввод пользователей
 */
public class InteractRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Calculator calculator = new Calculator();
            String exit = "no";
            String action = "no";

            while (!exit.equals("yes")){
                if (calculator.getResult() !=0){
                    System.out.println("Использовать предыдущий результат как первый аргумент? (yes/no)");
                    if (!scanner.next().equals("yes")){
                        calculator.cleanResult();
                    }
                }

                Double argFirst = 0.0;
                if (calculator.getResult() !=0) {
                    argFirst = calculator.getResult();
                    calculator.cleanResult();
                }else {
                    System.out.println("Введите первый аргумент:");
                    argFirst = scanner.nextDouble();
                }
                System.out.println("Введите второй аргумент:");
                Double argSecond = scanner.nextDouble();
                System.out.println("Какую операцию выполняем?(sum, dif, incr, div, pow)");
                action = scanner.next();
                calculator.add(action, argFirst, argSecond);
                System.out.println(calculator.getResult());
                System.out.println("Выйти из программы?: yes/no");
                exit = scanner.next();
            }


        }finally {
            scanner.close();
        }

    }
}
