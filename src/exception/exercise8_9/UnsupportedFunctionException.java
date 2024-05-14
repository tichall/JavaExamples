package exception.exercise8_9;

public class UnsupportedFunctionException extends RuntimeException {
    final private int ERR_CODE;

    public UnsupportedFunctionException(String msg, int code) {
        super(msg);
        ERR_CODE = code;
    }

    public int getERR_CODE() {
        return ERR_CODE;
    }

    @Override
    public String getMessage() {
        return "[" + ERR_CODE + "]" + super.getMessage();
    }
}
