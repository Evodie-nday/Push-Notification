public class Main {
    public static void main(String[] args) {
        NotificationService push = new PushNotification();
        NotificationService email = new EmailNotification();
        NotificationService SMS = new SMSNotification();
        push.sendNotification("You have a new message.");
        email.sendNotification("You have new Unread email.");
        SMS.sendNotification("You have new Unread SMS.");
    }
}