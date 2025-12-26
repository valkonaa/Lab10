package university;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        // Создаём университет
        University university = new University(100);

        // Создаём факультет и декана
        Dean dean = new Dean("Иванов И.И.", "12345678901", "dean@university.ru");
        Faculty faculty = new Faculty("ФКН", dean);

        // Создаём кафедру
        Institute institute = new Institute("Кафедра ПО", "ул. Университетская, 1");

        // Создаём научного сотрудника и делаем его лектором
        Lecturer lecturer = new Lecturer("Петров П.П.", "11111111111", "petrov@university.ru", "Искусственный интеллект");
        lecturer.assignToInstitute(institute);

        // Создаём курс
        Course course = new Course("CS101", "Программирование", 4);
        lecturer.addCourse(course);

        // Создаём проект
        Project project = new Project("НИР-2025", LocalDate.of(2025, 1, 1), LocalDate.of(2025, 12, 31));
        lecturer.assignToProject(project);

        // Связываем структуру
        faculty.addInstitute(institute);
        university.addFaculty(faculty);

        // Выводим пример информации
        System.out.println("Университет: " + university.getNumberOfEmployees() + " сотрудников");
        System.out.println("Факультет: " + faculty.getName() + ", декан: " + faculty.getDean().getName());
        System.out.println("Кафедра: " + institute.getName());
        System.out.println("Преподаватель: " + lecturer.getName());
        System.out.println("Курс: " + course.getName());
        System.out.println("Проект: " + project.getName());
    }
}