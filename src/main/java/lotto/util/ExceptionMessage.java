package lotto.util;

public enum ExceptionMessage {

    NOT_NUMERIC("숫자로 입력하세요."),
    NOT_IN_RANNGE_OF_BUDGET("구매 금액은 1000원부터 10만원까지 입력 가능합니다."),
    INVALID_RANGE("1부터 45까지의 숫자만 입력 가능합니다.");

    public static final String BASE_MESSAGE = "[ERROR] %s";
    private final String message;

    ExceptionMessage(String message) {
        this.message = String.format(BASE_MESSAGE, message);
    }

    public String getMessage() {
        return message;
    }

}
