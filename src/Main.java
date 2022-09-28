public class Main {

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