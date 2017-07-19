import java.time.LocalDateTime;


public class notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;


    public notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
        this.status = "Whats up mane";
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }
    public void showStatus(){
        System.out.println(this.status);
    }

    protected void sometext(){
        System.out.println("this is some text");

    }

    public void transport(){
        throw new NoTransportException();

    }


}
