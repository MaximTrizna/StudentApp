package Services;

import Domain.PersonComparator;
import Domain.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService extends PersonComparator<Teacher> implements iPersonService<Teacher> {

    private int count;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher t3 = new Teacher(name, age, "doctor");
        count++;
        teachers.add(t3);
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    public void sortTeacher()
    {
        PersonComparator<Teacher> persComp = new PersonComparator<>();
        teachers.sort(persComp);
        System.out.println("Teachers: " + teachers);
    }

}
