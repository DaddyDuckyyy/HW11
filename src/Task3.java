public class Task3 {
    public static void main(String[] args) {
        int deliveryDistance = 21;
        if (deliveryDistance <= 100) {
            Task3.deliveryDays(67);
        }
    }

    public static int deliveryDays(int deliveryDistance) {
        int days = 1;

        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
        }
        return days;
    }
}
