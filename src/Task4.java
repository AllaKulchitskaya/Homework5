public class Task4 {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("На доставку потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("На доставку потребуется дней: " + (deliveryTime + 1));
        }
        else {
            System.out.println("На доставку потребуется дней: " + (deliveryTime + 2));
        }
    }
}
