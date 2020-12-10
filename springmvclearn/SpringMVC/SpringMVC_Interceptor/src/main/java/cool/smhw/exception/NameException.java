package cool.smhw.exception;


//作用：当用户的姓名有错误时抛出异常
public class NameException extends StudentException {
    public NameException() {
        super();
    }

    public NameException(String message) {
        super(message);
    }
}
