public class Task2 {
    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2000;
        appVersion(clientOS, clientDeviceYear);
    }

    public static void appVersion(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
}
