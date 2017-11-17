
/*
 класс для вычисления арифмитических операций
 Название операции и числа берутся из входящего массива

 */

public class Calculate {

    public static void main(String[] args) {
        double param1 = Double.valueOf(args[1]);
        double param2 = Double.valueOf(args[2]);
        double result = 0;

        if (args[0].equals("sum")) {
            result = param1 + param2;
        } else if (args[0].equals("dif")) {
            result = param1 - param2;
        } else if (args[0].equals("incr")) {
            result = param1 * param2;
        } else if (args[0].equals("div")) {
            result = param1 / param2;
        } else if (args[0].equals("pow")) {
            result = Math.pow(param1, param2);
        }
        System.out.println(result);
    }

    public Double getResult(String[] args) {
        double param1 = Double.valueOf(args[1]);
        double param2 = Double.valueOf(args[2]);
        double result = 0;

        if (args[0].equals("sum")) {
            result = param1 + param2;
        }else if(args[0].equals("dif")) {
            result = param1 - param2;
        }else if (args[0].equals("incr")){
            result = param1 * param2;
        }else if (args[0].equals("div")){
            result = param1 / param2;
        }else if (args[0].equals("pow")) {
            result = Math.pow(param1, param2);
        }
        return result;
    }

}
