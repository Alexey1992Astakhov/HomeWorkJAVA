package Exception_final_task.exception;

/*
Исключение генерируется при некорректном вводе пола пользователя
 */
public class SexFormatException extends RuntimeException {
    public SexFormatException(String message) {
        super(message);
    }
}
