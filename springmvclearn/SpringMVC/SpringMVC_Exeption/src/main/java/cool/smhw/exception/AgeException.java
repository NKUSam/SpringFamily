package cool.smhw.exception;


//作用：当用户的年龄有错误时抛出异常
public class AgeException extends StudentException {
    public AgeException() {
        super();
    }

    public AgeException(String message) {
        super(message);
    }
}
