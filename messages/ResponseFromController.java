package messages;

public class ResponseFromController {

    public String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ResponseFromController()
    {
        System.out.println("Ho costruito new messages.ResponseFromController()");
    }
}
