/* 
Класс вычисления суммы 2х чисел
*/

public class Calculate {

	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int a = Integer.valueOf(arg[1]);
		int b = Integer.valueOf(arg[2]);
		String sum = "sum"; 

		if (sum.equals(arg[0])){
			int result = a + b;
			System.out.println("sum " + result);
			
		}			
	}

}

// ЗЫ

// compareTo() для сравнения строк на больше-меньше