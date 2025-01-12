public class Main {
    public static void main(String[] args) {
        Time defaultTime = new Time();
        System.out.println("Время по умолчанию: " + defaultTime);

        Time customTime = new Time(2, 45, 30);
        System.out.println("Пользовательское время: " + customTime);

        System.out.println("Количество секунд в " + customTime + ": " + customTime.toSeconds());

        customTime.addSeconds(5000);
        System.out.println("После добавления 5000 секунд: " + customTime);

        customTime.increaseByFiveSeconds();
        System.out.println("После увеличения на 5 секунд: " + customTime);
    }
}
