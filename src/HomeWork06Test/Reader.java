package HomeWork06Test;
//Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
//
//1. ФИО,
//2. номер читательского билета,
//3. факультет,
//4. дата рождения,
//5. телефон.
//6. Методы (экземпляра, без слов static) takeBook(), returnBook().
//7. Разработать программу, в которой представлен массив объектов данного класса.
//8. Перегрузить методы takeBook(), returnBook():
//- takeBook, который будет принимать количество книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//- takeBook, который будет принимать переменное количество названных книг.
// Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//- takeBook, который будет принимать количество переменное (Тип... имя_параметра) объектов класса Book
// (создать новый класс, ожидать имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//9. Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги:
// Приключения, Словарь, Энциклопедия". Или "Петров В. В. вернул 3 книги".

public class Reader {

    String fio;
    Integer libraryCardNumber;
    String faculty;
    String date;
    String numberPhone;

    public Reader(String fio, Integer libraryCardNumber, String faculty, String date, String numberPhone) {
        this.fio = fio;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.date = date;
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fio='" + fio + '\'' +
                ", libraryCardNumber='" + libraryCardNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", date='" + date + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }

    public void takeBook() {
    }

    public void takeBook(String numberOfBook) {

        System.out.println("Петров В.В. взял " + numberOfBook + " книги");
    }

    public void takeBook(String... numberOfBooks) {
        System.out.println("Петров В.В. взял книги : ");
        for (String numberOfBook : numberOfBooks) {
            System.out.println(numberOfBook);
        }
    }

    public void takeBook(String name, String nameAutor) {
        System.out.println(name + " взял " + nameAutor + " книги");
    }

    public void returnBook(String numberOfBook) {
        System.out.println("Петров В.В. вернул " + numberOfBook + " книги");
    }

    public void returnBook(String... numberOfBooks) {
        System.out.println("Петров В.В. вернул книги : ");
        for (String numberOfBook : numberOfBooks) {
            System.out.println(numberOfBook);
        }
    }

    public void returnBook() {

    }

    public static void main(String[] args) {

        Reader[] visitor = new Reader[3];

        visitor[0] = new Reader("Астахов Алексей Андреевич", 1, "Психологии", "05.04.1992 г.", "837377474");
        visitor[1] = new Reader("Петров Валерий Александрович", 2, "Международных отношений", "24.12.2017 г.", "73447383");
        visitor[2] = new Reader("Фомичев Аркадий Валерьевич", 3, "Экономический", "15.10.2002 г.", "343433433");

        for (Reader readers : visitor) {
            System.out.println(readers);
        }
        System.out.println();
        visitor[1].takeBook("3");
        visitor[2].takeBook("Приключения", "Словарь", "Энциклопедия");
        visitor[0].takeBook("Петров В.В.", "3");
        System.out.println();
        visitor[2].returnBook("3");
        visitor[1].returnBook("Приключения", "Словарь", "Энциклопедия");

    }
}

class Book {
    String nameAutor;
    String name;

    public Book(String name, String nameAutor) {
        this.name = name;
        this.nameAutor = nameAutor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameAutor='" + nameAutor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}


