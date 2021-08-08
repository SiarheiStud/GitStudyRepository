package modul2.decomposition;
/*
7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Task7 {

    public static int calcFactorial(int a){
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int sumFactorial = 0;
        for (int i = 1; i < 9; i += 2) {
            sumFactorial = sumFactorial + calcFactorial(i);
        }
        System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9 равна: " + sumFactorial);
    }
}
