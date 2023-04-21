package Exception_final_task.exception;

/*
Исключение генерируется при некорректном вводе формате телефона пользователя
 */
public class PhoneFormatException extends RuntimeException {
    public PhoneFormatException(String message) {
        super(message);
    }
}
