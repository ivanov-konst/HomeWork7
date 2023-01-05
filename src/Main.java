public class Main {
    //Задание 1
    public static void yearNow(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(+year + " год является високосным»");
        } else System.out.println(+year + " год не является високосным»");
    }

    //Задание 2
    public static int getClientOS (String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }
    public static int СlientDeviceYear () {
        int Year = 2014;
        return Year;
    }

    //Задание 3
    public static void DeliveryDistance(int distance) {
        if (distance <= 20) {
            System.out.println("Потребуется дней на доставку: 1");
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Потребуется дней на доставку: 2");
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Потребуется дней на доставку: 3");
        } else {
            System.out.println("Мы не можем осуществить доставку");
        }
    }

    //Задание 4
    public static void ValidName (String Name) {
        for (int i = 0; i < Name.length() - 1; i++) {
            char A = Name.charAt(i);
            char B = Name.charAt(i + 1);
            if (A == B) {
                System.out.println("Дублируются символы: " + A);
                return;
            }
        }

        System.out.println("Дублей нет");
    }

    public static void main (String[] args) {
        System.out.println("Hello world!");


//Задание 1
        int year = 2023;
        yearNow (year);

//Задание 2
        String osName = "iOS";
        int СlientOS = getClientOS(osName);
        int СlientDeviceYear = СlientDeviceYear();

        if (СlientOS == 0 && СlientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (СlientOS == 0 && СlientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (СlientOS == 1 && СlientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (СlientOS == 1 && СlientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

//Задание 3

        int distance = 20;
        DeliveryDistance (distance);

//Задание 4
        String Name = "aabccddefgghiijjkk";
        ValidName (Name);


    }
}