package Exception_final_task.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import Exception_final_task.model.User;

public class DataWriterToFile implements DataServices {
    private User user;
    private String path;

    public DataWriterToFile(String input) {
        this.user = new DataHandler().inputUserData(input); // получили строку из входящих данных(из консоли)
        this.path = user.getLastName(); // прописываем имя файла, как в условии (Фамилия пользователя)
    }

    @Override
    public void writeUserData() {
        boolean value = checkExistFile(String.format("src/Exception_final_task/users_store/%s.txt", path));
        StringBuilder sb = new StringBuilder(); // объект StringBuilder для удобства работы со строкой

        // если файл существует, дописываем в него данные, иначе создаем новый
        try (FileWriter fw = new FileWriter(String.format("src/Exception_final_task/users_store/%s.txt", path), value)) {

            // помещаем все данные о пользователе в обЪект StringBuilder
            sb.append("<").append(user.getLastName()).append(">");
            sb.append("<").append(user.getFirstName()).append(">");
            sb.append("<").append(user.getMiddleName()).append(">");
            sb.append("<").append(user.getBirthday()).append(">");
            sb.append("<").append(user.getPhone()).append(">");
            sb.append("<").append(user.getSex()).append(">");

            if (value) { // если файл существует, записываем данные с новой строки
                fw.write("\n");
            }
            fw.write(sb.toString()); // записываем данные в файл
            fw.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // проверка существования файла
    private boolean checkExistFile(String path) {
        File file = new File(path);
        return file.exists();
    }

}
