package  Exceptions;
public class MyException extends RuntimeException{

    // public static void main(String[] args) {
    public MyException() {
        super();
    }
    public MyException(String message){
        super(message);
    }
    @Override
    public String getMessage(){
        return "This is my exception message";
    }

    public static void main(String[] args) {
        throw new MyException("I am throwing my exception");
    }
}






