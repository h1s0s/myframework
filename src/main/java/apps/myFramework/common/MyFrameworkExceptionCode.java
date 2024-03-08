package apps.myFramework.common;

/**
 * @fileName : MyFrameworkExceptionCode.java
 * @description : MyFramework 예외 처리 코드 Enum
 * @Author : SangSeonHan
 * @Date : 2024-03-08
 *
 * =====================================================
 *      Date    |       Auth        |    Description
 * =====================================================
 *   2024-03-08      SangSeonHan           최초생성
 */
public enum MyFrameworkExceptionCode{
    SUCCESS(200, "Success."),
    DATA_NOT_FOUND(404, "Not Found."),
    SERVER_ERROR(500, "Server Error.");

    private final int code;
    private final String message;

    MyFrameworkExceptionCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
