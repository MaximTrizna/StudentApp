import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountController;
import Services.*;
import Domain.*;


public class App {
    public static void main(String[] args) throws Exception {

        // Формирование студентов

        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);

        // Формирование групп

        List<Student> listStud1 = new ArrayList<Student>();
        List<Student> listStud2 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud2.add(s3);
        listStud2.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);

        // Вывод в консоль группы 4590 и списка студентов
        System.out.println("==========Список студентов группы 4580============================================================================");

        StudentGroup group4580 = new StudentGroup(listStud1, 4580);
        System.out.println(group4580);

        for (Student std : group4580) {
            System.out.println(std);
        }

        System.out.println("=========Сортировка студентов внутри группы 4580 сначала по возрасту, потом по id=================================");

        // Сортировка студентов внутри группы 4580 сначала по возрасту, потом по id

        Collections.sort(group4580.getGroup());

        for (Student std : group4580.getGroup()) {
            System.out.println(std);
        }
//        System.out.println("=========================================================");
//
//        System.out.println(new PersonComparator<Student>().compare(s1, s2));

        System.out.println("=========Список студентов группы 4590==============================================================================");

        // Вывод в консоль группы 4590 и списка студентов

        StudentGroup group4590 = new StudentGroup(listStud2, 4590);
        System.out.println(group4590);

        for (Student std : group4590) {
            System.out.println(std);
        }

        System.out.println("==========Сортировка студентов внутри группы 4590 сначала по возрасту, потом по id==================================");

        // Сортировка студентов внутри группы 4590 сначала по возрасту, потом по id

        Collections.sort(group4590.getGroup());

        for (Student std : group4590.getGroup()) {
            System.out.println(std);
        }

        System.out.println("======Формирование потока и вывод в консоль групп из данного потока со списком студентов============================");

        // Формирование потока и вывод в консоль групп из данного потока со списком студентов

        List<StudentGroup> listSteam = new ArrayList<>();
        listSteam.add(group4580);
        listSteam.add(group4590);

        StudentSteam steam_1 = new StudentSteam(listSteam, 1);
        System.out.println(steam_1);

        for (StudentGroup stm : steam_1) {
            System.out.println(stm);
        }

        System.out.println("========Сортировка групп внутри потока по количеству студентов с выводом в консоль==================================");

        // Сортировка групп внутри потока по количеству студентов с выводом в консоль

        Collections.sort(steam_1.getSteam());

        for (StudentGroup stm : steam_1) {
            System.out.println(stm);
        }

        System.out.println("=========Формирование списка учителей и вывод в консоль с сортировкой по имени======================================");

        Teacher t1 = new Teacher("Галина Ивановна", 55, "Docent");
        Teacher t2 = new Teacher("Татьяна Семеновна", 57, "Docent");
        Teacher t3 = new Teacher("Семен Семеныч", 64, "Doctor");
        Teacher t4 = new Teacher("Аркадий Иванович", 72, "Rector");

        List<Teacher> listTeacher = new ArrayList<>();

        listTeacher.add(t1);
        listTeacher.add(t2);
        listTeacher.add(t3);
        listTeacher.add(t4);

        TeacherService teacherSort = new TeacherService();
        teacherSort.setTeachers(listTeacher);
        teacherSort.sortTeacher();

        System.out.println("========Формирование списка работников и вывод в консоль с сортировкой по имени=====================================");

        Employee e1 = new Employee("Сергей", 18, "Разнорабочий");
        Employee e2 = new Employee("Яков", 35, "Маляр");
        Employee e3 = new Employee("Алексей", 64, "Дворник");
        Employee e4 = new Employee("Федор", 48, "Сторож");
        Employee e5 = new Employee("Макар", 37, "Охранник");

        List<Employee> listEmployee = new ArrayList<>();

        listEmployee.add(e1);
        listEmployee.add(e2);
        listEmployee.add(e3);
        listEmployee.add(e4);
        listEmployee.add(e5);

        EmployeeService emplSort = new EmployeeService();
        emplSort.setEmployees(listEmployee);
        emplSort.sortEmployee();

        System.out.println("============Выдаем зарплату===========================================================================================");

        AccountController.paySalary(t1, 50000);
        AccountController.paySalary(t2, 60000);
        AccountController.paySalary(e1, 20000);

        System.out.println("============Считаем средний возраст===========================================================================================");

        AccountController.averageAge(listStud2);
        AccountController.averageAge(listTeacher);
        AccountController.averageAge(listEmployee);

    }
}
