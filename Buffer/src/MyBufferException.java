public class MyBufferException extends Exception implements MyBufferExceptionable {

    private String message;

    public MyBufferException(){
        super();

    }

    public MyBufferException(String message) {
        super(message);

        this.message() = message;
    }


    public String getMessage() { return message;} }

}