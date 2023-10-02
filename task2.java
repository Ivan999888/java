public class task2 {
    public static void main(String[] args) {
    try {
        int[] intArray = new int[8]; // Создаем массив с 8 элементами
        int d = 0;
        double catchedRes1 = intArray[8] / d; // Вызовет ArrayIndexOutOfBoundsException
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Catching exception: " + e);
    } catch (ArithmeticException e) {
        System.out.println("Catching arithmetic exception: " + e);
    }
}
}