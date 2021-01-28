
public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount =1000_60;
        boolean registered = false;
        long expected = 30;

        //вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        //производим проверку (сравниваем ожидаемый и фактический результат)
        //если true - to PASS
        //если false - to FAIl
        boolean passed = expected == actual;

        //выводим результат
        System.out.println(passed);
    }
}
