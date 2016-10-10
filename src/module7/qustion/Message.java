package module7.qustion;

public class Message implements Comparable<Message>{
    private String message;
    private String device;

    public Message(String message, String device) {
        this.message = message;
        this.device = device;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", device='" + device + '\'' +
                '}';
    }

    @Override
    public int compareTo(Message message) {
        return this.message.length() - message.getMessage().length();
    }

    public String getMessage() {
        return message;
    }

    public String getDevice() {
        return device;
    }


}
