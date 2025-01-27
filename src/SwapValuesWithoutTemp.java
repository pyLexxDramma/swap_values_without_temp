public class SwapValuesWithoutTemp {
    public static void main(String[] args) {
        int a = 5; // Первое значение
        int b = 10; // Второе значение

        System.out.println("До перестановки: a = " + a + ", b = " + b);

        // Перестановка значений без третьей переменной
        a = a + b; // Суммируем значения
        b = a - b; // Вычитаем b из суммы, получаем значение a
        a = a - b; // Вычитаем новое b из суммы, получаем значение b

        System.out.println("После перестановки: a = " + a + ", b = " + b);
    }
}
