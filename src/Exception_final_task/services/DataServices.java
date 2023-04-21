package Exception_final_task.services;

/*
интерфейс, на случай если нужно будет отправлять данные в другое хранилище
например, если в дальнейшем мы захотим сохранить наши данные в БД
 */
public interface DataServices {

    void writeUserData();
}
