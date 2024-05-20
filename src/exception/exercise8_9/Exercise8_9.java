package exception.exercise8_9;

public class Exercise8_9 {
    public static void main(String[] args) throws UnsupportedFunctionException {
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
    }

}
