import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;

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

        StudentGroup group4580 = new StudentGroup(listStud1, 4580);
        System.out.println(group4580);

        for (Student std : group4580) {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        // Сортировка студентов внутри группы 4580 сначала по возрасту, потом по id

        Collections.sort(group4580.getGroup());

        for (Student std : group4580.getGroup()) {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        // Вывод в консоль группы 4590 и списка студентов

        StudentGroup group4590 = new StudentGroup(listStud2, 4590);
        System.out.println(group4590);

        for (Student std : group4590) {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        // Сортировка студентов внутри группы 4590 сначала по возрасту, потом по id

        Collections.sort(group4590.getGroup());

        for (Student std : group4590.getGroup()) {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        // Формирование потока и вывод в консоль групп из данного потока со списком студентов

        List<StudentGroup> listSteam = new ArrayList<>();
        listSteam.add(group4580);
        listSteam.add(group4590);

        StudentSteam steam_1 = new StudentSteam(listSteam, 1);
        System.out.println(steam_1);

        for (StudentGroup stm : steam_1) {
            System.out.println(stm);
        }

        System.out.println("=========================================================");

        // Сортировка групп внутри потока по количеству студентов с выводом в консоль

        Collections.sort(steam_1.getSteam());

        for (StudentGroup stm : steam_1) {
            System.out.println(stm);
        }
    }
}
