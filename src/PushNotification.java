public class PushNotification implements NotificationService {
    String message;
    @Override
    public void sendNotification(String message){
        System.out.println("Sending Push Notification: "+ message);
    }

}
