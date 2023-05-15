public class TelegramObserver extends Observer{

    public TelegramObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "sending telegram message to subscribers: " +  subject.getState() );
    }
}