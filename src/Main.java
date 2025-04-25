public class Main {
    public static void main(String[] args) {
        NotificationService push = new PushNotification();
        push.sendNotification("You have a new message.");
    }
}