public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android  по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        }
        System.out.println();
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println();
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else {
            System.out.println("Потребуется дней: 3");
        }

        System.out.println();
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber+ "й месяц - это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber+ "й месяц - это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber+ "й месяц - это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber+ "й месяц - это осень");
                break;
            default:
                System.out.println("такого месяца в году не существует");
        }
    }
}
