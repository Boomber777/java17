
/*

класс реализует калькулятор

 */

public class Calculator {

    /*
    результат вычисления
     */
    private double result = 0;


    /*
    суммирование
     */
    public void add(String action, double ... params){
        Calculate calculate = new Calculate();
        result = calculate.getResult(new String[]{action, String.valueOf(params[0]), String.valueOf(params[1])});

//        for (double param : params){
//            result += param;
//        }
    }


    /*
    получение результата
     */
    public double getResult(){
        return result;
    }

    /*
    очистка результата
     */
    public void cleanResult(){
        result = 0;
    }

}
