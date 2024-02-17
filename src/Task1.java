public class Task1 {
    public static void main(String[] args) {
        leapYear(2023);
    }

    public static void leapYear(int year) {
        if (year >= 1584) {
            if ((year % 400 == 0) || (year % 4 == 0) || (year % 100 != 0)) {
                System.out.println(year + " год — високосный");
            } else {
                System.out.println(year + " год — невисокосный");
            }
        } else {
            System.out.println(year + " год — невисокосный");
        }
    }
}
