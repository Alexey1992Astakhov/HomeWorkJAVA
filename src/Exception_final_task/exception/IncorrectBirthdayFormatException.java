package Exception_final_task.exception;

/*
Исключение генерируется при некорректном вводе формате даты рождения
 */
public class IncorrectBirthdayFormatException extends RuntimeException {
    public IncorrectBirthdayFormatException(String message) {
        super(message);
    }
}
