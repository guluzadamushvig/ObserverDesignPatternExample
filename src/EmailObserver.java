public class EmailObserver extends Observer{

    public EmailObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "sending email message to subscribers " +  subject.getState());
    }
}