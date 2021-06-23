public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;

        long expected = 30;
        // переменная expected - это ожидаемый результат расчета значения бонуса для выбранных значений переменных amount и registered

        long actual = service.calculate(amount, registered);
        boolean passed = expected == actual;
        // т.к. мы рассматриваем Maven проект, который применяется для тестирования класса BonusService,
        // то вводим новую переменную Passed для сравнения фактического результата расчета бонуса с ожидаемым,
        // тем самым мы добьемся наглядности наших тестов.

        System.out.println(passed);
    }
}