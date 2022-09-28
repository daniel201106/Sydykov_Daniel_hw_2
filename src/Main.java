public class Main {
    /*
    если же человеку меньше 20 лет и температура на улице в диапазоне
    от 0 до 28 градусов, то результат снова -  “Можно идти гулять”;
    а если человеку больше 45 лет, то результат “Можно идти гулять”
     формируется только тогда когда на улице температура в диапазоне от -10 до 25 градусов;
    В остальных случаях метод должен возвращать результат - “Оставайтесь дома”;
    В методе main вызвать написанный метод 5 раз с различными входными данными (аргументами) и распечатать результат в консоль.*/
    public static void main(String[] args) {
        System.out.println(method(45, 20));
        System.out.println(method(44, 19));
        System.out.println(method(43, 18));
        System.out.println(method(42, 17));
        System.out.println(method(41, 16));
    }

    public static String method(int age, int temp) {
        String log1 = "Можно идти гулять";
        String log2 = "Нельзя идти гулять";
        String log3 = "Оствайтесь дома";

        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
            return log1;
        } else if (age < 20 && temp >= 0 && temp <= 28) {
            return log1;
        } else if (age > 45 && temp >=-10 && temp <=25 ) {
          return log1;
        }else {
            return log3;
        }
    }
}