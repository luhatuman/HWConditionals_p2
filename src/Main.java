public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Task 2
        System.out.println();
        System.out.println("Task 2");
        short clientOS2 = 1; //0 - iOS, 1 - Android
        short clientDeviceYear = 2014;
        if (clientOS2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //Task 3
        System.out.println();
        System.out.println("Task 3");
        short year = 2100;
        if (year % 400 == 0 && year % 100 == 0) {
            System.out.println(year + " - високосный год");
        } else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println(year + " - високосный год");
            } else if (year % 100 == 0) {
            System.out.println(year + " - не високосный год");
        } else {
            System.out.println(year + " - високосный год");
        }

        //Task 4
        System.out.println();
        System.out.println("Task 4");
        int deliveryDistance = 10;
        int daysAmount = 1 + (deliveryDistance + 19) / 40; {
            System.out.println("Потребууется дней: " + daysAmount);
        }
    }
}