package exception.exercise8_9;

public class UnsupportedFunctionException extends RuntimeException {
    final private int ERR_CODE;

    UnsupportedFunctionException(String msg, int code) {
        super(msg);
        ERR_CODE = code;
    }

    UnsupportedFunctionException(String msg) {
        this(msg, 100); // ERR_CODE 초기값 100으로 설정
    }

    public int getERR_CODE() {
        return ERR_CODE;
    }

    @Override
    public String getMessage() {
//        return "[" + ERR_CODE + "]" + super.getMessage();
        return "[" + getERR_CODE() + "]" + super.getMessage();
    }
}
