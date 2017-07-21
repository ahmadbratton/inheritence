public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        status = "this is email status";
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new EmailNotification(getSubject(), getBody(), this.getRecipient(),this.getSmtpProvider());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailNotification)) return false;

        EmailNotification that = (EmailNotification) o;

        if (getRecipient() != null ? !getRecipient().equals(that.getRecipient()) : that.getRecipient() != null)
            return false;
        return getSmtpProvider() != null ? getSmtpProvider().equals(that.getSmtpProvider()) : that.getSmtpProvider() == null;
    }

    @Override
    public int hashCode() {
        int result = getRecipient() != null ? getRecipient().hashCode() : 0;
        result = 31 * result + (getSmtpProvider() != null ? getSmtpProvider().hashCode() : 0);
        return result;
    }

    @Override
    public void transport() {
        System.out.println(getCreatedAt());
        System.out.println(getRecipient());
        System.out.println(getSmtpProvider());
        System.out.println(getBody());
        System.out.println(getSubject());
        System.out.println(getStatus());
    }

    @Override
    protected void sometext() {
        super.sometext();
        System.out.println("im sending some text");
    }



}
