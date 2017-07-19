public class TextNotification extends notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        sometext();

    }


    @Override
    public void transport() {
        System.out.println(getCreatedAt());
        System.out.println(this.recipient);
        System.out.println(this.smsProvider);
        System.out.println(getBody());
        System.out.println(getSubject());
    }
}
