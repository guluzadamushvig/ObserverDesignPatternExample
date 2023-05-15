public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new EmailObserver(subject);
        new TelegramObserver(subject);

        System.out.println("First state change: Iphone 14");
        subject.setState("Iphone 14 is available");
        System.out.println("Second state change: Ipad");
        subject.setState("Iphone 14 is available");
    }
}
