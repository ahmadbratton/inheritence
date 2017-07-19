public class TextNotification extends notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        sometext();

    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() {
        System.out.println(getCreatedAt());
        System.out.println(getRecipient());
        System.out.println(getSmsProvider());
        System.out.println(getBody());
        System.out.println(getSubject());
    }
}
